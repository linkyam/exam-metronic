/**
 * Created by Administrator on 16-2-20.
 */
jQuery(document).ready(function() {



    /**
     * 初始学院信息下拉框
     */
    initCollegeSelect("collegeIdSearch");


    /**
     * 初始学制信息下拉框
     */
    initSpeYearSelect("speYearSearch");


    $('#myModal1').on('shown.bs.modal', function () {
        $.fn.modal.Constructor.prototype.enforceFocus = function() {}
        initCollegeSelect("collegeId");
        initSpeYearSelect("speyearsId");
    })

    /*$('.select2_category').select2({
        placeholder: "Select an option",
        allowClear: true
    });*/

    /**
     * 初始化列表
     */
    initSpecialityInfoTableList();
    /**
     * 绑定查询事件
     */
    $("#searchBtn").on("click",function(){
        initSpecialityInfoTableList();
    });
    /**
     * 初始日期控件
     */
    $(".date-picker").datepicker({

    });
    /**
     * 绑定form验证插件
     */
    $('#insertForm').validate({
        errorElement: 'label', //default input error message container
        errorClass: 'help-inline', // default input error message class
        focusInvalid: false, // do not focus the last invalid input
        rules: {
            specialityName: {
                required: true,
                maxlength:50
            },
            collegeId :{
                required: true
            },

            speyearsId:{
                required: true
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
            specialityName: {
                required: "请填写专业的名称。",
                maxlength: "学院名称不超过50个汉字。"
            },
            collegeId :{
                required: "请选择所属学院。"
            },

            speyearsId:{
                required: "请选择专业的学制。"
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
        $('#insertForm').submit();
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
    $("#specialityInfoTable").on('click', '#delCollege', function () {
        var data = $("#specialityInfoTable").DataTable().row($(this).parents("tr")).data();
        com.msg.confirm("警告","此操作将删除"+data.collegeName+"所有信息！",function(){
            com.ajax.jsonGet("/speciality/delById?specialityId="+data.specialityId,"",function(res){
                initCollegeTableList();
            });
        });

    });
});

function initCollegeSelect(id) {
    com.ajax.jsonGet("/college/getAllColleges","",function(result){
        var data=result.data;
        if(data){
            var str="";
            for(var i in data){
                var jsonObj=data[i];
                str+="<option value=\"" + jsonObj.collegeId + "\" >" + jsonObj.collegeName + "</option>";
            }
            $("#"+id).html("<option value=''>请选择学院...</option> "+str);
        }
        $("#"+id).select2({
            placeholder: "Select an option",
            allowClear: true
        });
    });
}

function initSpeYearSelect(id){
    com.ajax.jsonGet("/speYears/getAllSpeYears","",function(result){
        var data=result.data;
        if(data){
            var str="";
            for(var i in data){
                var jsonObj=data[i];
                str+="<option value=\"" + jsonObj.speyearsId + "\" >" + jsonObj.speyearsName + "</option>";
            }
            $("#"+id).html("<option value=''>请选择学制...</option> "+str);
        }
        $("#"+id).select2({
            placeholder: "Select an option",
            allowClear: true
        });
    });
}

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
var initSpecialityInfoTableList = function () {
    if (oTable == null) { //仅第一次检索时初始化Datatable
        oTable = $('#specialityInfoTable').dataTable({
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
            "sAjaxSource": "/speciality/getBySearch",// get地址
            "fnServerData": retrieveData,//执行方法
            //向服务器传额外的参数
            "fnServerParams": function (aoData) {
                aoData.push(
                    { "name": "specialityName", "value": $('#speNameSearch').val() },
                    { "name": "collegeId", "value": $('#collegeIdSearch').val() },
                    { "name": "speyearsId", "value": $('#speYearSearch').val() }
                )
            },
            //配置列要显示的数据
            "aoColumns": [
                { "data":   "specialityId" ,"visible": false},
                { "data":   "specialityName" },
                { "data":   "collegeName" },
                { "data":   "speyearsName" },
                { "data":   "comment"},//{ "data": "userId","visible": false},
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


