<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>考试中心登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/media/css/bootstrap.min.css"/>
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/media/css/font-awesome.min.css"/>
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/media/css/style-metro.css"/>
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/media/css/style.css"/>
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/media/css/default.css"/>
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/media/css/uniform.default.css"/>
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/media/css/login.css"/>

    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery-1.10.1.min.js" ></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/bootstrap.min.js" ></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.cookie.min.js" ></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.validate.min.js" ></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/public.js" ></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/login.js" ></script>

    <link rel="shortcut icon" href="<%=request.getContextPath()%>/media/image/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
<!-- BEGIN LOGO -->
<div class="logo">
    <img src="media/image/logo-big.png" alt="" />
</div>
<!-- END LOGO -->
<!-- BEGIN LOGIN -->
<div class="content">
    <!-- BEGIN LOGIN FORM -->
    <form class="form-vertical login-form" action="" id="loginForm">
        <h3 class="form-title">帐号登录</h3>
        <div class="control-group">
            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
            <label class="control-label visible-ie8 visible-ie9">登录帐号</label>
            <div class="controls">
                <div class="input-icon left">
                    <i class="icon-user"></i>
                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="登录帐号" name="loginId" id="loginId"/>
                </div>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label visible-ie8 visible-ie9">登录密码</label>
            <div class="controls">
                <div class="input-icon left">
                    <i class="icon-lock"></i>
                    <input class="m-wrap placeholder-no-fix" type="password" placeholder="登录密码" name="pwd" id="pwd"/>
                </div>
            </div>
        </div>
        <div class="form-actions">
            <%--<label class="checkbox">
                <input type="checkbox" name="remember" value="1"/> Remember me
            </label>--%>
            <p><a href="javascript:;" class="" id="forget-password">忘记密码</a></p>
            <button type="submit" class="btn green pull-right">
                登录 <i class="m-icon-swapright m-icon-white"></i>
            </button>
        </div>
        <div id="showMsg"></div>
        <%--<div class="forget-password">
            <h4>Forgot your password ?</h4>
            <p>
                no worries, click <a href="javascript:;" class="" id="forget-password">here</a>
                to reset your password.
            </p>
        </div>
        <div class="create-account">
            <p>
                Don't have an account yet ?&nbsp;
                <a href="javascript:;" id="register-btn" class="">Create an account</a>
            </p>
        </div>--%>
    </form>
    <!-- END LOGIN FORM -->
    <!-- BEGIN FORGOT PASSWORD FORM -->
    <form class="form-vertical forget-form" action="">
        <h3 class="">忘记密码?</h3>
        <p>输入email邮箱重设密码</p>
        <div class="control-group">
            <div class="controls">
                <div class="input-icon left">
                    <i class="icon-envelope"></i>
                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="Email" name="email" />
                </div>
            </div>
        </div>
        <div class="form-actions">
            <button type="button" id="back-btn" class="btn">
                <i class="m-icon-swapleft"></i> 返回
            </button>
            <button type="submit" class="btn green pull-right">
                提交 <i class="m-icon-swapright m-icon-white"></i>
            </button>
        </div>
    </form>
    <!-- END FORGOT PASSWORD FORM -->
    <!-- BEGIN REGISTRATION FORM -->
    <%--<form class="form-vertical register-form" action="">
        <h3 class="">Sign Up</h3>
        <p>Enter your account details below:</p>
        <div class="control-group">
            <label class="control-label visible-ie8 visible-ie9">Username</label>
            <div class="controls">
                <div class="input-icon left">
                    <i class="icon-user"></i>
                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="Username" name="username"/>
                </div>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label visible-ie8 visible-ie9">Password</label>
            <div class="controls">
                <div class="input-icon left">
                    <i class="icon-lock"></i>
                    <input class="m-wrap placeholder-no-fix" type="password" id="register_password" placeholder="Password" name="password"/>
                </div>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label visible-ie8 visible-ie9">Re-type Your Password</label>
            <div class="controls">
                <div class="input-icon left">
                    <i class="icon-ok"></i>
                    <input class="m-wrap placeholder-no-fix" type="password" placeholder="Re-type Your Password" name="rpassword"/>
                </div>
            </div>
        </div>
        <div class="control-group">
            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
            <label class="control-label visible-ie8 visible-ie9">Email</label>
            <div class="controls">
                <div class="input-icon left">
                    <i class="icon-envelope"></i>
                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="Email" name="email"/>
                </div>
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <label class="checkbox">
                    <input type="checkbox" name="tnc"/> I agree to the <a href="#">Terms of Service</a> and <a href="#">Privacy Policy</a>
                </label>
                <div id="register_tnc_error"></div>
            </div>
        </div>
        <div class="form-actions">
            <button id="register-back-btn" type="button" class="btn">
                <i class="m-icon-swapleft"></i>  Back
            </button>
            <button type="submit" id="register-submit-btn" class="btn green pull-right">
                Sign Up <i class="m-icon-swapright m-icon-white"></i>
            </button>
        </div>
    </form>--%>
    <!-- END REGISTRATION FORM -->
</div>
<!-- END LOGIN -->
<!-- BEGIN COPYRIGHT -->
<div class="copyright">
    2013 &copy; Metronic. Admin Dashboard Template.
</div>

</body>

</html>
