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
public class User implements Serializable{
    
    private String u_name;
    private String password;
    private String f_name;
    private String l_name;
    private String bod;
    private int nationality_id;
    private String mail;
    private String hear_about_us;
    private String gender;
    private int notification_register;
    private int cv;
    private int contact_info;
    
    public void setContactInfo(int i){
        this.contact_info=i;
    }
    
    public int getContactInfo(){
        return contact_info;
    }
    
    public void setCv(int c){
        this.cv=c;
    }
    
    public int getCv(){
        return cv;
    }
    
    public void setU_name(String u){
        this.u_name=u;
    }
    
    public String getU_name(){
        return u_name;
    }
    
    public void setPassword(String p){
        this.password=p;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setF_name(String n){
        this.f_name=n;
    }
    
    public String getF_name(){
        return f_name;
    }
    
    public void setL_name(String n){
        this.l_name=n;
    }
    
    public String getL_name(){
        return l_name;
    }
    
    public void setBOD(String d){
        this.bod=d;
    }
    
    public String getBOD(){
        return bod;
    }
    
    public void setNationality_ID(int i){
        this.nationality_id=i;
    }
      
    public int getNationality_ID(){
        return nationality_id;
    }
    
    public void setMail(String m){
        this.mail=m;
    }
    
    public String getMail(){
        return mail;
    }
    
    public void setHear_About_US(String u){
        this.hear_about_us=u;
    }
    
    public String getHear_About_US(){
        return hear_about_us;
    }
    
    public void setGender(String g){
        this.gender=g;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setNotification_Register(int n){
        this.notification_register=n;
        
    }
    
    public int getNotification_Register(){
        return notification_register;
    }
}
