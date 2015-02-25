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
                    <span>Dashboard</span>
                </a>
            </li>
            <li class='active'>
                <a href="#" data-toggle="dropdown" class='dropdown-toggle'>
                    <span>Option</span>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="myCvs">أنشاء السيرة الذاتية </a>
                    </li>
                    <li class='active'>
                        <a href="myCvs?id=<jsp:getProperty name="login" property="cv"/>">مشاهدة السيرة الذاتية</a>
                    </li>
                    
                </ul>
            </li>
            
        </ul>
        <div class="user">
           
            <div class="dropdown">
                <a href="#" class='dropdown-toggle' data-toggle="dropdown">John Doe <img src="img/demo/user-avatar.jpg" alt=""></a>
                <ul class="dropdown-menu pull-right">
                    
                    <li>
                        <a href="more-login.html">Sign out</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
