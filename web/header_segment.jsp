<%-- 
    Document   : header_segment
    Created on : Jan 6, 2015, 9:31:33 PM
    Author     : emam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="login" scope="session" class="com.career.model.User"/>
<!DOCTYPE html>
<div id="navigation">
    <div class="container-fluid">
        <a href="#" id="brand">Career CV</a>
        <a href="#" class="toggle-nav" rel="tooltip" data-placement="bottom" title="Toggle navigation"><i class="icon-reorder"></i></a>
        <ul class='main-nav'>
            <li>
                <a href="index.html">
                    <span>اللوحة الرئيسية</span>
                </a>
            </li>
            <li class='active'>
                <a href="#" data-toggle="dropdown" class='dropdown-toggle'>
                    <span>التحكم</span>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="NewCV">أنشاء السيرة الذاتية </a>
                    </li>
                    <li class='active'>
                        <a href="myCvs?id=<jsp:getProperty name="login" property="cv"/>">مشاهدة السيرة الذاتية</a>
                    </li>
                    
                </ul>
            </li>
            <li class='active'>
                <a href="#" data-toggle="dropdown" class='dropdown-toggle'>
                    <span>الوظائف</span>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="SearchJob">بحث الوظائف المتاحة</a>
                    </li>
                    <li class='active'>
                        <a href="DisplaySavedJob">
                            عرض الوظائف المحفوظة</a>
                    </li>
                    <li class='active'>
                        <a href="myCvs?id=<jsp:getProperty name="login" property="cv"/>">
                            عرض الوظائف المقدم اليها</a>
                    </li>
                    
                </ul>
            </li>
            
        </ul>
        <div class="user">
           
            <div class="dropdown">
                <a href="#" class='dropdown-toggle' data-toggle="dropdown"><jsp:getProperty name="login" property="u_name"/> <img src="img/demo/user-avatar.jpg" alt=""></a>
                <ul class="dropdown-menu pull-right">
                    
                    <li>
                        <a href="#">تسجيل خروج</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
