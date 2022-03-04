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
public class NewspaperModify {
    public static List<Newspaper> getNewspaperList(String s){
        List<Newspaper> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
  try {
            conn = DriverManager.getConnection(ConnectSQL.URL,ConnectSQL.USERNAME, ConnectSQL.PASSWORD);
            
            String sql = "select * from Newspaper";
            if(s != null && !s.isEmpty()) {
                sql += " where IdTaiLieu like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Newspaper bao = new Newspaper(
                        resultSet.getString("IdTaiLieu"),
                        resultSet.getString("TenNXB"),
                        resultSet.getString("SoBPH"),
                        resultSet.getString("NgayPH")
        
                );
                dataList.add(bao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(Newspaper bao) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME,ConnectSQL.PASSWORD);
            
            String sql = "insert into sach(IdTaiLieu,TenNXB,SoBPH,NgayPH) "
                    + "values (?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, bao.getIdTaiLieu());
            statement.setString(2, bao.getTenNXB());
            statement.setString(3, bao.getSoBPH());
             statement.setString(4, bao.getNgayPH());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(Newspaper bao) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME, ConnectSQL.PASSWORD);
            
            String sql = "update sach set IdTaiLieu = ?, TenNXB = ?, SoBPH = ?, NgayPH = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, bao.getIdTaiLieu());
            statement.setString(2, bao.getTenNXB());
            statement.setString(3, bao.getSoBPH());
             statement.setString(4, bao.getNgayPH());
        
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
            Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NewspaperModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}

