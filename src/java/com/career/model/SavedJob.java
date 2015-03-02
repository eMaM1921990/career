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
public class SavedJob {
   private int id;
   private int job_id;
   private String user;
   private String date_of_save;
   private String NAME;
   private String DESCRIPTION;
   private String POST_DATE;
   private int IS_OPEN;
   
   public void setId(int i){
       this.id=i;
   }
   
   public int getId(){
       return id;
   }
   
   public void setJobId(int i){
       this.job_id=i;
   }
   
   public int getJobId(){
       return job_id;
   }
   
   public void setUser(String s){
       this.user=s;
   }
   
   public String getuser(){
       return user;
   }
   
   public void setDateOfSave(String s){
       this.date_of_save=s;
   }
   
   public String getDateOfSave(){
       return date_of_save;
   }
   
   public void setName(String s){
       this.NAME=s;
   }
   
   public String getName(){
       return NAME;
   }
   
   public void setDesc(String s){
       this.DESCRIPTION=s;
   }
   
   public String getDesc(){
       return DESCRIPTION;
   }
   
   public void setPostDate(String s){
       this.POST_DATE=s;
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
