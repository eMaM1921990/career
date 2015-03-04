/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.model;

/**
 *
 * @author emam
 */
public class RequiredJob {
    private int id;
    private String name;
    private String desc;
    private int employment_type;
    private int employment_status;
    private double salary;
    private int salary_id;
    private int career_id;
    private int notice_period_id;
    private double lastsalary;
    private int lastsalary_id;
    private int cv;
    private String employment_type_name;
    private String employment_status_name;
    private String firstsalary;
    private String lastsalary_name;
    private String career_name;
    private String notice_period_name;
    
    public void setNoticePeriodName(String s){
        this.notice_period_name=s;
    }
    
    public String getNoticePeriodName(){
        return notice_period_name;
    }
    
    public void setCareername(String s){
        this.career_name=s;
    }
    
    public String getCareername(){
        return career_name;
    }
    
    public void setLastSalaryName(String s){
        this.lastsalary_name=s;
    }
    
    public String getLastSalaryName(){
        return lastsalary_name;
    }
    
    public void setFirstSalary(String s){
        this.firstsalary=s;
    }
    
    public String getFirstSalary(){
        return firstsalary;
    }
    public void setEmploymentStatusName(String s){
        this.employment_status_name=s;
    }
    
    public String getEmploymentStatusName(){
        return employment_status_name;
    }
    
    
    public void setEmploymentTypeName(String s){
        this.employment_type_name=s;
    }
    
    public String getEmploymentTypeName(){
        return employment_type_name;
    }
    
    
    public void setCV(int c){
        this.cv=c;
    }
    
    public int getCV(){
        return cv;
    }
    
    public void setID(int i){
        this.id=i;
    }
    
    public int getID(){
        return id;
    }
    
    public void setName(String n){
        this.name=n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setDesc(String descs){
        this.desc=descs;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public void setEmptype(int i){
        this.employment_type=i;
    }
    
    public int getEmptype(){
        return employment_type;
    }
    
    public void setEmpStatus(int i){
        this.employment_status=i;
    }
    
    public int getEmpStatus(){
        return employment_status;
    }
    
    public void setSalary(double sal){
        this.salary=sal;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalaryID(int i){
        this.salary_id=i;
    }
    
    public int getSalaryID(){
        return salary_id;
    }
    
    public void setCareerID(int i){
        this.career_id=i;
    }
    
    public int getCareerID(){
        return career_id;
    }
    
    public void setNoticePeroidID(int i){
        this.notice_period_id=i;
    }
    
    public int getNoticePeroidID(){
        return notice_period_id;
    }
    
    public void setLastSalary(double sal){
        this.lastsalary=sal;
    }
    
    public double getLastSalary(){
        return lastsalary;
    }
    
    public void setLastSalaryID(int i){
        this.lastsalary_id=i;
    }
    
    public int getLastSalaryID(){
        return lastsalary_id;
    }
}
