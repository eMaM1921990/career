/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

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
public class getMember extends HttpServlet {

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
        
        String buffer="";
        
        String name_row="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">المؤسسة</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"COMP_NAME\" autocomplete=\"off\" >"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+name_row;
        
        
         String member_row="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">عضو منذ</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"member_since\" autocomplete=\"off\" >"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+member_row;
        
        String role_row="<div class=\"control-group\">"
                    + "<label for=\"textfield\" class=\"control-label\">العضوية | الدور</label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"text\"  id=\"rolement\" autocomplete=\"off\" >"
                    + "</div>"
                    + "</div>"
                    + "</div>";
        
        buffer=buffer+role_row;
        
        String actionrow="<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"حفظ\" type=\"button\" id=\"savemember\">"
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
