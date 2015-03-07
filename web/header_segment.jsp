<%-- 
    Document   : header_segment
    Created on : Jan 6, 2015, 9:31:33 PM
    Author     : emam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int timeout = session.getMaxInactiveInterval();
    response.setHeader("Refresh", timeout + "; URL = Login");
%>
<jsp:useBean id="login" scope="session" class="com.career.model.User"/>
<!DOCTYPE html>
<div id="navigation">
    <div class="container-fluid">
        <a href="#" id="brand">إنشاء السيرة الذاتية</a>
        <a href="#" class="toggle-nav" rel="tooltip" data-placement="bottom" title="Toggle navigation"><i class="icon-reorder"></i></a>
        <ul class='main-nav'>
            <li >
                <a href="Home">
                    <span>اللوحة الرئيسية</span>
                </a>
            </li>
            <li >
                <a href="#" data-toggle="dropdown" class='dropdown-toggle'>
                    <span>التحكم</span>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="NewCV">أنشاء السيرة الذاتية </a>
                    </li>
                    <li >
                        <a href="Lists">مشاهدة السيرة الذاتية</a>
                    </li>

                </ul>
            </li>
            <li >
                <a href="#" data-toggle="dropdown" class='dropdown-toggle'>
                    <span>الوظائف</span>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="SearchJob">بحث الوظائف المتاحة</a>
                    </li>
                    <li >
                        <a href="DisplaySavedJob">
                            عرض الوظائف المحفوظة</a>
                    </li>
                    <li >
                        <a href="DisplayAppliedJob">
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
                        <a href="Logout">تسجيل خروج</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
