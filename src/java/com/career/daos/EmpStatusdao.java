/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.EmpStatus;
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
public class EmpStatusdao implements dao<EmpStatus>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(EmpStatus o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmpStatus Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List<EmpStatus> FindAll() {
        List<EmpStatus> list=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.EMPLOYMENT_STATUS);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                EmpStatus e=new EmpStatus();
                e.setId(db.rs.getInt(1));
                e.setName(db.rs.getString(2));
                list.add(e);
                
            }
            
            db.rs.close();
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(EmpStatusdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }

    @Override
    public List<EmpStatus> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(EmpStatus o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EmpStatus> FindBy(EmpStatus o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}