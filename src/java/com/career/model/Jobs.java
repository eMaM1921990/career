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
public class Jobs {
    private int ID;
    private String NAME;
    private int DEPT_ID;
    private String DESCRIPTION;
    private String POST_DATE;
    private int IS_OPEN;
    private String USER;
    
    public void setUser(String s){
        this.USER=s;
    }
    
    public String getUser(){
        return USER;
    }
    
    public void setId(int i){
        this.ID=i;
    }
    
    public int getId(){
        return ID;
    }
    
    
    public void setName(String s){
        this.NAME=s;
    }
    
    public String getName(){
        return NAME;
    }
    
    public void setDeptid(int i){
        this.DEPT_ID=i;
    }
    
    
    public int getDeptid(){
        return DEPT_ID;
    }
            
    public void setDesc(String s){
        this.DESCRIPTION=s;
    }
    
    public String getDesc(){
        return DESCRIPTION;
    }
    
    public void setPostDate(String d){
        this.POST_DATE=d;
    }
    
    public String getPostDate(){
        return POST_DATE;
    }
    
    public void setIsOpen(int i){
        this.IS_OPEN=i;
    }
    
    
    public int getIsOpen(){
        return IS_OPEN;
    }
}
