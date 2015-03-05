/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.daos.Contactinfodao;
import com.career.model.ContactInfo;
import com.career.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emam
 */
@WebServlet(name = "savecontactinfo", urlPatterns = {"/savecontactinfo"})
public class savecontactinfo extends HttpServlet {

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
        HttpSession session=request.getSession();
        User u=(User)session.getAttribute("login");
        ContactInfo info=new ContactInfo();
        Contactinfodao dao=new Contactinfodao();
        info.setMail(request.getParameter("mail"));
        info.setPhone1(request.getParameter("phone1"));
        info.setPhone2(request.getParameter("phone2"));
        info.setCounrtyID(Integer.valueOf(request.getParameter("counrty_id")));
        info.setCitiyID(Integer.valueOf(request.getParameter("citiy_id")));
        info.setAddress1(request.getParameter("address1"));
        info.setAddress2(request.getParameter("address2"));
        info.setPostalCode(Integer.valueOf(request.getParameter("postalcode")));
        info.setBox(request.getParameter("box"));
        info.setFax(Integer.valueOf(request.getParameter("fax")));
        info.setURL(request.getParameter("weburl"));
        info.setCVID(u.getCv());
        info.setMobile(request.getParameter("mobile"));
        dao.Presist(info);
        response.getWriter().write("ok");
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
