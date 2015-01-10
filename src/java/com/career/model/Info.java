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
public class Info implements Serializable{
    private int id;
    private String f_name;
    private String surename;
    private String dob;
    private String gender;
    private int nationality_id;
    private int visa_status_id;
    private String material_status;
    private int no_of_own;
    private int driving_license;
    private int cv_user_id;
    
    public void setId(int i){
        this.id=i;
    }
    
    public int getId(){
        return id;
    }
    
    public void setFname(String n){
        this.f_name=n;
        
    }
    
    public String getFname(){
        return f_name;
    }
    
    public void setSurename(String n){
        this.surename=n;
    }
    
    public String getSurename(){
        return surename;
    }
    
    public void setGender(String g){
        this.gender=g;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setDob(String d){
        this.dob=d;
    }
    
    public String getDob(){
        return dob;
    }
    
    public void setNationalID(int i){
        this.nationality_id=i;
    }
    
    public int getNationalID(){
        return nationality_id;
    }
    
    public void setVisaStatusID(int i){
        this.visa_status_id=i;
    }
    
    public int getVisaStatusID(){
        return visa_status_id;
    }
    
    public void setMaritalStatus(String n){
        this.material_status=n;
    }
    
    public String getMaritalStatus(){
        return material_status;
    }
    
    public void setNoofown(int i){
        this.no_of_own=i;
    }
    
    public int getNoofown(){
        return no_of_own;
    }
    
    public void setLicense(int i){
        this.driving_license=i;
    }
    
    public int getLicense(){
        return driving_license;
    }
    
    public void setCvID(int i){
        this.cv_user_id=i;
    }
    
    public int getCvID(){
        return cv_user_id;
    }
    
    
}
