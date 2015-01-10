/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.DAO.Jobdao;
import com.career.model.Job;
import com.career.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emam
 */
public class saveJob extends HttpServlet {

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
        Job j=new Job();
        Jobdao dao=new Jobdao();
        HttpSession session=request.getSession();
        User u=(User)session.getAttribute("login");
        j.setName(request.getParameter("job_name"));
        j.setDesc(request.getParameter("job_desc"));
        j.setEmptype(Integer.valueOf(request.getParameter("employment_type_id")));
        j.setEmpStatus(Integer.valueOf(request.getParameter("employement_status_id")));
        j.setSalary(Double.parseDouble(request.getParameter("salary_amount")));
        j.setSalaryID(Integer.valueOf(request.getParameter("salary_id")));
        j.setCareerID(Integer.valueOf(request.getParameter("career_level_id")));
        j.setNoticePeroidID(Integer.valueOf(request.getParameter("notice_period_id")));
        j.setLastSalary(Double.parseDouble(request.getParameter("last_salary_amount")));
        j.setLastSalaryID(Integer.valueOf(request.getParameter("last_salary_id")));
        j.setCV(u.getCv());
        String message=dao.Presist(j);
        response.getWriter().write(message);
        
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
