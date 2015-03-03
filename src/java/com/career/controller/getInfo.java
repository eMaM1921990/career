/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.controller;

import com.career.DAO.NationalDAO;
import com.career.DAO.VisaStatusdao;
import com.career.model.EmpType;
import com.career.model.National;
import com.career.model.VisaStatus;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emam
 */
public class getInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        NationalDAO dao=new NationalDAO();
        List<National> n=dao.FindAll();
        
        VisaStatusdao s_dao=new VisaStatusdao();
        List<VisaStatus> s=s_dao.FindAll();
        
        
        
        String buffer = "";

        String row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">اﻻسم اﻻول</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"First Name\" id=\"f_name\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";

        buffer = buffer + row;

        String row2 = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">اﻻسم اﻻول</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Sur name\" id=\"surename\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";

        buffer = buffer + row2;

        String rowdate = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">تاريخ الميلاد</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input name=\"dob\" id=\"dob\" class=\"input-medium datepick\" type=\"text\">"
                + "</div>"
                + "</div>"
                + "</div>";

        buffer = buffer + rowdate;

        String rowgender = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الجنس</label>"
                + "<div class=\"controls\">"
                + "<div class=\"check-line\">"
                + "<input type=\"radio\"  id=\"gender\" value=\"m\" name=\"Gender\"> <label class='inline' for=\"c3\">ذكر</label>"
                + "</div>"
                + "<div class=\"check-line\">"
                + "<input type=\"radio\"  id=\"gender\" value=\"f\" name=\"Gender\"> <label class='inline' for=\"c3\">أنثى</label>"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+rowgender;
        
        String rowcombo="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الجنسية</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"nationality_id\" id=\"nationality_id\" class='chosen-select'>";
                
        for(National na:n){
            rowcombo=rowcombo+"<option value="+na.getId()+">"+na.getName()+"</option>";
        }
        
        rowcombo=rowcombo+"</select></div></div></div>";
        
        buffer=buffer+rowcombo;
        
        String rowcombo2="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">حالة التأشيرة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"visa_status_id\" id=\"visa_status_id\" class='chosen-select'>";
                
        for(VisaStatus vs:s){
            rowcombo2=rowcombo2+"<option value="+vs.getId()+">"+vs.getName()+"</option>";
        }
        
        rowcombo2=rowcombo2+"</select></div></div></div>";
        
        buffer=buffer+rowcombo2;
        
        String materilrow="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الحالة الاجتماعية</label>"
                + "<div class=\"controls\">"
                + "<div class=\"check-line\">"
                + "<input type=\"radio\"  id=\"material_status\" value=\"غير محدد\" name=\"m\"> <label class='inline' for=\"c3\">غير محدد</label>"
                + "</div>"
                + "<div class=\"check-line\">"
                + "<input type=\"radio\"  id=\"material_status\" value=\"اعزب\" name=\"m\"> <label class='inline' for=\"c3\">اعزب</label>"
                + "</div>"
                + "<div class=\"check-line\">"
                + "<input type=\"radio\"  id=\"material_status\" value=\"متزوج\" name=\"m\"> <label class='inline' for=\"c3\">متزوج</label>"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+materilrow;
        

        String ownerrowcombo="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">عدد المعالين</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"no_of_own\" id=\"no_of_own\" class='chosen-select'>";
                
        for(int i=0;i<21;i++){
            ownerrowcombo=ownerrowcombo+"<option value="+i+">"+i+"</option>";
        }
        
        ownerrowcombo=ownerrowcombo+"</select></div></div></div>";
        
        buffer=buffer+ownerrowcombo;
        
        String licensecombo="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">رخصة السياقة صادرة من </label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"driving_license\" id=\"driving_license\" class='chosen-select'>";
                
        for(National na:n){
            licensecombo=licensecombo+"<option value="+na.getId()+">"+na.getName()+"</option>";
        }
        
        licensecombo=licensecombo+"</select></div></div>";
        
        buffer=buffer+licensecombo;
        
        String actionrow="<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"حفظ\" type=\"button\" id=\"saveinfo\">"
                + "<button type=\"button\" class=\"btn\">إلغاء</button>"
                + "</div>";
        buffer=buffer+actionrow;
        
        
        response.getWriter().write(buffer);
        
                
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
