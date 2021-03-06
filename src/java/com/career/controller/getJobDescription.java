/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.controller;

import com.career.daos.CareerLeverdao;
import com.career.daos.EmpStatusdao;
import com.career.daos.EmpTypedao;
import com.career.daos.NoticePerioddao;
import com.career.daos.Salarydao;
import com.career.model.CareerLevel;
import com.career.model.EmpStatus;
import com.career.model.EmpType;
import com.career.model.NoticePeriod;
import com.career.model.Salary;
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
public class getJobDescription extends HttpServlet {

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
         
        EmpTypedao emptype_dao=new EmpTypedao();
        List<EmpType> emptype=emptype_dao.FindAll();
        
        EmpStatusdao empstatus_dao=new EmpStatusdao();
        List<EmpStatus> empstatus=empstatus_dao.FindAll();
        
        Salarydao s_dao=new Salarydao();
        List<Salary> salary=s_dao.FindAll();
        
        CareerLeverdao c_dao=new CareerLeverdao();
        List<CareerLevel> career=c_dao.FindAll();
        
        NoticePerioddao n_dao=new NoticePerioddao();
        List<NoticePeriod> notice=n_dao.FindAll();
        
        String buffer="";
        
        String row="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">اللقب الوظيفة للوظيفة المرغوية</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<input type=\"text\" placeholder=\"Required Job\" id=\"job_name\" autocomplete=\"off\" >"
               
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row;
        
        String row2="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الوصف</label>"
                + " <div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<textarea name=\"job_desc\" id=\"job_desc\" class=\"input-block-level\"> </textarea>"
                + "</div>"
                + "</div>"
                + "</div>";
        
        buffer=buffer+row2;
        
        String rowcombo="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">نوع التوظيف</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"employment_type_id\" id=\"employment_type_id\" class='chosen-select'>";
                
        for(EmpType e:emptype){
            rowcombo=rowcombo+"<option value="+e.getId()+">"+e.getName()+"</option>";
        }
        
        rowcombo=rowcombo+"</select></div></div></div>";
        
        buffer=buffer+rowcombo;
        
        String rowcombo2="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الحالة الوظيفية</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"employement_status_id\" id=\"employement_status_id\" class='chosen-select'>";
                
        for(EmpStatus e:empstatus){
            rowcombo2=rowcombo2+"<option value="+e.getId()+">"+e.getName()+"</option>";
        }
        
        rowcombo2=rowcombo2+"</select></div></div></div>";
        buffer=buffer+rowcombo2;
        
        String salaryrow="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">الراتب المتوقع</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<input type=\"text\" placeholder=\"Salary\" id=\"salary_amount\" autocomplete=\"off\" onkeypress=\"return isNumber(event)\">"
                + "<select name=\"salary_id\" id=\"salary_id\" class='chosen-select'>";
        
        for(Salary e:salary){
            salaryrow=salaryrow+"<option value="+e.getId()+">"+e.getName()+"</option>";
        }
        
        salaryrow=salaryrow+"</select></div></div></div>";
        
        buffer=buffer+salaryrow;
        
        String rowcombo3="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">المستوى الوظيفى</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"career_level_id\" id=\"career_level_id\" class='chosen-select'>";
        
        for(CareerLevel e:career){
            rowcombo3=rowcombo3+"<option value="+e.getId()+">"+e.getName()+"</option>";
        }
        
        rowcombo3=rowcombo3+"</select></div></div></div>";
        
        buffer=buffer+rowcombo3;
        
        String rowcombo4="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">فترة الاشعار</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<select name=\"notice_period_id\" id=\"notice_period_id\" class='chosen-select'>";
        
         for(NoticePeriod e:notice){
            rowcombo4=rowcombo4+"<option value="+e.getId()+">"+e.getName()+"</option>";
        }
         
         rowcombo4=rowcombo4+"</select></div></div></div>";
         
         buffer=buffer+rowcombo4;
         
         String lastsalaryrow="<div class=\"control-group\">"
                + "<label for=\"textfield\" class=\"control-label\">اخر راتب شهرى</label>"
                + "<div class=\"controls\">"
                + "<div class=\"input-prepend\">"
                + "<div class=\"input-xlarge\">"
                + "<input type=\"text\" placeholder=\"Salary\" id=\"last_salary_amount\" autocomplete=\"off\" onkeypress=\"return isNumber(event)\">"
                + "<select name=\"last_salary_id\" id=\"last_salary_id\" class='chosen-select'>";
        
        for(Salary e:salary){
            lastsalaryrow=lastsalaryrow+"<option value="+e.getId()+">"+e.getName()+"</option>";
        }
        
        lastsalaryrow=lastsalaryrow+"</select></div></div>";
        
        buffer=buffer+lastsalaryrow;
        
        String actionrow="<div class=\"form-actions\">"
                + "<input class=\"btn btn-primary\" value=\"حفظ\" type=\"button\" id=\"savejob\">"
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
