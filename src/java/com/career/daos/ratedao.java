/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.rate_level;
import com.career.utils.DBConnection;
import com.career.utils.SQLCommon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.jni.Pool;

/**
 *
 * @author emam
 */
public class ratedao implements dao<rate_level>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(rate_level o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public rate_level Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<rate_level> FindAll() {
        List<rate_level> data=new ArrayList<>();
        try {
            
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_RATE_LEVEL);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                rate_level r=new rate_level();
                r.setId(db.rs.getInt(1));
                r.setName(db.rs.getString(2));
                data.add(r);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(ratedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<rate_level> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<rate_level> FindBy(rate_level o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(rate_level o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
