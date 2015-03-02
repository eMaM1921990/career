/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.Jobs;
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
public class Jobsdao implements dao<Jobs>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(Jobs o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.APPLY_TO_JOB);
            db.pstm.setInt(1, o.getJobid());
            db.pstm.setInt(2, o.getUsercv());
            db.pstm.setString(3, o.getUser());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Applied";
            
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getErrorCode()+"]"+ex.getMessage();
            Logger.getLogger(Jobsdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
    }

    @Override
    public Jobs Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Jobs> FindAll() {
        List<Jobs> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_JOB_SEARCH);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                Jobs j=new Jobs();
                j.setName(db.rs.getString(1));
                j.setDesc(db.rs.getString(2));
                j.setPostDate(db.rs.getString(3));
                j.setIsOpen(db.rs.getInt(4));
                j.setUser(db.rs.getString(5));
                j.setId(db.rs.getInt(6));
                data.add(j);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Jobsdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<Jobs> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Jobs> FindBy(Jobs o) {
        List<Jobs> data=new ArrayList<>();
        data.clear();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_JOB_SEARCH);
            db.pstm.setString(1, "%" + o.getName() + "%");
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                Jobs j=new Jobs();
                j.setName(db.rs.getString(1));
                j.setDesc(db.rs.getString(2));
                j.setPostDate(db.rs.getString(3));
                j.setIsOpen(db.rs.getInt(4));
                j.setUser(db.rs.getString(5));
                j.setId(db.rs.getInt(6));
                data.add(j);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Jobsdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public String update(Jobs o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
