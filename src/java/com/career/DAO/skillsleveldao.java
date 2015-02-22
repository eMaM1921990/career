/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.skillslevel;
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
public class skillsleveldao implements dao<skillslevel>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    public String Presist(skillslevel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public skillslevel Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<skillslevel> FindAll() {
        List<skillslevel> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_SKILLS_LEVEL);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                skillslevel s=new skillslevel();
                s.setId(db.rs.getInt(1));
                s.setName(db.rs.getString(2));
                data.add(s);
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(skillsleveldao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }

    @Override
    public List<skillslevel> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<skillslevel> FindBy(skillslevel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(skillslevel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
