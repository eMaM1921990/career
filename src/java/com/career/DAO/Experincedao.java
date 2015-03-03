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
import java.util.ArrayList;
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
            db.pstm=db.con.prepareStatement(sql.GET_CURRENT_EXPER_BYID);
            db.pstm.setInt(1, Integer.valueOf(id));
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
              e.setID(db.rs.getInt(1));
                e.setStartdate(db.rs.getString(2));
                e.setEnddate(db.rs.getString(3));
                e.setNationalID(db.rs.getInt(4));
                e.setAddress(db.rs.getString(5));
                e.setCompanyname(db.rs.getString(6));
                e.setCompanyIndustry(db.rs.getInt(7));
                e.setCareerRoleID(db.rs.getInt(8));
                e.setRoleName(db.rs.getString(9));
                e.setDesc(db.rs.getString(10));
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
        List<Experince> list=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_CURRENT_EXPER);
            db.pstm.setInt(1, parentID);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                Experince e=new Experince();
                e.setID(db.rs.getInt(1));
                e.setStartdate(db.rs.getString(2));
                e.setEnddate(db.rs.getString(3));
                e.setNationalname(db.rs.getString(4));
                e.setAddress(db.rs.getString(5));
                e.setCompanyname(db.rs.getString(6));
                e.setCompanyIndustryname(db.rs.getString(7));
                e.setCareer_role_name(db.rs.getString(8));
                e.setRoleName(db.rs.getString(9));
                e.setDesc(db.rs.getString(10));
                list.add(e);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Experincedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

    @Override
    public List<Experince> FindBy(Experince o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Experince o) {
        String msg=null;
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
            msg="Updated";
        } catch (SQLException ex) {
                        db.closeConnection();
                        msg="["+ex.getErrorCode()+"]"+ex.getMessage();
            Logger.getLogger(Experincedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
    }
    
}
