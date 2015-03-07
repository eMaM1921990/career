/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.controller;

import com.career.daos.Citiesdao;
import com.career.daos.NationalDAO;
import com.career.daos.edudao;
import com.career.daos.ratedao;
import com.career.model.Cities;
import com.career.model.National;
import com.career.model.User;
import com.career.model.edu;
import com.career.model.rate_level;
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
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("login");

        NationalDAO dao = new NationalDAO();
        List<National> n = dao.FindAll();

        Citiesdao c_dao = new Citiesdao();
        List<Cities> lc = c_dao.FindAll();

        edudao e_dao = new edudao();
        List<edu> elist = e_dao.FindByParentId(u.getCv());

        ratedao rdao = new ratedao();
        List<rate_level> rlist = rdao.FindAll();

        String buffer = "";
        if (elist.size() > 0) {

            for (edu e:elist) {

                String row = "<div class=\"box-content\">"
                    + "<div class=\"tab-content\">\n"
                    + "<div class=\"tab-pane active\" id=\"t7\">"
                    + "<a onclick=\"editedu('"+e.getID()+"')\"> <span style=\"float: left;margin-right: 10px;color: green;cursor: pointer;\">تعديل <i class=\"icon-edit\"></i></span> </a>"
                    + "<a   onclick=\"deleteedu('"+e.getID()+"')\"><span style=\"float: left;margin-right: 10px;color: brown;cursor: pointer;\">حذف <i class=\"icon-remove\"></i> </span></a>"
                    + "<h4>"+e.getName()+"</h4>\n"
                   + "<h4>"+e.getCert()+"</h4>\n"
                    + "<p><b> الموقع </b> : "+e.getCountryname()+","+e.getCityname()+"</p>"
                        + "<p><b> الشهادة </b> : "+e.getMajor()+"</p>"
                        + "<p><b>المعدل </b> : "+e.getRatename()+":"+e.getDegree()+"</p>"
                        
                        + "<p><b>ناريخ النهاية </b> : "+e.getEndate()+"</p>"
                        + "<p><b>الوصف </b> </p>"
                        + "<p>"+e.getDesc()+" </p>"
                        
                    + "</div></div></div>";
                buffer=buffer+row;
            }
        } else {
            
            String row = "<p>ﻻ يوجد بيانات حالية </p>";

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
