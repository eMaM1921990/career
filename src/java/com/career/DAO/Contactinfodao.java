/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;

import com.career.dao.i.dao;
import com.career.model.ContactInfo;
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
public class Contactinfodao implements dao<ContactInfo> {

    DBConnection db = new DBConnection();
    SQLCommon sql = new SQLCommon();

    @Override
    public String Presist(ContactInfo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContactInfo Find(String id) {
        ContactInfo c=new ContactInfo();
        try {
            db.connect();
            db.pstm = db.con.prepareStatement(sql.GET_CONTACT_INFO);
            db.pstm.setString(1, id);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                c.setID(db.rs.getInt(1));
                c.setMail(db.rs.getString(2));
                c.setPhone1(db.rs.getString(3));
                c.setPhone2(db.rs.getString(4));
                c.setCounrtyID(db.rs.getInt(5));
                c.setCitiyID(db.rs.getInt(6));
                c.setOther(db.rs.getString(7));
                c.setAddress1(db.rs.getString(8));
                c.setAddress2(db.rs.getString(9));
                c.setPostalCode(db.rs.getInt(10));
                c.setBox(db.rs.getString(11));
                c.setFax(db.rs.getInt(12));
                c.setURL(db.rs.getString(13));
                c.setCVID(db.rs.getInt(14));
                c.setMobile(db.rs.getString(15));
                  
            }
            
            db.closeConnection();
        } catch (SQLException ex) {
            db.closeConnection();
            Logger.getLogger(Contactinfodao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactInfo> FindAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactInfo> FindByParentId(int parentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactInfo> FindBy(ContactInfo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(ContactInfo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
