/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.NoticePeriod;
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
public class NoticePerioddao implements dao<NoticePeriod>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(NoticePeriod o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NoticePeriod Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NoticePeriod> FindAll() {
         List<NoticePeriod> list=new ArrayList<>();
        try {
           
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_PERID);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                NoticePeriod n=new NoticePeriod();
                n.setId(db.rs.getInt(1));
                n.setName(db.rs.getString(2));
                list.add(n);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(NoticePerioddao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

    @Override
    public List<NoticePeriod> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(NoticePeriod o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NoticePeriod> FindBy(NoticePeriod o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
