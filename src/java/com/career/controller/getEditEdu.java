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
public class getEditEdu extends HttpServlet {

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
        Citiesdao c_dao = new Citiesdao();
        List<Cities> lc = c_dao.FindAll();
        edudao e_dao = new edudao();
        edu e = e_dao.Find(request.getParameter("id"));
        ratedao rdao = new ratedao();
        List<rate_level> rlist = rdao.FindAll();
        String buffer = "";
        String row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">المؤسسة التعليمية </label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"\" id=\"instatute_name\" autocomplete=\"off\" value='" + e.getName() + "'>"
                + "</div>"
                + "</div>"
                + "</div>";
        buffer = buffer + row;
        String country_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الدولة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"conutry_id\" id=\"conutry_id\" class='chosen-select'>";
        for (National na : n) {
            if (na.getId() == e.getCounrtyID()) {
                country_row = country_row + "<option value=" + na.getId() + " selected>" + na.getName() + "</option>";
            } else {
                country_row = country_row + "<option value=" + na.getId() + ">" + na.getName() + "</option>";
            }
        }
        country_row = country_row + "</select></div></div></div>";
        buffer = buffer + country_row;
        String city_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">المدينة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"city_id\" id=\"city_id\" class='chosen-select'>";
        for (Cities ci : lc) {
            if (ci.getId() == e.getCityID()) {
                city_row = city_row + "<option value=" + ci.getId() + " selected>" + ci.getName() + "</option>";
            } else {
                city_row = city_row + "<option value=" + ci.getId() + ">" + ci.getName() + "</option>";
            }
        }
        city_row = city_row + "</select></div></div></div>";
        buffer = buffer + city_row;
        String certifited_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الشهادة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"certificate\" id=\"certificate\" class='chosen-select'>";
        
        certifited_row = certifited_row + "<option value=\"الثانوية العامة أو ما يعادلها\">الثانوية العامة أو ما يعادلها</option>"
                + "<option value=\"دبلوم \">دبلوم </option>"
                + "<option value=\"بكالوريوس/ دبلوم عالي\">بكالوريوس/ دبلوم عالي<option>"
                + "<option value=\"ماجستير\">ماجستير</option>"
                + "<option value=\"دكتوراة\">دكتوراة</option>"
                + "</select></div></div></div>";
        buffer = buffer + certifited_row;
        String major_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">التخصص </label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"\" id=\"major\" autocomplete=\"off\" value='" + e.getMajor() + "'>"
                + "</div>"
                + "</div>"
                + "</div>";
        buffer = buffer + major_row;
        String rate_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">المعدل</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"rate_id\" id=\"rate_id\" class='chosen-select'>";
        for (rate_level er : rlist) {
            if (er.getId() == e.getRateID()) {
                rate_row = rate_row + "<option value=" + er.getId() + " selected>" + er.getName() + "</option>";
            } else {
                rate_row = rate_row + "<option value=" + er.getId() + ">" + er.getName() + "</option>";
            }
        }
        rate_row = rate_row + "</select>"
                + "<input type=\"text\" placeholder=\"\" id=\"rate_degree\" autocomplete=\"off\" value='" + e.getDegree() + "'>"
                + "</div></div></div>";
        buffer = buffer + rate_row;
        String enddate_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">تاريخ الانتهاء </label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"\" id=\"enddate\" autocomplete=\"off\" value='" + e.getEndate() + "'>"
                + "</div>"
                + "</div>"
                + "</div>";
        buffer = buffer + enddate_row;
        String desc_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الوصف</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<textarea name=\"desc\" id=\"desc\" class=\"input-block-level\">" + e.getDesc() + "</textarea>"
                + "</div>"
                + "</div>"
                + "</div>";
        buffer = buffer + desc_row;
        
        String actionrow="<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"تعديل\" type=\"button\" id=\"editecuaction\">"
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
