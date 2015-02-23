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
public class SkillList {
    private int id;
    private String skill_name;
    private int skill_level_id;
    private int skill_leve_last_work_id;
    private int skillexperince_level_id;
    private int cv_id;
    
    public void setCv_id(int i){
        this.cv_id=i;
    }
    
    public int getCv_id(){
        return cv_id;
    }
    
    public void setId(int i){
        this.id=i;
    }
    
    public int getId(){
        return id;
    }
    
    public void setSkillname(String s){
        this.skill_name=s;
    }
    
    public String getSkillname(){
        return skill_name;
    }
    
    public void setSkill_level_id(int i){
        this.skill_level_id=i;
    }
    
    public int getSkill_level_id(){
        return skill_level_id;
    }
    
    public void setSkill_last_work_id(int i){
        this.skill_leve_last_work_id=i;
    }
    
    public int getSkill_last_work_id(){
        return skill_leve_last_work_id;
    }
    
    
    public void setskillexperince_level_id(int i){
        this.skillexperince_level_id=i;
    }
    
    public int getskillexperince_level_id(){
        return skillexperince_level_id;
    }
}
