/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.Info;
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
public class Infodao implements dao<Info> {

    DBConnection db = new DBConnection();
    SQLCommon sql = new SQLCommon();

    @Override
    public String Presist(Info o) {
        String result=null;
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.INSERT_INFO);
            db.pstm.setString(1,o.getFname());
            db.pstm.setString(2,o.getSurename());
            db.pstm.setString(3,o.getDob());
            db.pstm.setString(4,o.getGender());
            db.pstm.setInt(5,o.getNationalID());
            db.pstm.setInt(6,o.getVisaStatusID());
            db.pstm.setString(7,o.getMaritalStatus());
            db.pstm.setInt(8,o.getNoofown());
            db.pstm.setInt(9,o.getLicense());
            db.pstm.setInt(10,o.getCvID());
            db.pstm.executeUpdate();
            db.closeConnection();
            result="saved";
        } catch (SQLException ex) {
            Logger.getLogger(Infodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;

    }

    @Override
    public Info Find(String id) {
        Info i = new Info();
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.GET_INFO);
            db.pstm.setString(1, id);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                i.setId(db.rs.getInt(1));
                i.setFname(db.rs.getString(2));
                i.setSurename(db.rs.getString(3));
                i.setDob(db.rs.getString(4));
                i.setGender(db.rs.getString(5));
                i.setNationalID(db.rs.getInt(6));
                i.setVisaStatusID(db.rs.getInt(7));
                i.setMaritalStatus(db.rs.getString(8));
                i.setNoofown(db.rs.getInt(9));
                i.setLicense(db.rs.getInt(10));
                i.setCvID(db.rs.getInt(11));
            }

            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Infodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Info> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Info> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Info> FindBy(Info o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Info o) {
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.UPDATE_INFO);
            db.pstm.setString(1, o.getFname());
            db.pstm.setString(2, o.getSurename());
            db.pstm.setString(3, o.getDob());
            db.pstm.setString(4, o.getGender());
            db.pstm.setInt(5, o.getNationalID());
            db.pstm.setInt(6, o.getVisaStatusID());
            db.pstm.setString(7, o.getMaritalStatus());
            db.pstm.setInt(8, o.getNoofown());
            db.pstm.setInt(9, o.getLicense());
            db.pstm.setInt(10, o.getId());
            db.pstm.executeUpdate();
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Infodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "ok";
    }

}
