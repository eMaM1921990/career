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
public class Identifier {
    private int id;
    private String name;
    private String position;
    private String phone;
    private String email;
    private int cv_id;
    private String companyname;
    
    public void setCompanyname(String s){
        this.companyname=s;
    }
    
    public String getCompanyname(){
        return companyname;
    }
    
    public void setId(int i){
        this.id=i;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String s){
        this.name=s;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPosition(String s){
        this.position=s;
    }
    
    public String getPosition(){
        return position;
    }
    
    public void setPhone(String p){
        this.phone=p;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setEmail(String e){
        this.email=e;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setCv_id(int i){
        this.cv_id=i;
    }
    
    public int getCv_id(){
        return cv_id;
    }
}


