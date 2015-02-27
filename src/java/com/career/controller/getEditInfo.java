/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.DAO.Infodao;
import com.career.DAO.NationalDAO;
import com.career.DAO.VisaStatusdao;
import com.career.model.Info;
import com.career.model.National;
import com.career.model.User;
import com.career.model.VisaStatus;
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
public class getEditInfo extends HttpServlet {

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
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("login");
        
        NationalDAO dao = new NationalDAO();
        List<National> n = dao.FindAll();
        
        VisaStatusdao s_dao = new VisaStatusdao();
        List<VisaStatus> s = s_dao.FindAll();
        
        Info i = new Info();
        Infodao i_dao = new Infodao();
        i = i_dao.Find(Integer.toString(u.getCv()));
        
        String buffer ="";
        
        String row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">اﻻسم اﻻول</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"hidden\"  id=\"id\" value='" + i.getId() + "'>"
                + "<input type=\"text\" placeholder=\"First Name\" id=\"f_name\" autocomplete=\"off\"  value='" + i.getFname() + "'>"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer = buffer + row;
        
        String row2 = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الاسم الثانى</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Sur name\" id=\"surename\" autocomplete=\"off\"  value='" + i.getSurename() + "'>"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer = buffer + row2;
        
        String rowdate = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">تاريخ الميلاد</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input name=\"dob\" id=\"dob\" class=\"input-medium datepick\" type=\"text\"  value='" + i.getDob() + "'>"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer = buffer + rowdate;
        
        String rowgender = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الجنس</label>"
                + "<div class=\"controls\">"
                + "<div class=\"check-line\">";
        if ("m".equals(i.getGender())) {
            rowgender = rowgender + "<input type=\"radio\"  id=\"gender\" value=\"m\" name=\"Gender\" checked> <label class='inline' for=\"c3\">ذكر</label>";
        } else {
            rowgender = rowgender + "<input type=\"radio\"  id=\"gender\" value=\"m\" name=\"Gender\"> <label class='inline' for=\"c3\">ذكر</label>";
        }
        rowgender = rowgender
                + "</div>"
                + "<div class=\"check-line\">";
        
        if ("f".equals(i.getGender())) {
            rowgender = rowgender + "<input type=\"radio\"  id=\"gender\" value=\"f\" name=\"Gender\" checked> <label class='inline' for=\"c3\">أنثى</label>";
        } else {
            rowgender = rowgender + "<input type=\"radio\"  id=\"gender\" value=\"f\" name=\"Gender\"> <label class='inline' for=\"c3\">أنثى</label>";
        }
        rowgender = rowgender
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer = buffer + rowgender;
        
        String rowcombo = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الجنسية</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"nationality_id\" id=\"nationality_id\" class='chosen-select'>";
        
        for (National na : n) {
            if (na.getId() == i.getNationalID()) {
                
                rowcombo = rowcombo + "<option value=" + na.getId() + " selected>" + na.getName() + "</option>";
            } else {
                rowcombo = rowcombo + "<option value=" + na.getId() + ">" + na.getName() + "</option>";
            }
            
        }
        
        rowcombo = rowcombo + "</select></div></div></div>";
        
        buffer = buffer + rowcombo;
        
        String rowcombo2 = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">حالة التأشيرة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"visa_status_id\" id=\"visa_status_id\" class='chosen-select' >";
        
        for (VisaStatus vs : s) {
            if (vs.getId() == i.getVisaStatusID()) {
                
                rowcombo2 = rowcombo2 + "<option value=" + vs.getId() + " selected>" + vs.getName() + "</option>";
            } else {
                rowcombo2 = rowcombo2 + "<option value=" + vs.getId() + ">" + vs.getName() + "</option>";
            }
            
        }
        
        rowcombo2 = rowcombo2 + "</select></div></div></div>";
        
        buffer = buffer + rowcombo2;
        
        String materilrow = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الحالة الاجتماعية</label>"
                + "<div class=\"controls\">"
                + "<div class=\"check-line\">";
        
        if ("غير محدد".equals(i.getMaritalStatus())) {
            materilrow = materilrow + "<input type=\"radio\"  id=\"material_status\" value=\"غير محدد\" name=\"m\" checked> <label class='inline' for=\"c3\">غير محدد</label>";
        } else {
            materilrow = materilrow + "<input type=\"radio\"  id=\"material_status\" value=\"غير محدد\" name=\"m\"> <label class='inline' for=\"c3\">غير محدد</label>";
        }
        materilrow = materilrow
                + "</div>"
                + "<div class=\"check-line\">";
        if ("اعزب".equals(i.getMaritalStatus())) {
            materilrow = materilrow + "<input type=\"radio\"  id=\"material_status\" value=\"اعزب\" name=\"m\" checked> <label class='inline' for=\"c3\">اعزب</label>";
        } else {
            materilrow = materilrow + "<input type=\"radio\"  id=\"material_status\" value=\"اعزب\" name=\"m\"> <label class='inline' for=\"c3\">اعزب</label>";
        }
        
        materilrow = materilrow
                + "</div>"
                + "<div class=\"check-line\">";
        
        if ("متزوج".equals(i.getMaritalStatus())) {
            materilrow = materilrow + "<input type=\"radio\"  id=\"material_status\" value=\"متزوج\" name=\"m\" checked> <label class='inline' for=\"c3\">متزوج</label>";
        } else {
            materilrow = materilrow + "<input type=\"radio\"  id=\"material_status\" value=\"متزوج\" name=\"m\"> <label class='inline' for=\"c3\">متزوج</label>";
        }
        materilrow = materilrow
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer = buffer + materilrow;
        
        String ownerrowcombo = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">عدد المعالين</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"no_of_own\" id=\"no_of_own\" class='chosen-select' >";
        
        for (int z = 0; z < 21; z++) {
            if (z == i.getNoofown()) {
                
                ownerrowcombo = ownerrowcombo + "<option value=" + z + " selected>" + z + "</option>";
            } else {
                ownerrowcombo = ownerrowcombo + "<option value=" + z + ">" + z + "</option>";
            }
            
        }
        
        ownerrowcombo = ownerrowcombo + "</select></div></div></div>";
        
        buffer = buffer + ownerrowcombo;
        
        String licensecombo = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">رخصة السياقة صادرة من </label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"driving_license\" id=\"driving_license\" class='chosen-select' >";
        
        for (National na : n) {
            if (na.getId() == i.getLicense()) {
                
                licensecombo = licensecombo + "<option value=" + na.getId() + " selected>" + na.getName() + "</option>";
            } else {
                licensecombo = licensecombo + "<option value=" + na.getId() + ">" + na.getName() + "</option>";
            }
            
        }
        
        licensecombo = licensecombo + "</select></div></div>";
        
        buffer = buffer + licensecombo;
        
        String actionrow = "<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"تعديل\" type=\"submit\" id=\"editinfo\">"
                + "<button type=\"button\" class=\"btn\">إلغاء</button>"
                + "</div>";
        buffer = buffer + actionrow;
        
        response.getWriter().write(buffer);
        
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
