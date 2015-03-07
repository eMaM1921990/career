/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.daos.Citiesdao;
import com.career.daos.NationalDAO;
import com.career.model.Cities;
import com.career.model.National;
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
public class getContactInfo extends HttpServlet {

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
        
        NationalDAO dao=new NationalDAO();
        List<National> n=dao.FindAll();
        
        Citiesdao c_dao=new Citiesdao();
        List<Cities> lc=c_dao.FindAll();
        
        
        String buffer = "";
        
        String row = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">البريد الالكترونى </label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"mail\" id=\"mail\" autocomplete=\"off\" onkeypress=\"return EnglishOnly()\">"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row;
        
        String row2 = "<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">رقم الهاتف الجوال</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Mobile Number\" id=\"mobile\" autocomplete=\"off\" onkeypress=\"return isNumber(event)\">"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row2;
        
        String row3="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">هاتف للاتصال اثناء النهار</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"phone\" id=\"phone1\" autocomplete=\"off\" onkeypress=\"return isNumber(event)\">"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row3;
        
        String row4="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">هاتف للاتصال اثناء المساء</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"phone\" id=\"phone2\" autocomplete=\"off\" onkeypress=\"return isNumber(event)\">"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row4;
        
        String rowcombo="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الدولة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"national\" id=\"counrty_id\" class='chosen-select'>";
                
        for(National na:n){
            rowcombo=rowcombo+"<option value="+na.getId()+">"+na.getName()+"</option>";
        }
        
        rowcombo=rowcombo+"</select></div></div></div>";
        
        buffer=buffer+rowcombo;
        
        String rowcombo2="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">المدينة</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"city\" id=\"citiy_id\" class='chosen-select'>";
                
        for(Cities ci:lc){
            rowcombo2=rowcombo2+"<option value="+ci.getId()+">"+ci.getName()+"</option>";
        }
        
        rowcombo2=rowcombo2+"</select></div></div></div>";
        
        buffer=buffer+rowcombo2;
        
        
        String row5="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">العنوان   (السطر اﻻول)</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Address one\" id=\"address1\" autocomplete=\"off\" onkeypress=\"EnglishOnly()\">"
                + "</div>"
                + "</div>"
                + "</div>";
        buffer=buffer+row5;
        
        String row6="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">العنوان ( السطر الثانى )</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Address two\" id=\"address2\" autocomplete=\"off\" onkeypress=\"EnglishOnly()\">"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row6;
        
        String row7="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">صندوق البريد</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Postal Box\" id=\"box\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row7;
        
        String row8="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الرمز البريدى</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Postal Code\" id=\"postalcode\" autocomplete=\"off\" >"
                + "</div>"
                + "</div>"
                + "</div>";
        buffer=buffer+row8;
        
        String row9="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">رقم الفاكس</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Fax Number\" id=\"fax\" autocomplete=\"off\" onkeypress=\"return isNumber(event)\">"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row9;
        
        String row10="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الموقع الالكترونى</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Web Site url\" id=\"weburl\" autocomplete=\"off\" onkeypress=\"return EnglishOnly()\">"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row10;
        String actionrow="<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"حفظ\" type=\"button\" id=\"savecontactinfo\">"
                + "<button type=\"button\" class=\"btn\">إلغاء</button>"
                + "</div>";
        buffer=buffer+actionrow;
        
        
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
