/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.model;

import java.io.Serializable;

/**
 *
 * @author emam
 */
public class Experince implements Serializable{
    private String startdate;
    private String enddate;
    private int nationalid;
    private String address;
    private String companyname;
    private int company_industry;
    private int career_role_id;
    private String role_name;
    private String desc;
    private int cv;
    private int id;
    
    
    public void setID(int i){
        this.id=i;
    }
    
    public int getID(){
        return id;
    }
    public void setCV(int i){
        this.cv=i;
    }
    
    public int getCV(){
        return cv;
    }
    public void setStartdate(String s){
        this.startdate=s;
    }
    
    public String getStartdate(){
        return startdate;
    }
    
    public void setEnddate(String e){
        this.enddate=e;
    }
    
    public String getEnddate(){
        return enddate;
    }
    
    public void setNationalID(int i){
        this.nationalid=i;
    }
    
    public int getNationalID(){
        return nationalid;
    }
    
    public void setAddress(String a){
        this.address=a;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setCompanyname(String c){
        this.companyname=c;
        
    }
    
    public String getCompanyname(){
        return companyname;
    }
    
    public void setCompanyIndustry(int i){
        this.company_industry=i;
    }
    
    public int getCompanyIndustry(){
        return company_industry;
    }
    
    public void setCareerRoleID(int i){
        this.career_role_id=i;
    }
    
    public int getCareerRoleID(){
        return career_role_id;
    }
    
    public void setRoleName(String r){
        this.role_name=r;
    }
    
    public String getRoleName(){
        return role_name;
    }
    
    public void setDesc(String s){
        this.desc=s;
    }
    
    public String getDesc(){
        return desc;
    }
}
