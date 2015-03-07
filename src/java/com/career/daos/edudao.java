/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.edu;
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
public class edudao implements dao<edu> {

    DBConnection db = new DBConnection();
    SQLCommon sql = new SQLCommon();

    @Override
    public String Presist(edu o) {
        String msg = null;
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.INSERT_EDU);
            db.pstm.setInt(1, o.getCounrtyID());
            db.pstm.setInt(2, o.getCityID());
            db.pstm.setString(3, o.getMajor());
            db.pstm.setString(4, o.getCert());
            db.pstm.setInt(5, o.getRateID());
            db.pstm.setString(6, o.getDegree());
            db.pstm.setString(7, o.getEndate());
            db.pstm.setString(8, o.getDesc());
            db.pstm.setInt(9, o.getCVid());
            db.pstm.setString(10, o.getName());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg = "Data Saved";
        } catch (SQLException ex) {
            db.closeConnection();
            msg = "[" + ex.getErrorCode() + "] message :" + ex.getMessage();
            Logger.getLogger(edudao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return msg;
    }

    @Override
    public edu Find(String phone) {
        edu e = new edu();
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.GET_EDU_BY_ID);
            db.pstm.setInt(1, Integer.valueOf(phone));
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                e.setID(db.rs.getInt(1));
                e.setCountryID(db.rs.getInt(2));
                e.setCityID(db.rs.getInt(3));
                e.setMajor(db.rs.getString(4));
                e.setCert(db.rs.getString(5));
                e.setRateID(db.rs.getInt(6));
                e.setDegree(db.rs.getString(7));
                e.setEndate(db.rs.getString(8));
                e.setDesc(db.rs.getString(9));
                e.setCVid(db.rs.getInt(10));
                e.setName(db.rs.getString(11));
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(edudao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return e;
    }

    @Override
    public String remove(int id) {
        String msg = null;
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.DELETE_EDU);
            db.pstm.setInt(1, id);
            db.pstm.executeUpdate();
            db.closeConnection();
            msg = "Deleted";
        } catch (SQLException ex) {
            db.closeConnection();
            msg = "[" + ex.getErrorCode() + "]" + ex.getMessage();
            Logger.getLogger(edudao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return msg;
    }

    @Override
    public List<edu> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<edu> FindByParentId(int parentID) {
        List<edu> data = new ArrayList<>();
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.GET_CURRENT_EDU);
            db.pstm.setInt(1, parentID);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                edu e = new edu();
                e.setID(db.rs.getInt(1));
                e.setCountryname(db.rs.getString(16));
                e.setName(db.rs.getString(13));
                e.setMajor(db.rs.getString(4));
                e.setCert(db.rs.getString(5));
                e.setRatename(db.rs.getString(18));
                e.setDegree(db.rs.getString(7));
                e.setEndate(db.rs.getString(8));
                e.setDesc(db.rs.getString(9));
                e.setCVid(db.rs.getInt(10));
                e.setName(db.rs.getString(11));
                data.add(e);

            }
            db.closeConnection();

        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(edudao.class.getName()).log(Level.SEVERE, null, ex);

        }

        return data;

    }

    @Override
    public List<edu> FindBy(edu o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(edu o) {
        String msg=null;
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.UPDATE_EDU);
            db.pstm.setInt(1, o.getCounrtyID());
            db.pstm.setInt(2, o.getCityID());
            db.pstm.setString(3, o.getMajor());
            db.pstm.setString(4, o.getCert());
            db.pstm.setInt(5, o.getRateID());
            db.pstm.setString(6, o.getDegree());
            db.pstm.setString(7, o.getEndate());
            db.pstm.setString(8, o.getDesc());
            db.pstm.setInt(9, o.getCVid());
            db.pstm.setString(10, o.getName());
            db.pstm.setInt(11, o.getID());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Updated";
            
        } catch (SQLException ex) {
            msg="["+ex.getErrorCode()+"]"+ex.getMessage();
            db.closeConnection();
            Logger.getLogger(edudao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;

    }

}
