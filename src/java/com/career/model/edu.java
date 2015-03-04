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
public class edu implements Serializable{
    private int id;
    private int country_id;
    private int city_id;
    private String major;
    private String cert;
    private int rate_id;
    private String degree;
    private String enddate;
    private String desc;
    private int cv_id;
    private String name;
    private String countryname;
    private String cityname;
    
    
    public void setCityname(String s){
        this.cityname=s;
    }
    
    public String getCityname(){
        return cityname;
    }
    public void setCountryname(String s){
        this.countryname=s;
        
    }
    
    public String getCountryname(){
        return countryname;
    }
    public void setName(String n){
        this.name=n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setCVid(int i){
        this.cv_id=i;
    }
    
    public int getCVid(){
        return cv_id;
    }
    
    public void setID(int i){
        this.id=i;
    }
    
    public int getID(){
        return id;
    }
    
    public void setCountryID(int i){
        this.country_id=i;
    }
    
    public int getCounrtyID(){
        return country_id;
    }
    
    public void setCityID(int i){
        this.city_id=i;
    }
    
    public int getCityID(){
        return city_id;
    }
    
    
    public void setMajor(String s){
        this.major=s;
    }
    
    public String getMajor(){
        return major;
    }
    
    public void setCert(String c){
        this.cert=c;
    }
    
    public String getCert(){
        return cert;
    }
    
    public void setRateID(int i){
        this.rate_id=i;
    }
    
    public int getRateID(){
        return rate_id;
    }
    
    public void setDegree(String s){
        this.degree=s;
    }
    
    public String getDegree(){
        return degree;
    }
    
    public void setDesc(String s){
        this.desc=s;
    }
    
    public String getDesc(){
        return desc;
    }
    
    
    public void setEndate(String d){
        this.enddate=d;
    }
    
    public String getEndate(){
        return enddate;
    }
}
