/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.SkillList;
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
public class SkillListdao implements dao<SkillList> {

    DBConnection db = new DBConnection();
    SQLCommon sql = new SQLCommon();

    @Override
    public String Presist(SkillList o) {
        String msg = null;
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.INSERT_SKILL_LIST);
            db.pstm.setString(1, o.getSkillname());
            db.pstm.setInt(2, o.getSkill_level_id());
            db.pstm.setInt(3, o.getSkill_last_work_id());
            db.pstm.setInt(4, o.getskillexperince_level_id());
            db.pstm.setInt(5, o.getCv_id());
            db.pstm.executeUpdate();
            msg = "saved";
        } catch (SQLException ex) {
            msg = "[" + ex.getErrorCode() + "] message :" + ex.getMessage();

            Logger.getLogger(SkillListdao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return msg;
    }

    @Override
    public SkillList Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.DELETE_SKILL_BY_ID);
            db.pstm.setInt(1, id);
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Deleted";
        } catch (SQLException ex) {
            msg="["+ex.getErrorCode()+"] :"+ex.getMessage();
            db.closeConnection();
            Logger.getLogger(SkillListdao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return msg;
    }

    @Override
    public List<SkillList> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SkillList> FindByParentId(int parentID) {
        List<SkillList> data = new ArrayList<>();
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.GET_SKILL_LIST);
            db.pstm.setInt(1, parentID);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                SkillList s = new SkillList();
                s.setId(db.rs.getInt(1));
                s.setSkillname(db.rs.getString(2));
                s.setSkill_level_id(db.rs.getInt(3));
                s.setSkill_last_work_id(db.rs.getInt(4));
                s.setskillexperince_level_id(db.rs.getInt(5));
                data.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SkillListdao.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.closeConnection();

        return data;

    }

    @Override
    public List<SkillList> FindBy(SkillList o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(SkillList o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
