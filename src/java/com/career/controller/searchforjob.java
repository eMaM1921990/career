/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.controller;

import com.career.daos.Jobsdao;
import com.career.model.Jobs;
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
public class searchforjob extends HttpServlet {

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
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("login");
        Jobs j = new Jobs();
        j.setName(request.getParameter("searchjob").trim().isEmpty() ? "" : request.getParameter("searchjob").trim());
        Jobsdao dao = new Jobsdao();
        List<Jobs> data = dao.FindBy(j);
        String buffer = "<ul>";
        if (data.size() > 0) {

            for (Jobs s : data) {
                buffer = buffer + "<li>\n"
                        + "<input type=\"hidden\" value='"+s.getId()+"' id=\"id\"/>"
                        + "<div class=\"search-info\">\n"
                        + "<a href=\"#\">" + s.getName() + "</a>\n"
                        + "<p class=\"url\">" + s.getPostDate() + "</p>\n"
                        + "<p>" + s.getDesc() + " </p>\n";
               
                    buffer=buffer+ "<p >\n"
                        + "<button class=\"btn btn-info\" id=\"applyjob\" onclick='getJobId("+s.getId()+")'><i class=\"icon-leaf\"></i></button>\n"
                        + "<button class=\"btn btn-warning\" id=\"savejob\" onclick='saveJob("+s.getId()+")'><i class=\"icon-heart\"></i></button>\n"
                        + "</p>";
                
                
                
                buffer=buffer
                        + "</div>\n"
                        + "</li>";
            }

        } else {
            buffer = buffer + "<p>عفوا لا يوجد وظائف متاحة حاليا </p>";
        }

        buffer = buffer + "</ul>";

        response.getWriter().write(buffer);

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
