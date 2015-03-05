/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.controller;

import com.career.daos.LangListdao;
import com.career.daos.Languagesdao;
import com.career.daos.skill_level_lastworkingdao;
import com.career.daos.skillsexperinceleveldao;
import com.career.daos.skillsleveldao;
import com.career.model.LangList;
import com.career.model.Languages;
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
public class getCurrentLanguage extends HttpServlet {

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
        Languagesdao lang_dao = new Languagesdao();
        LangListdao user_langdao = new LangListdao();
        List<skillslevel> aslist = s_dao.FindAll();
        List<skillsexperincelevel> aexlist = ex_dao.FindAll();
        List<skill_level_lastworking> alslist = l_dao.FindAll();
        List<Languages> langlist = lang_dao.FindAll();

       List<LangList> user_langlist = user_langdao.FindByParentId(u.getCv());

        String buffer = "";

        if (user_langlist.size() > 0) {
            
            for(LangList l:user_langlist){
                String row = "<div class=\"box-content\">"
                    + "<div class=\"tab-content\">\n"
                    + "<div class=\"tab-pane active\" id=\"t7\">"
                    + "<a onclick=\"editLang('"+l.getID()+"')\"> <span style=\"float: left;margin-right: 10px;color: green;cursor: pointer;\">تعديل <i class=\"icon-edit\"></i></span> </a>"
                    + "<a onclick=\"deleteLang('"+l.getID()+"')\"><span style=\"float: left;margin-right: 10px;color: brown;cursor: pointer;\">حذف <i class=\"icon-remove\"></i> </span></a>"
                    + "<h4>"+l.getName()+"</h4>\n"
                    + "<p><b> المستوى</b> : "+l.getSKILL_LEVEL_ID()+"<b> الخبرة : </b>"+l.getSKILL_EXPERINCE_ID()+"<b> اخر ممارسة : </b>"+l.getSKILL_LAST_WORK_ID()+"</p>"
                    + "</div></div></div>";
                buffer=buffer+row;
            }

        } else {
            String row = "<p>لا يوجد لغات حالية</p>";
                   
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
