/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.User;
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
public class Userdao implements dao<User> {

    DBConnection db = new DBConnection();
    SQLCommon sql = new SQLCommon();

    @Override
    public String Presist(User o) {
        String result = null;

        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.REGISTER);
            db.pstm.setString(1, o.getU_name());
            db.pstm.setString(2, o.getPassword());
            db.pstm.setString(3, o.getF_name());
            db.pstm.setString(4, o.getL_name());
            db.pstm.setString(5, o.getBOD());
            db.pstm.setInt(6, o.getNationality_ID());
            db.pstm.setString(7, o.getMail());
            db.pstm.setString(8, o.getHear_About_US());
            db.pstm.setString(9, o.getGender());
            db.pstm.setInt(10, o.getNotification_Register());
            int i = db.pstm.executeUpdate();
            db.closeConnection();
            result = "saved";
        } catch (SQLException ex) {
            db.closeConnection();
             result="["+ex.getErrorCode()+"] message :"+ex.getMessage();
            Logger.getLogger(Userdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public User Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public List<User> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public User FindBydata(User o) {
       User u=new User();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_LOGIN);
            db.pstm.setString(1, o.getU_name());
            db.pstm.setString(2, o.getPassword());
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                
                u.setU_name(db.rs.getString(1));
                u.setF_name(db.rs.getString(3));
                u.setL_name(db.rs.getString(4));
                u.setCv(db.rs.getInt(11));
            }
            
            db.closeConnection();
            
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Userdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return u;
    }

    @Override
    public List<User> FindBy(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
