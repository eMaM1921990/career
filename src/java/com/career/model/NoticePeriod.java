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
public class NoticePeriod implements Serializable{
    private int id;
    private String name;
    
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
