/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.daos.Identifierdao;
import com.career.model.Identifier;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emam
 */
public class getEditIdentifier extends HttpServlet {

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
        
        int find_id=Integer.valueOf(request.getParameter("id"));
        Identifierdao dao=new Identifierdao();
        Identifier i=dao.Find(request.getParameter("id"));
        
        String buffer="";
        
        
        String name_row="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">اﻷسم</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"NAME\" autocomplete=\"off\" value='"+i.getName()+"'>"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+name_row;
        
        String companyrow="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">اسم الشركة</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"COMPANY_NAME\" autocomplete=\"off\" value='"+i.getCompanyname()+"'>"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+companyrow;
        
        String positionrow="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">المسمي الوظيفي</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"POSITION_NAME\" autocomplete=\"off\" value='"+i.getPosition()+"'>"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+positionrow;
        
        String phone_row="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">الهاتف</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"PHONE\" autocomplete=\"off\" value='"+i.getPhone()+"' onkeypress=\"return isNumber(event)\">"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+phone_row;
        
        String mailrow="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">البريد الألكترونى</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"EMAIL\" autocomplete=\"off\" value='"+i.getEmail()+"' onkeypress=\"return EnglishOnly()\">"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+mailrow;
        
        String actionrow="<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"تعديل\" type=\"button\" id=\"editiden\">"
                + "<button type=\"button\" class=\"btn\">إلغاء</button>"
                + "</div>";
        buffer=buffer+actionrow;
        
        response.getWriter().write(buffer);
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
