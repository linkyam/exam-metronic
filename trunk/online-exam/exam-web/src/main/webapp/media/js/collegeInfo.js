/**
 * Created by Administrator on 16-2-20.
 */
jQuery(document).ready(function() {

    /**
     * 初始化列表
     */
    initCollegeTableList();
    /**
     * 绑定查询事件
     */
    $("#searchBtn").on("click",function(){
        initCollegeTableList();
    });
    /**
     * 初始日期控件
     */
    $(".date-picker").datepicker({

    });
    /**
     * 绑定form验证插件
     */
    $('#collegeInfoForm').validate({
        errorElement: 'label', //default input error message container
        errorClass: 'help-inline', // default input error message class
        focusInvalid: false, // do not focus the last invalid input
        rules: {
            collegeName: {
                required: true,
                maxlength:50
            },
            comment: {
                required: false,
                maxlength:200

            },
            createDate: {
                required: true
            }
        },

        messages: {
            collegeName: {
                required: "请填写学院名称。",
                maxlength: "学院名称不超过50个汉字。"
            },
            comment: {
                maxlength: "学院介绍不超过100个汉字。"
            },
            createDate: {
                required: "请选择学院创建时间。"
            }
        },

        invalidHandler: function (event, validator) { //display error alert on form submit
            $('.alert-error', $('.login-form')).show();
        },

        highlight: function (element) { // hightlight error inputs
            $(element)
                .closest('.control-group').addClass('error'); // set error class to the control group
        },

        success: function (label) {
            label.closest('.control-group').removeClass('error');
            label.remove();
        },

        errorPlacement: function (error, element) {
            error.addClass('help-small no-left-padding').insertAfter(element.closest('.input-icon'));
        },

        submitHandler: function (form) {
            ajaxSubmit(form);
        }
    });

    /**
     * 绑定保存按钮的form ajax提交
     */
    $('#saveBtn').on("click",function(){
        $('#collegeInfoForm').submit();
    });
    /**
     *  绑定日期控件的更改事件
     */
    $('#createDate').bind("change",function(){
        $('#createDate').blur();
    });
    /**
     *  绑定删除事件
     */
    $("#collegeTable").on('click', '#delCollege', function () {
        var data = $("#collegeTable").DataTable().row($(this).parents("tr")).data();
        com.msg.confirm("警告","此操作将删除"+data.collegeName+"所有信息！",function(){
            com.ajax.jsonGet("/college/delById?collegeId="+data.collegeId,"",function(res){
                initCollegeTableList();
            });
        });

    });
});




function ajaxSubmit(frm) {
    var dataPara = getFormJson(frm);
    dataPara.createDate=new Date(dataPara.createDate)
    com.ajax.jsonPost("/college/addColleges",dataPara,function(data){
        if(data.code==com.ajax.jsonResult.success){
            com.ui.showError("#msg","新增学院信息成功！");
            cleanForm();
            initCollegeTableList();
        }else{
            com.ui.showError("#msg",data.message);
        }
    });
}
function cleanForm(){
    $('#collegeName').val("");
    $('#createDate').val("");
    $('#comment').val("");
}


var oTable = null;
var initCollegeTableList = function () {
    if (oTable == null) { //仅第一次检索时初始化Datatable
        oTable = $('#collegeTable').dataTable({
            "bLengthChange": false,
            "bFilter": false,
            "bProcessing": true,
            "bServerSide": true,
            "iDisplayLength": 15,
            //"scrollY": "590px",
            //"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
            "sPaginationType": "full_numbers",
            "bSort": false,
            "bAutoWidth": false,
            "scrollCollapse":true,
            //ajax地址
            "sAjaxSource": "/college/getCollegesBySearch",// get地址
            "fnServerData": retrieveData,//执行方法
            //向服务器传额外的参数
            "fnServerParams": function (aoData) {
                aoData.push(
                    { "name": "collegeName", "value": $('#collegeNameSch').val() }
                )
            },
            //配置列要显示的数据
            "aoColumns": [
                { "data":   "collegeId" ,"visible": false},
                { "data":   "collegeName" },
                { "data":   "comment"},//{ "data": "userId","visible": false},
                { "data":   function(obj){
                    var date=obj.createDate;
                    if(date){
                        return date.replace("00:00:00","");
                    }else{
                        return "";
                    }
                }},
                { "data":   function(){
                    return "<a helf='#' class='btn red mini' id='delCollege'><i class='icon-trash'></i> 删除信息</a>"
                }}

            ],
            "aoColumnDefs": [{
                'bSortable': false,
                'aTargets': [0]
            }
            ],
            "oLanguage": {
                "sUrl":"chinese.json"
            }
        });
    }
    oTable.fnDraw();
}

function retrieveData(sSource, aoData, fnCallback) {
    com.ajax.jsonGet(sSource,aoData,fnCallback);

}


