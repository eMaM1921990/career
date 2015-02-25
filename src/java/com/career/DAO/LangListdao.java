/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.LangList;
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
public class LangListdao implements dao<LangList>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(LangList o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.INSERT_USER_LANG);
            db.pstm.setInt(1, o.getSKILL_LEVEL_ID());
            db.pstm.setInt(2, o.getSKILL_LAST_WORK_ID());
            db.pstm.setInt(3, o.getSKILL_EXPERINCE_ID());
            db.pstm.setInt(4, o.getLANG_ID());
            db.pstm.setInt(5, o.getCV_ID());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Saved";
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getErrorCode()+"] :"+ex.getMessage();
            Logger.getLogger(LangListdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg;
    }

    @Override
    public LangList Find(String id) {
        LangList l=new LangList();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_EDIT_LANG_BY_ID);
            db.pstm.setInt(1, Integer.valueOf(id));
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                
                l.setId(db.rs.getInt(1));
                l.setLANG_ID(db.rs.getInt(5));
                l.setSKILL_EXPERINCE_ID(db.rs.getInt(4));
                l.setSKILL_LAST_WORK_ID(db.rs.getInt(3));
                l.setSKILL_LEVEL_ID(db.rs.getInt(2));
               
            }
            db.closeConnection();
        } catch (SQLException ex) {
             db.closeConnection();
            Logger.getLogger(LangListdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return l;
    }

    @Override
    public String remove(int id) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.REMOVE_LANG_LIST);
            db.pstm.setInt(1, id);
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Deleted";
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getErrorCode()+"]:"+ex.getMessage();
            Logger.getLogger(LangListdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
    }

    @Override
    public List<LangList> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LangList> FindByParentId(int parentID) {
            List<LangList> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_USER_LANG_LIST);
            db.pstm.setInt(1, parentID);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                LangList l=new LangList();
                l.setId(db.rs.getInt(1));
                l.setLANG_ID(db.rs.getInt(3));
                l.setSKILL_EXPERINCE_ID(db.rs.getInt(4));
                l.setSKILL_LAST_WORK_ID(db.rs.getInt(5));
                l.setSKILL_LEVEL_ID(db.rs.getInt(6));
                l.setName(db.rs.getString(2));
                data.add(l);
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(LangListdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
        
    }

    @Override
    public List<LangList> FindBy(LangList o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(LangList o) {
        String msg=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.EDIT_USER_LANG);
            db.pstm.setInt(1, o.getSKILL_LEVEL_ID());
            db.pstm.setInt(2, o.getSKILL_LAST_WORK_ID());
            db.pstm.setInt(3, o.getSKILL_EXPERINCE_ID());
            db.pstm.setInt(4, o.getLANG_ID());
            db.pstm.setInt(5, o.getID());
            db.pstm.executeUpdate();
            db.closeConnection();
            msg="Updated";
        } catch (SQLException ex) {
            db.closeConnection();
            msg="["+ex.getErrorCode()+"]:"+ex.getMessage();
            Logger.getLogger(LangListdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
    }
    
}
