$(document).ready(function() {
    $('.login-form').validate({
        errorElement: 'label', //default input error message container
        errorClass: 'help-inline', // default input error message class
        focusInvalid: false, // do not focus the last invalid input
        rules: {
            loginId: {
                required: true
            },
            pwd: {
                required: true
            }
        },

        messages: {
            loginId: {
                required: "请填写登录帐号。"
            },
            pwd: {
                required: "请填写登录密码。"
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




    $('.forget-form').validate({
        errorElement: 'label', //default input error message container
        errorClass: 'help-inline', // default input error message class
        focusInvalid: false, // do not focus the last invalid input
        ignore: "",
        rules: {
            email: {
                required: true,
                email: true
            }
        },

        messages: {
            email: {
                required: "Email 是必填项。"
            }
        },

        invalidHandler: function (event, validator) { //display error alert on form submit

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

        }
    });

    $('#forget-password').click(function () {
        $('.login-form').hide();
        $('.forget-form').show();
    });

    $('#back-btn').click(function () {
        $('.login-form').show();
        $('.forget-form').hide();
    });
});


//将form转为AJAX提交
function ajaxSubmit(frm) {
    var dataPara = getFormJson(frm);
    com.ajax.jsonPost("/log/userLogin",dataPara,function(data){
        if(data.code==com.ajax.jsonResult.success){
            com.ui.showSuccess("#showMsg","登录成功，正在跳转！");
            window.location.href=com.appRootUrl+"/views/index.jsp";
        }else{
            com.ui.showError("#showMsg",data.message);
        }
    });
}

