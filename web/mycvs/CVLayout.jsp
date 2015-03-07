<%-- 
    Document   : CVLayout
    Created on : Jan 6, 2015, 9:31:16 PM
    Author     : emam
--%>

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

        <title>Career CV</title>
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


        <!-- Theme framework -->
        <script src="js/eakroko.min.js"></script>
        <!-- Theme scripts -->
        <script src="js/application.min.js"></script>
        <!-- Just for demonstration -->
        <script src="js/demonstration.min.js"></script>


        <script src="js/CustomeJS.js"></script>

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
        <%@include file="../header_segment.jsp" %>
        <div class="container-fluid" id="content">

            <div id="main">
                <div class="container-fluid">






                    <div class="box">
                        <div class="box-title">
                            <h3>
                                <i class="icon-magic"></i>
                                السيرة الذاتية                            </h3>
                        </div>  
                        <div id="result">

                        </div>


                    </div>
                    <div class="row-fluid">

                        <div class="span8">
                            <div class="box box-bordered">
                                <div class="box-title">
                                    <h3><i class="icon-edit"></i> الوظيفة المرغوبة </h3> 
                                    <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id='getjob' >إضافة<i class="icon-plus"></i></h3>
                                    <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id='editjob' >تعديل<i class="icon-edit"></i></h3>
                                </div>

                                <div class="box-content nopadding">
                                    <form  class='form-horizontal form-bordered'>
                                        <div id="job"></div>
                                    </form>
                                </div>
                            </div>
                        </div>



                    </div>





                    <div class="row-fluid">
                        <div class="span8">

                            <div class="box box-bordered">
                                <div class="box-title">
                                    <h3><i class="icon-edit"></i> المعلومات الشخصية</h3>
                                    <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id='addinfo' >إضافة<i class="icon-plus"></i></h3>
                                    <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id='editinfo' >تعديل<i class="icon-edit"></i></h3>
                                </div>
                                <div class="box-content nopadding">
                                    <form action=\"#\" method=\"POST\" class='form-horizontal form-bordered'>
                                        <div id="info"></div>
                                    </form>
                                </div>

                            </div>
                        </div>

                        <div class="row-fluid">
                            <div class="span8">
                                <div class="box box-bordered">
                                    <div class="box-title">
                                        <h3><i class="icon-edit"></i> معلومات اﻻتصال</h3>
                                        <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id='addcontactinfo' >إضافة<i class="icon-plus"></i></h3>
                                        <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id='editcontactinfo' >تعديل<i class="icon-edit"></i></h3>
                                    </div>
                                    <div class="box-content nopadding">
                                        <form action=\"#\" method=\"POST\" class='form-horizontal form-bordered'>
                                            <div id="contactinfo"></div>
                                        </form>
                                    </div>

                                </div>
                            </div>


                            <div class="row-fluid">
                                <div class="span8">
                                    <div class="box box-bordered">
                                        <div class="box-title">
                                            <h3><i class="icon-edit"></i>الخبرات</h3>
                                            <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id='addexperince' >إضافة<i class="icon-plus"></i></h3>
                                        </div>
                                        <div class="box-content nopadding">
                                            <form class='form-horizontal form-bordered'>
                                                <div id="experience"></div>
                                            </form>

                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="row-fluid">
                                <div class="span8">
                                    <div class="box box-bordered">
                                        <div class="box-title">
                                            <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id="addedu">إضافة<i class="icon-plus"></i></h3>

                                            <h3><i class="icon-edit"></i>التعليم</h3>
                                        </div>
                                        <div class="box-content nopadding">
                                            <form action=\"#\" method=\"POST\" class='form-horizontal form-bordered'>

                                                <div id="edu"></div>
                                            </form>

                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="row-fluid">
                                <div class="span8">
                                    <div class="box box-bordered">
                                        <div class="box-title">
                                            <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id="addskills">إضافة<i class="icon-plus"></i></h3>
                                            <h3><i class="icon-edit"></i>المهارات</h3>
                                        </div>
                                        <div class="box-content nopadding">
                                            <form action=\"#\" method=\"POST\" class='form-horizontal form-bordered'>

                                                <div id="skill"></div>

                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="row-fluid">
                                <div class="span8">
                                    <div class="box box-bordered">
                                        <div class="box-title">
                                            <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id="addlang">إضافة<i class="icon-plus"></i></h3>
                                            <h3><i class="icon-list"></i>اللغات</h3>
                                        </div>
                                        <div class="box-content nopadding">
                                            <form  method="POST" class='form-horizontal form-bordered'>



                                                <div id="lang"></div>

                                            </form>

                                        </div>
                                    </div>


                                </div>
                            </div>

                            <div class="row-fluid">

                                <div class="span8">
                                    <div class="box box-bordered">
                                        <div class="box-title">
                                            <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id="addIden">إضافة<i class="icon-plus"></i></h3>
                                            <h3><i class="icon-user"></i>المعرفون</h3>
                                        </div>
                                        <div class="box-content nopadding">
                                            <form  method="POST" class='form-horizontal form-bordered'>



                                                <div id="identifier"></div>

                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="row-fluid">
                                <div class="span8">
                                    <div class="box box-bordered">
                                        <div class="box-title">
                                            <h3 style="float: left;margin-right: 10px;color: green;cursor: pointer;" id="addMember">إضافة<i class="icon-plus"></i></h3>
                                            <h3><i class="icon-user"></i>العضويات</h3>
                                        </div>
                                        <div class="box-content nopadding">
                                            <form  method="POST" class='form-horizontal form-bordered'>



                                                <div id="member"></div>

                                            </form>

                                        </div>
                                    </div>


                                </div>
                            </div>

                        </div>

                        </body>

                        </html>


