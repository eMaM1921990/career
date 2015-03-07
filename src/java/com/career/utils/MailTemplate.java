/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.career.utils;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emam
 */
public class MailTemplate {
    
    DBConnection db=new DBConnection();
    public String getAutAddress() {
        String AutAddress = null;
        try {

            db.connect();
            String sql = "SELECT mailserver FROM sysconfig WHERE sysconfig_id>0";
            db.pstm = db.con.prepareStatement(sql);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                AutAddress = db.rs.getString(1);
            }
            db.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(MailTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AutAddress;
    }

    public String getAutPassword() {
        String AutPass = null;
        try {

            db.connect();
            String sql = "SELECT mailserverpass FROM sysconfig WHERE sysconfig_id>0";
            db.pstm = db.con.prepareStatement(sql);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                AutPass = db.rs.getString(1);
            }
            db.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(MailTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AutPass;
    }

    public String getSMTPPort() {
        String SMTPPort = null;
        try {

            db.connect();
            String sql = "SELECT mailport FROM sysconfig WHERE sysconfig_id>0";
            db.pstm = db.con.prepareStatement(sql);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                SMTPPort = db.rs.getString(1);
            }
            db.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(MailTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SMTPPort;
    }

    public String getsmtpServer() {
        String smtpServer = null;
        try {

            db.connect();
            String sql = "SELECT smtpServer FROM sysconfig WHERE sysconfig_id>0";
            db.pstm = db.con.prepareStatement(sql);
            db.rs = db.pstm.executeQuery();
            while (db.rs.next()) {
                smtpServer = db.rs.getString(1);
            }
            db.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(MailTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return smtpServer;
    }
    
}
