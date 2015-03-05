/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.Languages;
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
public class Languagesdao implements dao<Languages>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(Languages o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Languages Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Languages> FindAll() {
        List<Languages> data=new ArrayList<>();
        try {
            
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_LANGAUGE);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                Languages l=new Languages();
                l.setId(db.rs.getInt(1));
                l.setName(db.rs.getString(2));
                data.add(l);
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Languagesdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
       
       
    }

    @Override
    public List<Languages> FindByParentId(int parentID) {
         List<Languages> data=new ArrayList<>();
        try {
            
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_LANGAUGE_CURRENT);
            db.pstm.setInt(1, parentID);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                Languages l=new Languages();
                l.setId(db.rs.getInt(1));
                l.setName(db.rs.getString(2));
                data.add(l);
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Languagesdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }

    @Override
    public List<Languages> FindBy(Languages o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Languages o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
