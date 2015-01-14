/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.DAO.Experincedao;
import com.career.DAO.NationalDAO;
import com.career.model.Experince;
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
        
        
        HttpSession session=request.getSession();
        User u=(User)session.getAttribute("login");
        
        NationalDAO dao=new NationalDAO();
        List<National> n=dao.FindAll();
        Experincedao i_dao=new Experincedao();
        Experince e=i_dao.Find(Integer.toString(u.getCv()));
        String buffer=null;
        if(e.getCV()>0){
             buffer = "<div class=\"box box-bordered\">"
                    + "<div class=\"box-title\">"
                    + "<h3><i class=\"icon-edit\"></i>الخبرات</h3>"
                    + "</div>"
                    + " <div class=\"box-content nopadding\">"
                    + "<form class='form-horizontal form-bordered'>";
             
             String row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">تاريخ بدء العمل </label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\"  id=\"f_name\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";

        buffer = buffer + row;
        
        String row2="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">تاريخ ترك العمل</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\"  id=\"f_name\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";
        buffer=buffer+row2;
        
        String rowcombo="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الموقع</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"nationality_id\" id=\"nationality_id\" class='chosen-select'>";
                
        for(National na:n){
            rowcombo=rowcombo+"<option value="+na.getId()+">"+na.getName()+"</option>";
        }
        
        rowcombo=rowcombo+"</select></div></div></div>";
        
        buffer=buffer+rowcombo;
        
        String row3="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">العنوان</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\"  id=\"f_name\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row3;
        String row4="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">اسم الشركة</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\"  id=\"f_name\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row4;
            
        }else{
             buffer = "<div class=\"box box-bordered\">"
                    + "<div class=\"box-title\">"
                    + "<h3><i class=\"icon-edit\"></i>الخبرات</h3>"
                    + "</div>"
                    + " <div class=\"box-content nopadding\">"
                    + "<form class='form-horizontal form-bordered'>";
            String row = "<div class=\"controls\">"
                    + "<label for=\"textfield\" class=\"control-label\"></label>"
                    + " <div class=\"controls\">"
                    + "<div class=\"input-prepend\">"
                    + "<label for=\"textfield\" class=\"control-label\">الخبرات</label>"
                    + "<input type=\"button\" value=\"إضافة\" class='btn btn-green' id=\"addexperince\">"
                    + "</div>"
                    + "</div>"
                    + "</div>";

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
