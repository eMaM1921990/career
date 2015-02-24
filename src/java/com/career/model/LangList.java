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
public class LangList {
    private int id;
    private int SKILL_LEVEL_ID;
    private int SKILL_LAST_WORK_ID;
    private int SKILL_EXPERINCE_ID;
    private int LANG_ID;
    private int CV_ID;
    private String NAME;
    
    
    public void setName(String s){
        this.NAME=s;
    }
    
    public String getName(){
        return NAME;
    }
    
    public void setId(int i){
        this.id=i;
    }
    
    public int getID(){
        return id;
    }
    
    public void setSKILL_LEVEL_ID(int i){
        this.SKILL_LEVEL_ID=i;
    }
    
    public int getSKILL_LEVEL_ID(){
        return SKILL_LEVEL_ID;
    }
    
    public void setSKILL_LAST_WORK_ID(int i){
        this.SKILL_LAST_WORK_ID=i;
    }
    
    public int getSKILL_LAST_WORK_ID(){
        return SKILL_LAST_WORK_ID;
    }
    
    public void setSKILL_EXPERINCE_ID(int i){
        this.SKILL_EXPERINCE_ID=i;
    }
    
    public int getSKILL_EXPERINCE_ID(){
        return SKILL_EXPERINCE_ID;
    }
    
    public void setLANG_ID(int i){
        this.LANG_ID=i;
    }
    
    public int getLANG_ID(){
        return LANG_ID;
    }
    
    public void setCV_ID(int i){
        this.CV_ID=i;
    }
    
    public int getCV_ID(){
        return CV_ID;
    }
    
}
