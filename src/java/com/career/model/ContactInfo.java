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
public class ContactInfo implements Serializable{
    private int id;
    private String mail;
    private String phone1;
    private String phone2;
    private int counrty_id;
    private int citiy_id;
    private String other;
    private String address1;
    private String address2;
    private int postalcode; 
    private String box;
    private int fax;
    private String url;
    private int cv_id;
    private String mobile;
    
    
    public void setID(int i){
        this.id=i;
    }
    
    public int getID(){
        return id;
    }
    public void setMobile(String m){
        this.mobile=m;
    }
    
    public String getMobile(){
        return mobile;
    }
    
    public void setMail(String m){
        this.mail=m;
    }
    
    public String getMail(){
        return mail;
    }
    
    public void setPhone1(String p){
        this.phone1=p;
    }
    
    public String getPhone1(){
        return phone1;
    }
    
    public void setPhone2(String p){
        this.phone2=p;
    }
    
    public String getPhone(){
        return phone2;
    }
    
    public void setCounrtyID(int i){
        this.counrty_id=i;
    }
    
    public int getCountryID(){
        return counrty_id;
    }
    
    public void setCitiyID(int i){
        this.citiy_id=i;
    }
    
    public int getCity(){
        return citiy_id;
    }
    
    public void setOther(String o){
        this.other=o;
    }
    
    public String getOther(){
        return other;
    }
    
    public void setAddress1(String a){
        this.address1=a;
    }
    
    public String getAddress1(){
        return address1;
    }
    
    public void setAddress2(String a){
        this.address2=a;
    }
    
    public String getAddress2(){
        return address2;
    }
    
    public void setPostalCode(int i){
        this.postalcode=i;
    }
    
    public int getPostalCode(){
        return postalcode;
    }
    
    public void setBox(String b){
        this.box=b;
    }
    
    public String getBox(){
        return box;
    }
    
    public void setFax(int f){
        this.fax=f;
    }
    
    public int getFax(){
        return fax;
    }
    
    public void setURL(String u){
        this.url=u;
    }
    
    public String getURL(){
        return url;
    }
    
    public void setCVID(int i){
        this.cv_id=i;
    }
    
    public int getCVID(){
        return cv_id;
    }
}
