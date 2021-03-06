/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.controller;

import com.career.daos.SkillListdao;
import com.career.daos.skill_level_lastworkingdao;
import com.career.daos.skillsexperinceleveldao;
import com.career.daos.skillsleveldao;
import com.career.model.SkillList;
import com.career.model.User;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author emam
 */
public class getEditSkill extends HttpServlet {

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

        skillsleveldao s_dao = new skillsleveldao();
        skillsexperinceleveldao ex_dao = new skillsexperinceleveldao();
        skill_level_lastworkingdao l_dao = new skill_level_lastworkingdao();

        List<skillslevel> aslist = s_dao.FindAll();
        List<skillsexperincelevel> aexlist = ex_dao.FindAll();
        List<skill_level_lastworking> alslist = l_dao.FindAll();

        SkillListdao list_dao = new SkillListdao();

        SkillList data = list_dao.Find(Integer.toString(u.getCv()));

        String buffer = "";

        String skill_name_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">المهارة</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"\" id=\"skill_name\" autocomplete=\"off\" onkeypress=\"return EnglishOnly()\" value='" + data.getSkillname() + "'>"
                + "</div>"
                + "</div>"
                + "</div>";

        buffer = buffer + skill_name_row;

        String skill_level_row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">المستوى</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"skill_level_id\" id=\"skill_level_id\" class='chosen-select'>";

        for (skillslevel s : aslist) {
            if (s.getId() == data.getSkill_level_id()) {
                skill_level_row = skill_level_row + "<option value=" + s.getId() + " selected>" + s.getName() + "</option>";
            } else {
                skill_level_row = skill_level_row + "<option value=" + s.getId() + " >" + s.getName() + "</option>";
            }

        }

        skill_level_row = skill_level_row + "</select></div></div></div></div>";

        buffer = buffer + skill_level_row;

        String skill_experice_level = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">عدد سنوات الخبرة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"skillexperince_leve_id\" id=\"skillexperince_leve_id\" class='chosen-select'>";

        for (skillsexperincelevel s : aexlist) {

            if(s.getId()==data.getskillexperince_level_id()){
                skill_experice_level = skill_experice_level + "<option value=" + s.getId() + " selected>" + s.getName() + "</option>";
            }else{
                skill_experice_level = skill_experice_level + "<option value=" + s.getId() + " >" + s.getName() + "</option>";
            }
            

        }

        skill_experice_level = skill_experice_level + "</select></div></div></div></div>";

        buffer = buffer + skill_experice_level;

        String skill_last_work = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">اخر ممارسة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"skill_leve_last_work_id\" id=\"skill_leve_last_work_id\" class='chosen-select'>";

        for (skill_level_lastworking s : alslist) {
            if(s.getId()==data.getSkill_last_work_id()){
                skill_last_work = skill_last_work + "<option value=" + s.getId() + " selected>" + s.getName() + "</option>";
            }else{
                skill_last_work = skill_last_work + "<option value=" + s.getId() + " >" + s.getName() + "</option>";
            }
            

        }

        skill_last_work = skill_last_work + "</select></div></div></div></div>";

        buffer = buffer + skill_last_work;

        String actionrow = "<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"تعديل\" type=\"button\" id=\"editskillaction\">"
                + "<button type=\"button\" class=\"btn\">إلغاء</button>"
                + "</div>";
        buffer = buffer + actionrow;

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
