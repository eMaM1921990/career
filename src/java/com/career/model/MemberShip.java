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
public class MemberShip {
    private int id;
    private String member_since;
    private String rolement;
    private int cv_id;
    
    public void setID(int i){
        this.id=i;
    }
    
    public int getID(){
        return id;
    }
    
    public void setMemberSince(String s){
        this.member_since=s;
    }
    
    public String getMemberSince(){
        return member_since;
    }
    
    public void setRolement(String r){
        this.rolement=r;
    }
    
    public String getRolement(){
        return rolement;
    }
    
    public void setCv_ID(int i){
        this.cv_id=i;
    }
    
    public int getCv_ID(){
        return cv_id;
    }
           
}
