/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.Cv;
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
public class cvdao implements dao<Cv>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(Cv o) {
        String result=null;
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.INSERT_CV, db.pstm.RETURN_GENERATED_KEYS);
            db.pstm.setString(1, o.getName());
            db.pstm.setString(2, o.getCV_name());
            db.pstm.execute();
            db.rs=db.pstm.getGeneratedKeys();
            while(db.rs.next()){
                result=db.rs.getString(1);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(cvdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public Cv Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cv> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cv> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cv> FindBy(Cv o) {
        List<Cv> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_USER_CVS);
            db.pstm.setString(1, o.getName());
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                Cv c=new Cv();
                c.setId(db.rs.getInt(1));
                c.setName(db.rs.getString(2));
                c.setCV_name(db.rs.getString(3));
                c.setIsDefault(db.rs.getInt(4));
                data.add(c);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(cvdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }

    @Override
    public String update(Cv o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
