<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>考试中心</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/font-awesome.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/style-metro.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/style-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/default.css" id="style_color"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/uniform.default.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/jquery.gritter.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/daterangepicker.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/fullcalendar.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/jqvmap.css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/media/css/jquery.easy-pie-chart.css"
          media="screen"/>

    <link rel="shortcut icon" href="<%=request.getContextPath()%>/media/image/favicon.ico"/>

    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery-ui-1.10.1.custom.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/excanvas.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/respond.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.slimscroll.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.blockui.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.cookie.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.uniform.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.vmap.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.vmap.russia.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.vmap.world.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.vmap.europe.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.vmap.germany.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.vmap.usa.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.vmap.sampledata.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.flot.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.flot.resize.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.pulsate.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/date.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/daterangepicker.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/fullcalendar.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.easy-pie-chart.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/jquery.sparkline.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/public.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/app.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/media/js/index.js"></script>
</head>
<body class="page-header-fixed page-footer-fixed">

<!-- ##################BEGIN HEADER ##################-->
<div class="header navbar navbar-inverse navbar-fixed-top">
    <!-- 开始 头部信息 BAR -->
    <div class="navbar-inner">
        <div class="container-fluid">
            <!-- BEGIN LOGO -->
            <a class="brand" href="index.jsp">
                <img src="<%=request.getContextPath()%>/media/image/logo.png" alt="logo"/>
            </a>
            <!-- END LOGO -->
            <!-- BEGIN RESPONSIVE MENU TOGGLER -->
            <a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
                <img src="<%=request.getContextPath()%>/media/image/menu-toggler.png" alt=""/>
            </a>
            <!-- END RESPONSIVE MENU TOGGLER -->
            <!-- BEGIN TOP NAVIGATION MENU -->
            <ul class="nav pull-right">
                <!-- BEGIN NOTIFICATION DROPDOWN -->

                <!-- END NOTIFICATION DROPDOWN -->

                <!-- BEGIN INBOX DROPDOWN -->

                <!-- END INBOX DROPDOWN -->

                <!-- BEGIN TODO DROPDOWN -->

                <!-- END TODO DROPDOWN -->
                <!-- BEGIN USER LOGIN DROPDOWN -->
                <li class="dropdown user">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img alt="" src="<%=request.getContextPath()%>/media/image/avatar1_small.jpg"/>F
                        <span class="username">Bob Nilson</span>
                        <i class="icon-angle-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="extra_profile.html"><i class="icon-user"></i> My Profile</a></li>
                        <li><a href="page_calendar.html"><i class="icon-calendar"></i> My Calendar</a></li>
                        <li><a href="inbox.html"><i class="icon-envelope"></i> My Inbox(3)</a></li>
                        <li><a href="#"><i class="icon-tasks"></i> My Tasks</a></li>
                        <li class="divider"></li>
                        <li><a href="extra_lock.html"><i class="icon-lock"></i> Lock Screen</a></li>
                        <li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
                    </ul>
                </li>
                <!-- END USER LOGIN DROPDOWN -->
            </ul>
            <!-- END TOP NAVIGATION MENU -->
        </div>
    </div>
    <!-- 结束 头部信息 BAR -->
</div>
<!-- ##################END HEADER #################-->


<!-- BEGIN CONTAINER -->
<div class="page-container">

    <!-- BEGIN SIDEBAR -->
    <div class="page-sidebar nav-collapse collapse">
        <!-- BEGIN SIDEBAR MENU -->
        <ul class="page-sidebar-menu" id="menu">
            <li>
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                <div class="sidebar-toggler hidden-phone"></div>
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
            </li>

            <li class="start active">
                <a href="javascript:;" value="/views/welcome.html">
                    <i class="icon-home"></i>
                    <span class="title">首页</span>
                    <span class="selected"></span>
                </a>
            </li>
        </ul>
        <!-- END SIDEBAR MENU -->
    </div>
    <!-- END SIDEBAR -->


    <!-- BEGIN PAGE -->
    <div class="page-content">

        <!-- BEGIN PAGE CONTAINER-->
        <div class="container-fluid">
            <!-- BEGIN PAGE HEADER-->
            <div class="row-fluid">
                <div class="span12">
                    <!-- BEGIN 样式工具 -->

                    <!-- END 样式工具 -->

                    <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                    <iframe src="welcome.html" id="iframepage" scrolling="no" marginheight="0"
                            marginwidth="0" frameborder="0" style="padding: 0px; width: 100%;height: 885px"></iframe>
                    <!-- END PAGE TITLE & BREADCRUMB-->
                </div>
            </div>
            <!-- END PAGE HEADER-->

        </div>
        <!-- END PAGE CONTAINER-->
    </div>
    <!-- END PAGE -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="footer">
    <div class="footer-inner">
        2013 &copy; Metronic by keenthemes.
    </div>
    <div class="footer-tools">
			<span class="go-top">
			<i class="icon-angle-up"></i>
			</span>
    </div>
</div>
<!-- END FOOTER -->
</body>
<!-- END BODY -->
</html>