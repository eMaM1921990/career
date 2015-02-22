/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;


import com.career.dao.i.dao;
import com.career.model.edu;
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
public class edudao implements dao<edu>{
    
    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();

    @Override
    public String Presist(edu o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public edu Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<edu> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<edu> FindByParentId(int parentID) {
        List<edu> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_CURRENT_EDU);
            db.pstm.setInt(1, parentID);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                edu e=new edu();
                e.setID(db.rs.getInt(1));
                e.setCountryID(db.rs.getInt(2));
                e.setCityID(db.rs.getInt(3));
                e.setMajor(db.rs.getString(4));
                e.setCert(db.rs.getString(5));
                e.setRateID(db.rs.getInt(6));
                e.setDegree(db.rs.getString(7));
                e.setEndate(db.rs.getString(8));
                e.setDesc(db.rs.getString(9));
                e.setCVid(db.rs.getInt(10));
                e.setName(db.rs.getString(11));
                data.add(e);
                
            }
            db.closeConnection();
        
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(edudao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return data;
    
    }

    @Override
    public List<edu> FindBy(edu o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(edu o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
