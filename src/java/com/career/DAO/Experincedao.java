/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.Experince;
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
public class Experincedao implements dao<Experince>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(Experince o) {
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.INSERT_EXPERIENCE);
            db.pstm.setString(1, o.getStartdate());
            db.pstm.setString(2, o.getEnddate());
            db.pstm.setInt(3, o.getNationalID());
            db.pstm.setString(4, o.getAddress());
            db.pstm.setString(5, o.getCompanyname());
            db.pstm.setInt(6, o.getCompanyIndustry());
            db.pstm.setInt(7,o.getCareerRoleID());
            db.pstm.setString(8, o.getRoleName());
            db.pstm.setString(9, o.getDesc());
            db.pstm.setInt(10,o.getCV());
            db.pstm.executeUpdate();
            db.closeConnection();
                    
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Experincedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "ok";
    }

    @Override
    public Experince Find(String id) {
        Experince e=new Experince();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_CURRENT_EXPER);
            db.pstm.setInt(2, Integer.valueOf(id));
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                e.setID(db.rs.getInt(1));
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Experincedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return e;
    }

    @Override
    public String remove(int id) {
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.DELETE_EXPERINCE);
            db.pstm.setInt(1, id);
            db.pstm.executeUpdate();
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Experincedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "ok";
        
    }

    @Override
    public List<Experince> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Experince> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Experince> FindBy(Experince o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Experince o) {
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.UPDATE_EXPERIENCE);
            db.pstm.setString(1, o.getStartdate());
            db.pstm.setString(2, o.getEnddate());
            db.pstm.setInt(3, o.getNationalID());
            db.pstm.setString(4, o.getAddress());
            db.pstm.setString(5, o.getCompanyname());
            db.pstm.setInt(6, o.getCompanyIndustry());
            db.pstm.setInt(7,o.getCareerRoleID());
            db.pstm.setString(8, o.getRoleName());
            db.pstm.setString(9, o.getDesc());
            db.pstm.setInt(10,o.getCV());
            db.pstm.setInt(11, o.getID());
            db.pstm.executeUpdate();
            db.closeConnection();
        } catch (SQLException ex) {
                        db.closeConnection();
            Logger.getLogger(Experincedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "ok";
    }
    
}
