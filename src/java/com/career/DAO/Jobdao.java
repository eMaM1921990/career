/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.Job;
import com.career.utils.DBConnection;
import com.career.utils.SQLCommon;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emam
 */
public class Jobdao implements dao<Job>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(Job o) {
        String result = null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.INSERT_JOB);
            db.pstm.setString(1, o.getName());
            db.pstm.setString(2, o.getDesc());
            db.pstm.setInt(3, o.getEmptype());
            db.pstm.setInt(4, o.getEmpStatus());
            db.pstm.setDouble(5, o.getSalary());
            db.pstm.setInt(6, o.getSalaryID());
            db.pstm.setInt(7, o.getCareerID());
            db.pstm.setInt(8, o.getNoticePeroidID());
            db.pstm.setDouble(9, o.getLastSalary());
            db.pstm.setInt(10, o.getLastSalaryID());
            db.pstm.setInt(11, o.getCV());
            db.pstm.executeUpdate();
            db.closeConnection();
            result = "saved";
        } catch (SQLException ex) {
            db.closeConnection();
            result="["+ex.getErrorCode()+"] message :"+ex.getMessage();
            Logger.getLogger(Jobdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Job Find(String id) {
        Job j=new Job();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_JOB);
            db.pstm.setString(1, id);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                j.setID(db.rs.getInt(1));
                j.setName(db.rs.getString(2));
                j.setDesc(db.rs.getString(3));
                j.setEmptype(db.rs.getInt(4));
                j.setEmpStatus(db.rs.getInt(5));
                j.setSalary(db.rs.getDouble(6));
                j.setSalaryID(db.rs.getInt(7));
                j.setCareerID(db.rs.getInt(8));
                j.setNoticePeroidID(db.rs.getInt(9));
                j.setLastSalary(db.rs.getDouble(10));
                j.setLastSalaryID(db.rs.getInt(11));
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Jobdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return j;
        
    }

    
      public Job FindByID(String id) {
        Job j=new Job();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_JOB_BYID);
            db.pstm.setString(1, id);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                j.setID(db.rs.getInt(1));
                j.setName(db.rs.getString(2));
                j.setDesc(db.rs.getString(3));
                j.setEmptype(db.rs.getInt(4));
                j.setEmpStatus(db.rs.getInt(5));
                j.setSalary(db.rs.getDouble(6));
                j.setSalaryID(db.rs.getInt(7));
                j.setCareerID(db.rs.getInt(8));
                j.setNoticePeroidID(db.rs.getInt(9));
                j.setLastSalary(db.rs.getDouble(10));
                j.setLastSalaryID(db.rs.getInt(11));
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Jobdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return j;
        
    }
    
    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> FindBy(Job o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Job o) {
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.UPDATE_JOB);
            db.pstm.setString(1, o.getName());
            db.pstm.setString(2, o.getDesc());
            db.pstm.setInt(3, o.getEmptype());
            db.pstm.setInt(4, o.getEmpStatus());
            db.pstm.setDouble(5, o.getSalary());
            db.pstm.setInt(6, o.getSalaryID());
            db.pstm.setInt(7, o.getCareerID());
            db.pstm.setInt(8, o.getNoticePeroidID());
            db.pstm.setDouble(9, o.getLastSalary());
            db.pstm.setInt(10, o.getLastSalaryID());
            db.pstm.setInt(11, o.getCV());
            db.pstm.setInt(12, o.getID());
            db.pstm.executeUpdate();
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Jobdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "ok";
        
    }
    
}
