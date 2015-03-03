/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.DAO.LangListdao;
import com.career.DAO.Languagesdao;
import com.career.DAO.skill_level_lastworkingdao;
import com.career.DAO.skillsexperinceleveldao;
import com.career.DAO.skillsleveldao;
import com.career.model.Languages;
import com.career.model.skill_level_lastworking;
import com.career.model.skillsexperincelevel;
import com.career.model.skillslevel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emam
 */
public class getLanguage extends HttpServlet {

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
        skillsleveldao s_dao = new skillsleveldao();
        skillsexperinceleveldao ex_dao = new skillsexperinceleveldao();
        skill_level_lastworkingdao l_dao = new skill_level_lastworkingdao();
        Languagesdao lang_dao = new Languagesdao();
        
        List<skillslevel> aslist = s_dao.FindAll();
        List<skillsexperincelevel> aexlist = ex_dao.FindAll();
        List<skill_level_lastworking> alslist = l_dao.FindAll();
        List<Languages> langlist = lang_dao.FindAll();
        
        String buffer="";
        
         String language_row = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">اللغة</label>"
                        + "<div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<div class=\"input-xlarge\">"
                        + "<select name=\"LANG_ID\" id=\"LANG_ID\" class='chosen-select'>";

                for (Languages s : langlist) {
                    
                        language_row = language_row + "<option value=" + s.getId() + " >" + s.getName() + "</option>";
                    
                    
                }
                
                language_row = language_row + "</select></div></div></div></div>";
                
        buffer=buffer+language_row;
        
        String skill_level_row = "<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">المستوى</label>"
                        + "<div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<div class=\"input-xlarge\">"
                        + "<select name=\"SKILL_LEVEL_ID\" id=\"SKILL_LEVEL_ID\" class='chosen-select'>";

                for (skillslevel s : aslist) {
                    
                        skill_level_row = skill_level_row + "<option value=" + s.getId() + " >" + s.getName() + "</option>";
                    
                    
                }
                
                skill_level_row = skill_level_row + "</select></div></div></div></div>";
                
        buffer=buffer+skill_level_row;
        
        String skill_experice_level="<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">عدد سنوات الخبرة</label>"
                        + "<div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<div class=\"input-xlarge\">"
                        + "<select name=\"SKILL_EXPERINCE_ID\" id=\"SKILL_EXPERINCE_ID\" class='chosen-select'>";

                for (skillsexperincelevel s : aexlist) {
                    
                        skill_experice_level = skill_experice_level + "<option value=" + s.getId() + " >" + s.getName() + "</option>";
                    
                    
                }
                
                skill_experice_level = skill_experice_level + "</select></div></div></div></div>";
                
        buffer=buffer+skill_experice_level;
        
        String skill_last_work="<div class=\"control-group\">"
                        + "<label for=\"textfield\" class=\"control-label\">اخر ممارسة</label>"
                        + "<div class=\"controls\">"
                        + "<div class=\"input-prepend\">"
                        + "<div class=\"input-xlarge\">"
                        + "<select name=\"SKILL_LAST_WORK_ID\" id=\"SKILL_LAST_WORK_ID\" class='chosen-select'>";

                for (skill_level_lastworking s : alslist) {
                    
                        skill_last_work = skill_last_work + "<option value=" + s.getId() + " selected>" + s.getName() + "</option>";
                    
                    
                }
                
                skill_last_work = skill_last_work + "</select></div></div></div></div>";
                
        buffer=buffer+skill_last_work;
        
        String actionrow="<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"حفظ\" type=\"button\" id=\"savelang\">"
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
