/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.controller;

import com.career.DAO.Careerroledao;
import com.career.DAO.Experincedao;
import com.career.DAO.NationalDAO;
import com.career.DAO.industrydao;
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

        String buffer = null;
        if (e.size() > 0) {
            for (Experince ex : e) {
                buffer = "";

                String row = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">تاريخ بدء العمل </label>"
                        + " <div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<input type=\"text\"  id=\"startdate\" autocomplete=\"off\" value='"+ex.getStartdate()+"' style='pointer-events:none;border:none;background:#fff'>"
                        + "</div>"
                        + "</div>"
                        + "</div>";

                buffer = buffer + row;

                String row2 = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">تاريخ ترك العمل</label>"
                        + " <div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<input type=\"text\"  id=\"enddate\" autocomplete=\"off\" value='"+ex.getEnddate()+"' style='pointer-events:none;border:none;background:#fff'>"
                        + "</div>"
                        + "</div>"
                        + "</div>";
                buffer = buffer + row2;

                String rowcombo = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">الموقع</label>"
                        + "<div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<div class=\"input-xlarge\">"
                        + "<select name=\"nationality_id\" id=\"national_id\" class='chosen-select' style='pointer-events:none;border:none;background:#fff'>";

                for (National na : n) {
                    if(na.getId()==ex.getNationalID()){
                        rowcombo = rowcombo + "<option value=" + na.getId() + " selected>" + na.getName() + "</option>";
                    }else{
                        rowcombo = rowcombo + "<option value=" + na.getId() + ">" + na.getName() + "</option>";
                    }
                    
                }

                rowcombo = rowcombo + "</select></div></div></div>";

                buffer = buffer + rowcombo;

                String row3 = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">العنوان</label>"
                        + " <div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<input type=\"text\"  id=\"address\" autocomplete=\"off\" value='"+ex.getAddress()+"' style='pointer-events:none;border:none;background:#fff'>"
                        + "</div>"
                        + "</div>"
                        + "</div>";

                buffer = buffer + row3;
                String row4 = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">اسم الشركة</label>"
                        + " <div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<input type=\"text\"  id=\"companyname\" autocomplete=\"off\" value='"+ex.getCompanyname()+"' style='pointer-events:none;border:none;background:#fff'>"
                        + "</div>"
                        + "</div>"
                        + "</div>";

                buffer = buffer + row4;

                String rowcombo2 = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">قطاع الشركة</label>"
                        + "<div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<div class=\"input-xlarge\">"
                        + "<select name=\"company_industry_id\" id=\"company_industry_id\" class='chosen-select' style='pointer-events:none;border:none;background:#fff'>";

                for (Industry i : list) {
                    if(i.getId()==ex.getCompanyIndustry()){
                        
                    rowcombo2 = rowcombo2 + "<option value=" + i.getId() + " selected>" + i.getName() + "</option>";    
                    }else{
                    rowcombo2 = rowcombo2 + "<option value=" + i.getId() + ">" + i.getName() + "</option>";    
                    }
                    
                }

                rowcombo2 = rowcombo2 + "</select></div></div></div>";
                buffer = buffer + rowcombo2;

                String rowcomb3 = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">الدور الوظيفى</label>"
                        + "<div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<div class=\"input-xlarge\">"
                        + "<select name=\"career_role_id\" id=\"career_role_id\" class='chosen-select' style='pointer-events:none;border:none;background:#fff'>";

                for (CareerRole ci : role_list) {
                    if(ci.getId()==ex.getCareerRoleID()){
                    rowcomb3 = rowcomb3 + "<option value=" + ci.getId() + " selected>" + ci.getName() + "</option>";    
                    }else{
                    rowcomb3 = rowcomb3 + "<option value=" + ci.getId() + ">" + ci.getName() + "</option>";    
                    }
                    
                }

                rowcomb3 = rowcomb3 + "</select></div></div></div>";

                buffer = buffer + rowcomb3;

                String row5 = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">مسمى المنصب فى الشركة</label>"
                        + " <div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<input type=\"text\"  id=\"role_name\" autocomplete=\"off\" value='"+ex.getRoleName()+"' style='pointer-events:none;border:none;background:#fff'>"
                        + "</div>"
                        + "</div>"
                        + "</div>";

                buffer = buffer + row5;

                String row6 = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">الوصف</label>"
                        + " <div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<textarea name=\"jobdesc\" id=\"jobdesc\" class=\"input-block-level\" style='pointer-events:none;border:none;background:#fff'>"+ex.getDesc()+"</textarea>"
                        + "</div>"
                        + "</div>"
                        + "</div>";

                buffer = buffer + row6;
            }

            String action = "<div class=\"controls\">"
                    + "<label for=\"textfield\" class=\"control-label\"></label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    
                    + "<input type=\"button\" value=\"إضافة\" class='btn btn-green' id=\"addexperince\">"
                    + "</div>"
                    + "</div>"
                    + "</div>";
            buffer = buffer + action;

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
