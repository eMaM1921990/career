/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.MemberShip;
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
public class MemberShipdao implements dao<MemberShip> {

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(MemberShip o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.INSERT_MEMBERSHIP);
            db.pstm.setString(1, o.getMemberSince());
            db.pstm.setString(2, o.getRolement());
            db.pstm.setInt(3, o.getCv_ID());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="saved";
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getErrorCode()+"] "+ex.getMessage();
            Logger.getLogger(MemberShipdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
    }

    @Override
    public MemberShip Find(String id) {
        MemberShip m=new MemberShip();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_MEMBERSHIP_BYID);
            db.pstm.setInt(1, Integer.valueOf(id));
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                m.setID(db.rs.getInt(1));
                m.setMemberSince(db.rs.getString(2));
                m.setRolement(db.rs.getString(3));
                m.setCv_ID(db.rs.getInt(4));
                
            }
            
            db.closeConnection();
            
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(MemberShipdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return m;
    }

    @Override
    public String remove(int id) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.DELETE_MEMBERSHIP_BYID);
            db.pstm.setInt(1, id);
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Deleted";
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getErrorCode()+"] : "+ex.getMessage();
            Logger.getLogger(MemberShipdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
    }

    @Override
    public List<MemberShip> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MemberShip> FindByParentId(int parentID) {
        List<MemberShip> data=new ArrayList<>();
        try {
            
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_ALL_MEMBERSHIP_BY_USER);
            db.pstm.setInt(1, parentID);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                MemberShip m=new MemberShip();
                m.setID(db.rs.getInt(1));
                m.setMemberSince(db.rs.getString(2));
                m.setRolement(db.rs.getString(3));
                m.setCv_ID(db.rs.getInt(4));
                data.add(m);
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(MemberShipdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }

    @Override
    public List<MemberShip> FindBy(MemberShip o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(MemberShip o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.UPDATE_MEMBERSHIP_BY_ID);
            db.pstm.setString(1, o.getMemberSince());
            db.pstm.setString(2, o.getRolement());
            db.pstm.setInt(1, o.getID());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Updated";
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getSQLState()+"] :"+ex.getMessage();
            Logger.getLogger(MemberShipdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
                
    }
    
}
