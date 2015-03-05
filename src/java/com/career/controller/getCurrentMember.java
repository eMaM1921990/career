/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.daos.MemberShipdao;
import com.career.model.MemberShip;
import com.career.model.User;
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
public class getCurrentMember extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("login");
        
       
        MemberShipdao dao=new MemberShipdao();
        
        List<MemberShip> data=dao.FindByParentId(u.getCv());
        
        String buffer="";
        if(data.size()>0){
            for(MemberShip m:data){
                String row = "<div class=\"box-content\">"
                        + "<div class=\"tab-content\">\n"
                        + "<div class=\"tab-pane active\" id=\"t7\">"
                        + "<a onclick=\"editmember('" + m.getID()+ "')\"> <span style=\"float: left;margin-right: 10px;color: green;cursor: pointer;\">تعديل <i class=\"icon-edit\"></i></span> </a>"
                        + "<a onclick=\"deletemember('" + m.getID()+ "')\"><span style=\"float: left;margin-right: 10px;color: brown;cursor: pointer;\">حذف <i class=\"icon-remove\"></i> </span></a>"
                        + "<h4>" +m.getCompname() + "</h4>\n"
                        + "<p><b> العضوية منذ</b> : " +m.getMemberSince()+ "<b></p>"
                        + "<p><b> الدور</b> : " + m.getRolement()+ "<b></p>"
                       
                        + "</div></div></div>";
                buffer = buffer + row;
            }
        }else{
            String row = "<p>ﻻ يوجد بيانات حالية</p>";

            buffer = buffer+ row;
        }
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
