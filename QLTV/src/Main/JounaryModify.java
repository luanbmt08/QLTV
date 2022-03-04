/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class JounaryModify {
/**
 *
 * @author ADMIN
 */ public static List<Jounary> getJounaryList(String s){
        List<Jounary> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
  try {
            conn = DriverManager.getConnection(ConnectSQL.URL,ConnectSQL.USERNAME, ConnectSQL.PASSWORD);
            
            String sql = "select * from Jounary";
            if(s != null && !s.isEmpty()) {
                sql += " where IdTaiLieu like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Jounary tapchi = new Jounary(
                        resultSet.getString("IdTaiLieu"),
                        resultSet.getString("TenNXB"),
                        resultSet.getString("SoBPH"),
                        resultSet.getString("SoPH"),
                        resultSet.getString("ThangPH")
                );
                dataList.add(tapchi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(Jounary tapchi) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME,ConnectSQL.PASSWORD);
            
            String sql = "insert into sach(IdTaiLieu,TenNXB,SoBPH,SoPH,ThangPH) "
                    + "values (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, tapchi.getIdTaiLieu());
            statement.setString(2, tapchi.getTenNXB());
            statement.setString(3, tapchi.getSoBPH());
             statement.setString(4, tapchi.getSoPH());
            statement.setString(5, tapchi.getThangPH());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(Jounary tapchi) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME, ConnectSQL.PASSWORD);
            
            String sql = "update sach set IdTaiLieu = ?, TenNXB = ?, SoBPH = ?, SoPH = ?, ThangPH = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, tapchi.getIdTaiLieu());
            statement.setString(2, tapchi.getTenNXB());
            statement.setString(3, tapchi.getSoBPH());
             statement.setString(4, tapchi.getSoPH());
            statement.setString(5, tapchi.getThangPH());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String IdTaiLieu) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME, ConnectSQL.PASSWORD);
            
            String sql = "delete from Sach where IdTaiLieu = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, IdTaiLieu);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JounaryModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
