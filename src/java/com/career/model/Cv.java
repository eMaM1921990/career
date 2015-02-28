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
public class Cv {
    private int id;
    private String name;
    private String cv_name;
    private int isdefault;
    
    public void setIsDefault(int i){
        this.isdefault=i;
    }
    
    public int getIsDefault(){
        return isdefault;
    }
    
    public void setCV_name(String s){
        this.cv_name=s;
    }
    
    public String getCV_name(){
        return cv_name;
    }
    
    public void setId(int i){
        this.id=i;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String n){
        this.name=n;
    }
    
    public String getName(){
        return name;
    }
}
