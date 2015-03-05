/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.daos;

import com.career.dao.i.dao;
import com.career.model.skillsexperincelevel;
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
public class skillsexperinceleveldao implements dao<skillsexperincelevel>{

    DBConnection db=new DBConnection();
    SQLCommon sql=new SQLCommon();
    @Override
    
    public String Presist(skillsexperincelevel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public skillsexperincelevel Find(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<skillsexperincelevel> FindAll() {
        List<skillsexperincelevel> data=new ArrayList<>();
        try {
            db.connect();
            db.pstm=db.con.prepareStatement(sql.GET_SKILLS_EXPERIENCE_LEVEL);
            db.rs=db.pstm.executeQuery();
            while(db.rs.next()){
                skillsexperincelevel s=new skillsexperincelevel();
                s.setId(db.rs.getInt(1));
                s.setName(db.rs.getString(2));
                data.add(s);
                       
            }
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(skillsexperinceleveldao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }

    @Override
    public List<skillsexperincelevel> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<skillsexperincelevel> FindBy(skillsexperincelevel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(skillsexperincelevel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
