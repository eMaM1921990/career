/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.DAO.SkillListdao;
import com.career.DAO.skill_level_lastworkingdao;
import com.career.DAO.skillsexperinceleveldao;
import com.career.DAO.skillsleveldao;
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
public class getCurrentSkills extends HttpServlet {

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
        
        HttpSession session=request.getSession();
        User u=(User)session.getAttribute("login");
        
        skillsleveldao s_dao=new skillsleveldao();
        skillsexperinceleveldao ex_dao=new skillsexperinceleveldao();
        skill_level_lastworkingdao l_dao=new skill_level_lastworkingdao();
        SkillListdao list_dao=new SkillListdao();
        
        List<skillslevel> aslist=s_dao.FindAll();
        List<skillsexperincelevel> aexlist=ex_dao.FindAll();
        List<skill_level_lastworking> alslist=l_dao.FindAll();
        List<SkillList> askilllist=list_dao.FindByParentId(u.getCv());
        
        String buffer = "<div class=\"box box-bordered\">"
                + "<div class=\"box-title\">"
                + "<h3><i class=\"icon-edit\"></i>المهارات</h3>"
                + "</div>"
                + " <div class=\"box-content nopadding\">"
                + "<form action=\"#\" method=\"POST\" class='form-horizontal form-bordered'>";
        
        if(askilllist.size()>0){
            
        }else{
            String row = "<div class=\"controls\">"
                    + "<label for=\"textfield\" class=\"control-label\"></label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    + "<label for=\"textfield\" class=\"control-label\">المهارات </label>"
                    + "<input type=\"button\" value=\"إضافة\" class='btn btn-green' id=\"addskills\">"
                    + "</div>"
                    + "</div>"
                    + "</div>";
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
