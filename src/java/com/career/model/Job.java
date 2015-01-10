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
public class Job {
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
        this.salary=sal;
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
