/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.SavedJob;
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
public class savedjobdao implements dao<SavedJob>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(SavedJob o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.INSERT_SAVE_JOB);
            db.pstm.setInt(1, o.getJobId());
            db.pstm.setString(2, o.getuser());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Job Saved";
        } catch (SQLException ex) {
            msg="["+ex.getSQLState()+"]"+ex.getMessage();
            Logger.getLogger(savedjobdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
    }

    @Override
    public SavedJob Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SavedJob> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SavedJob> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SavedJob> FindBy(SavedJob o) {
        List<SavedJob> data=new ArrayList<>();
        data.clear();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_SAVE_JOB);
            db.pstm.setString(1, o.getuser());
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                SavedJob s=new SavedJob();
                s.setId(db.rs.getInt(1));
                s.setName(db.rs.getString(2));
                s.setDesc(db.rs.getString(3));
                s.setPostDate(db.rs.getString(4));
                s.setIsOpen(db.rs.getInt(5));
                data.add(s);
            }
            
            db.closeConnection();
            
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(savedjobdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public String update(SavedJob o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
