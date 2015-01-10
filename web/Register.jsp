<%-- 
    Document   : Register
    Created on : Jan 6, 2015, 9:45:43 PM
    Author     : emam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <!-- Apple devices fullscreen -->
        <meta name="apple-mobile-web-app-capable" content="yes" />
        <!-- Apple devices fullscreen -->
        <meta names="apple-mobile-web-app-status-bar-style" content="black-translucent" />

        <title>Register</title>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Bootstrap responsive -->
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css">
        <!-- icheck -->
        <link rel="stylesheet" href="css/plugins/icheck/all.css">
        <!-- Theme CSS -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Color CSS -->
        <link rel="stylesheet" href="css/themes.css">
        <!-- chosen -->
        <link rel="stylesheet" href="css/plugins/chosen/chosen.css">
        <!-- Datepicker -->
        <link rel="stylesheet" href="css/plugins/datepicker/datepicker.css">


        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>

        <!-- Nice Scroll -->
        <script src="js/plugins/nicescroll/jquery.nicescroll.min.js"></script>
        <!-- Validation -->
        <script src="js/plugins/validation/jquery.validate.min.js"></script>
        <script src="js/plugins/validation/additional-methods.min.js"></script>
        <!-- icheck -->
        <script src="js/plugins/icheck/jquery.icheck.min.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/eakroko.js"></script>
        <!-- Chosen -->
        <script src="js/plugins/chosen/chosen.jquery.min.js"></script>
        <!-- select2 -->
        <script src="js/plugins/select2/select2.min.js"></script>
        <!-- Datepicker -->
        <script src="js/plugins/datepicker/bootstrap-datepicker.js"></script>
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

    <body class='login'>
        <div class="row-fluid">
            <div class="span12">
                <div class="box box-bordered">
                    <div class="box-title">
                        <h3><i class="icon-edit"></i> التسجيل</h3>
                    </div>
                    <div class="box-content nopadding">
                        
                        <form action="#" method="POST" class='form-horizontal form-bordered'>
                            <div class="control-group">
                                <label for="textfield" class="control-label">اسم المستخدم</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <span class="add-on">@</span>
                                        <input type="text" placeholder="Username" id="u_name" autocomplete="off" >
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">كلمة المرور</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <span class="add-on">@</span>
                                        <input type="password" placeholder="Password" id="password" autocomplete="off" >
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">تأكيد كلمة المرور</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <span class="add-on">@</span>
                                        <input type="password" placeholder="Re-Password" id="Rpassword" autocomplete="off" >
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="row-fluid">
            <div class="span12">
                <div class="box box-bordered">
                    <div class="box-title">
                        <h3><i class="icon-edit"></i> المعلومات الشخصية</h3>
                    </div>
                    <div class="box-content nopadding">
                        <form action="#" method="POST" class='form-horizontal form-bordered'>
                            <div class="control-group">
                                <label for="textfield" class="control-label">اﻷسم</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <span class="add-on">@</span>
                                        <input type="text" placeholder="First name" id="f_name" autocomplete="off" >
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">اسم العائلة</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <span class="add-on">@</span>
                                        <input type="text" placeholder="Last Name" id="l_name" autocomplete="off" >
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">jتاريخ الميلاد</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <span class="add-on">@</span>
                                        <input name="textfield" id="dob" class="input-medium datepick" type="text">
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">النوع</label>
                                <div class="controls">
                                    <div class="check-line">

                                        <input type="radio"  id="Gender" value="m" name="Gender"> <label class='inline' for="c3">ذكر</label>

                                    </div>
                                    <div class="check-line">
                                        <input type="radio"  id="Gender" value="f" name="Gender"> <label class='inline' for="c3">أنثى</label>
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">الجنسية</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <div class="input-xlarge">
                                            <select name="select" id="national" class='chosen-select'>
                                                <c:forEach items="${national_list}" var="l">
                                                    <option value="<c:out value="${l.getId()}"/>"><c:out value="${l.name}"/></option>

                                                </c:forEach>

                                            </select></div>
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">البريد الإلكترونى</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <span class="add-on">@</span>
                                        <input type="text" placeholder="mail" id="mail" autocomplete="off" >
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="control-group">
                                <label for="textfield" class="control-label">كيف سمعت عنا</label>
                                <div class="controls">
                                    <div class="input-prepend">
                                        <div class="input-xlarge"><select name="notification_register" id="notification_register" class='chosen-select'>
                                                <option value="1">Option-1</option>
                                                <option value="2">Option-2</option>
                                                <option value="3">Option-3</option>
                                                <option value="4">Option-4</option>
                                                <option value="5">Option-5</option>
                                                <option value="6">Option-6</option>
                                                <option value="7">Option-7</option>
                                                <option value="8">Option-8</option>
                                                <option value="9">Option-9</option>
                                            </select></div>
                                    </div>
                                    <span class="help-block">

                                    </span>
                                </div>
                            </div>

                            <div class="form-actions">
                                <input class="btn btn-primary" value="تسجيل" type="submit" id="saveuser">
                                <button type="button" class="btn">إلغاء</button>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>
