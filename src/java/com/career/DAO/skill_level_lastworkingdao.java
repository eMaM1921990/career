/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.skill_level_lastworking;
import com.career.utils.DBConnection;
import com.career.utils.SQLCommon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emam
 */
public class skill_level_lastworkingdao implements dao<skill_level_lastworking>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(skill_level_lastworking o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public skill_level_lastworking Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<skill_level_lastworking> FindAll() {
        List<skill_level_lastworking> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_LASTWORKING_SKILLS);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                skill_level_lastworking s=new skill_level_lastworking();
                s.setId(db.rs.getInt(1));
                s.setName(db.rs.getString(2));
                data.add(s);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(skill_level_lastworkingdao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return data;
    }

    @Override
    public List<skill_level_lastworking> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<skill_level_lastworking> FindBy(skill_level_lastworking o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(skill_level_lastworking o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
