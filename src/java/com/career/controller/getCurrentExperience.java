/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.controller;

import com.career.daos.Careerroledao;
import com.career.daos.Experincedao;
import com.career.daos.NationalDAO;
import com.career.daos.industrydao;
import com.career.model.CareerRole;
import com.career.model.Experince;
import com.career.model.Industry;
import com.career.model.National;
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
public class getCurrentExperience extends HttpServlet {

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

        NationalDAO dao = new NationalDAO();
        List<National> n = dao.FindAll();

        industrydao idao = new industrydao();
        List<Industry> list = idao.FindAll();

        Careerroledao cdao = new Careerroledao();
        List<CareerRole> role_list = cdao.FindAll();

        Experincedao i_dao = new Experincedao();
        List<Experince> e = i_dao.FindByParentId(u.getCv());

        String buffer = "";
        if (e.size() > 0) {
            for (Experince ex : e) {
                
                String row = "<div class=\"box-content\">"
                    + "<div class=\"tab-content\">\n"
                    + "<div class=\"tab-pane active\" id=\"t7\">"
                    + "<a onclick=\"EditExperView('"+ex.getID()+"')\"> <span style=\"float: left;margin-right: 10px;color: green;cursor: pointer;\">تعديل <i class=\"icon-edit\"></i></span> </a>"
                    + "<a   onclick=\"deleteexp('"+ex.getID()+"')\"><span style=\"float: left;margin-right: 10px;color: brown;cursor: pointer;\">حذف <i class=\"icon-remove\"></i> </span></a>"
                    + "<h4>"+ex.getRoleName()+"</h4>\n"
                   + "<h4>"+ex.getCompanyname()+"</h4>\n"
                    + "<p><b> الموقع </b> : "+ex.getNationalname()+","+ex.getAddress()+"</p>"
                        + "<p><b> قطاع الشركة </b> : "+ex.getCompanyIndustryname()+"</p>"
                        + "<p><b>الدور الوظيفى </b> : "+ex.getCareer_role_name()+"</p>"
                        + "<p><b>الفترةمن </b> : "+ex.getStartdate()+"</p>"
                        + "<p><b>الى </b> : "+ex.getEnddate()+"</p>"
                        + "<p><b>الوصف </b> </p>"
                        + "<p>"+ex.getDesc()+" </p>"
                        
                    + "</div></div></div>";
                buffer=buffer+row;
            }
                
                
                

        } else {
            buffer = "";
            String row = "<p>ﻻ يوجد بيانات حالية</p>";

            buffer = buffer + row;
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
