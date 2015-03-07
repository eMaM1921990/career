<%-- 
    Document   : home
    Created on : Jan 9, 2015, 8:41:12 PM
    Author     : emam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <!-- Apple devices fullscreen -->
        <meta name="apple-mobile-web-app-capable" content="yes" />
        <!-- Apple devices fullscreen -->
        <meta names="apple-mobile-web-app-status-bar-style" content="black-translucent" />

        <title>Your Dashboard</title>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Bootstrap responsive -->
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css">
        <!-- jQuery UI -->
        <link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery-ui.css">
        <link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery.ui.theme.css">
        <!-- PageGuide -->
        <link rel="stylesheet" href="css/plugins/pageguide/pageguide.css">
        <!-- Fullcalendar -->
        <link rel="stylesheet" href="css/plugins/fullcalendar/fullcalendar.css">
        <link rel="stylesheet" href="css/plugins/fullcalendar/fullcalendar.print.css" media="print">
        <!-- Tagsinput -->
        <link rel="stylesheet" href="css/plugins/tagsinput/jquery.tagsinput.css">
        <!-- chosen -->
        <link rel="stylesheet" href="css/plugins/chosen/chosen.css">
        <!-- multi select -->
        <link rel="stylesheet" href="css/plugins/multiselect/multi-select.css">
        <!-- timepicker -->
        <link rel="stylesheet" href="css/plugins/timepicker/bootstrap-timepicker.min.css">
        <!-- colorpicker -->
        <link rel="stylesheet" href="css/plugins/colorpicker/colorpicker.css">
        <!-- Datepicker -->
        <link rel="stylesheet" href="css/plugins/datepicker/datepicker.css">
        <!-- Daterangepicker -->
        <link rel="stylesheet" href="css/plugins/daterangepicker/daterangepicker.css">
        <!-- Plupload -->
        <link rel="stylesheet" href="css/plugins/plupload/jquery.plupload.queue.css">
        <!-- select2 -->
        <link rel="stylesheet" href="css/plugins/select2/select2.css">
        <!-- icheck -->
        <link rel="stylesheet" href="css/plugins/icheck/all.css">
        <!-- Theme CSS -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Color CSS -->
        <link rel="stylesheet" href="css/themes.css">

        <!-- Easy pie  -->
        <link rel="stylesheet" href="css/plugins/easy-pie-chart/jquery.easy-pie-chart.css">


        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>

        <!-- Nice Scroll -->
        <script src="js/plugins/nicescroll/jquery.nicescroll.min.js"></script>
        <!-- imagesLoaded -->
        <script src="js/plugins/imagesLoaded/jquery.imagesloaded.min.js"></script>
        <!-- jQuery UI -->
        <script src="js/plugins/jquery-ui/jquery.ui.core.min.js"></script>
        <script src="js/plugins/jquery-ui/jquery.ui.widget.min.js"></script>
        <script src="js/plugins/jquery-ui/jquery.ui.mouse.min.js"></script>
        <script src="js/plugins/jquery-ui/jquery.ui.resizable.min.js"></script>
        <script src="js/plugins/jquery-ui/jquery.ui.sortable.min.js"></script>
        <script src="js/plugins/jquery-ui/jquery.ui.spinner.js"></script>
        <script src="js/plugins/jquery-ui/jquery.ui.slider.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Bootbox -->
        <script src="js/plugins/bootbox/jquery.bootbox.js"></script>
        <!-- Masked inputs -->
        <script src="js/plugins/maskedinput/jquery.maskedinput.min.js"></script>
        <!-- TagsInput -->
        <script src="js/plugins/tagsinput/jquery.tagsinput.min.js"></script>
        <!-- Datepicker -->
        <script src="js/plugins/datepicker/bootstrap-datepicker.js"></script>
        <!-- Daterangepicker -->
        <script src="js/plugins/daterangepicker/daterangepicker.js"></script>
        <script src="js/plugins/daterangepicker/moment.min.js"></script>
        <!-- Timepicker -->
        <script src="js/plugins/timepicker/bootstrap-timepicker.min.js"></script>
        <!-- Colorpicker -->
        <script src="js/plugins/colorpicker/bootstrap-colorpicker.js"></script>
        <!-- Chosen -->
        <script src="js/plugins/chosen/chosen.jquery.min.js"></script>
        <!-- MultiSelect -->
        <script src="js/plugins/multiselect/jquery.multi-select.js"></script>
        <!-- CKEditor -->
        <script src="js/plugins/ckeditor/ckeditor.js"></script>
        <!-- PLUpload -->
        <script src="js/plugins/plupload/plupload.full.js"></script>
        <script src="js/plugins/plupload/jquery.plupload.queue.js"></script>
        <!-- Custom file upload -->
        <script src="js/plugins/fileupload/bootstrap-fileupload.min.js"></script>
        <script src="js/plugins/mockjax/jquery.mockjax.js"></script>
        <!-- select2 -->
        <script src="js/plugins/select2/select2.min.js"></script>
        <!-- icheck -->
        <script src="js/plugins/icheck/jquery.icheck.min.js"></script>
        <!-- complexify -->
        <script src="js/plugins/complexify/jquery.complexify-banlist.min.js"></script>
        <script src="js/plugins/complexify/jquery.complexify.min.js"></script>
        <!-- Mockjax -->
        <script src="js/plugins/mockjax/jquery.mockjax.js"></script>

        <!-- Easy pie -->
        <script src="js/plugins/easy-pie-chart/jquery.easy-pie-chart.min.js"></script>
        <!-- Flot -->
        <script src="js/plugins/flot/jquery.flot.min.js"></script>
        <script src="js/plugins/flot/jquery.flot.resize.min.js"></script>

        <!-- Theme framework -->
        <script src="js/eakroko.min.js"></script>
        <!-- Theme scripts -->
        <script src="js/application.min.js"></script>
        <!-- Just for demonstration -->
        <script src="js/demonstration.min.js"></script>

        <!--[if lte IE 9]>
                <script src="js/plugins/placeholder/jquery.placeholder.min.js"></script>
                <script>
                        $(document).ready(function() {
                                $('input, textarea').placeholder();
                        });
                </script>
                <![endif]-->

        <!-- Favicon -->
        <link rel="shortcut icon" href="img/favicon.ico" />
        <!-- Apple devices Homescreen icon -->
        <link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-precomposed.png" />

    </head>
    <body>
        <%@include file="header_segment.jsp" %>
        <div id="main">
            <div class="container-fluid">

                <!--               
                                <div class="row-fluid">
                                    <div class="span12">
                                        <div class="box">
                
                                            <div class="box-content">
                                                <h5><div class="progress progress-striped">
                                                        30%<div class="bar" style="width: 10%;"></div>
                                                    </div></h5>
                                                <p>يتعين عليك تحسين سيرتك الذاتية من خلال تعبئة المزيد من الأقسام الناقصة من أجل تعزيز فرصة حصولك على وظيفة.
                
                                                </p>
                                                <div class="span3">
                                                    <a title="Edit" href="/en/mycvs/?cv_id=18000260" class="l">
                                                        <span class="icon-pencil">&nbsp;</span>&nbsp;
                                                        تعديل سيرتك الذاتية
                                                    </a>
                                                </div>
                
                                                <div class="span3">
                                                    <a title="Edit" href="/en/mycvs/?cv_id=18000260" class="l">
                                                        <span class="icon-print">&nbsp;</span>&nbsp;
                                                        مشاهدة سيرتك الذاتية
                                                    </a>
                                                </div>
                
                
                                            </div>
                                        </div>
                
                                    </div>
                
                
                                </div>
                -->

                <div class="row-fluid">
                    <div class="box">

                        <div class="box-content">
                            <div class="span12">
                                <div class="span3">
                                    <ul class="pagestats style-3">
                                        <li>
                                            <div class="spark">
                                                <div class="chart" data-percent="<c:out value="${no_of_cv}"/>" data-color="#56af45" data-trackcolor="#dcf8d7"><c:out value="${no_of_cv}"/></div>
                                            </div>
                                            <div class="bottom">
                                                <span class="name">عدد السير الذاتية</span>
                                            </div>
                                        </li>
                                    </ul>
                                </div>

                                <div class="span3">
                                    <ul class="pagestats style-3">
                                        <li>
                                            <div class="spark">
                                                <div class="chart" data-percent="<c:out value="${no_of_applied}"/>" data-color="#56af45" data-trackcolor="#d5e7f7"><c:out value="${no_of_applied}"/></div>
                                            </div>
                                            <div class="bottom">
                                                <span class="name">عدد الوظائف المقدم لها</span>
                                            </div>
                                        </li>
                                    </ul>
                                </div>

                                <div class="span3">
                                    <ul class="pagestats style-3">
                                        <li>
                                            <div class="spark">
                                                <div class="chart" data-percent="<c:out value="${no_of_saved}"/>" data-color="#56af45" data-trackcolor="#fae2e2"><c:out value="${no_of_saved}"/></div>
                                            </div>
                                            <div class="bottom">
                                                <span class="name">عدد الوظائف المحفوظة</span>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>


</html>
