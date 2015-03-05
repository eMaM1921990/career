/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.Identifier;
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
public class Identifierdao implements dao<Identifier>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(Identifier o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.INSERT_IDENTIFIER);
            db.pstm.setString(1, o.getName());
            db.pstm.setString(2, o.getCompanyname());
            db.pstm.setString(3, o.getPosition());
            db.pstm.setString(4, o.getPhone());
            db.pstm.setString(5, o.getEmail());
            db.pstm.setInt(6, o.getCv_id());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="saved";
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getErrorCode()+"]"+ex.getMessage();
            Logger.getLogger(Identifierdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
    }

    @Override
    public Identifier Find(String id) {
        Identifier i=new Identifier();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_USER_IDENTIFIER_TOUPDATE);
            db.pstm.setInt(1, Integer.valueOf(id));
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                i.setName(db.rs.getString(1));
                i.setCompanyname(db.rs.getString(2));
                i.setPosition(db.rs.getString(3));
                i.setPhone(db.rs.getString(4));
                i.setEmail(db.rs.getString(5));
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Identifierdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
    }

    @Override
    public String remove(int id) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.DELETE_USER_IDENTIFIER);
            db.pstm.setInt(1, id);
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="saved";
        } catch (SQLException ex) {
            msg="["+ex.getErrorCode()+"]"+ex.getMessage();
            db.closeConnection();
            Logger.getLogger(Identifierdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
        
    }

    @Override
    public List<Identifier> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Identifier> FindByParentId(int parentID) {
        List<Identifier> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_IDENTIFIER_BY_CV);
            db.pstm.setInt(1, parentID);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                Identifier i=new Identifier();
                i.setId(db.rs.getInt(1));
                i.setName(db.rs.getString(2));
                i.setCompanyname(db.rs.getString(3));
                i.setPosition(db.rs.getString(4));
                i.setPhone(db.rs.getString(5));
                i.setEmail(db.rs.getString(6));
                i.setCv_id(db.rs.getInt(7));
                data.add(i);
                
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Identifierdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }

    @Override
    public List<Identifier> FindBy(Identifier o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Identifier o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.UPDATE_USER_IDENTIFIER);
            db.pstm.setString(1, o.getName());
            db.pstm.setString(2, o.getCompanyname());
            db.pstm.setString(3, o.getPosition());
            db.pstm.setString(4, o.getPhone());
            db.pstm.setString(5, o.getEmail());
            db.pstm.setInt(6, o.getId());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Updated";
        } catch (SQLException ex) {
            msg="["+ex.getErrorCode()+"]:"+ex.getMessage();
            db.closeConnection();
            Logger.getLogger(Identifierdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
    }
    
}
