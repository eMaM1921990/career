/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.DAO.Citiesdao;
import com.career.DAO.NationalDAO;
import com.career.DAO.edudao;
import com.career.model.Cities;
import com.career.model.National;
import com.career.model.User;
import com.career.model.edu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emam
 */
public class getCurrentEdu extends HttpServlet {

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
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF8");
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
        HttpSession session=request.getSession();
        User u=(User)session.getAttribute("login");
        
        NationalDAO dao=new NationalDAO();
        List<National> n=dao.FindAll();
        
        Citiesdao c_dao=new Citiesdao();
        List<Cities> lc=c_dao.FindAll();
        
        edudao e_dao=new edudao();
        List<edu> elist=e_dao.FindByParentId(u.getCv());
        
        String buffer=null;
        
        if(elist.size()>0){
            
        }else{
            buffer = "<div class=\"box box-bordered\">"
                    + "<div class=\"box-title\">"
                    + "<h3><i class=\"icon-edit\"></i> معلومات اﻻتصال</h3>"
                    + "</div>"
                    + " <div class=\"box-content nopadding\">"
                    + "<form class='form-horizontal form-bordered'>";
            String row = "<div class=\"controls\">"
                    + "<label for=\"textfield\" class=\"control-label\"></label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    + "<label for=\"textfield\" class=\"control-label\">التعليم</label>"
                    + "<input type=\"button\" value=\"إضافة\" class='btn btn-green' id=\"addedu\">"
                    + "</div>"
                    + "</div>"
                    + "</div>";

            buffer = buffer + row;
        }
        
        System.out.println("Current List Size :"+elist.size());
        response.getWriter().write(buffer);
        
        
//        
//        String buffer = "<div class=\"box box-bordered\">"
//                + "<div class=\"box-title\">"
//                + "<h3><i class=\"icon-edit\"></i>التعليم</h3>"
//                + "</div>"
//                + " <div class=\"box-content nopadding\">"
//                + "<form action=\"#\" method=\"POST\" class='form-horizontal form-bordered'>";
//        
//        String row = "<div class=\"control-group\">"
//                + "<label for=\"textfield\" class=\"control-label\">المؤسسة التعليمية </label>"
//                + " <div class=\"controls\">"
//                + "<div class=\"input-prepend\">"
//                + "<input type=\"text\" placeholder=\"mail\" id=\"mail\" autocomplete=\"off\" >"
//                + "</div>"
//                + "</div>"
//                + "</div>";
//        
//        buffer=buffer+row;
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
