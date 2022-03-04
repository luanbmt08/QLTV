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
public class BookModify {
    public static List<Book> getBookList(String s){
        List<Book> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
         
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME, ConnectSQL.PASSWORD);
            String sql = "select * from Book";
            if(s!= null && !s.isEmpty()) {
                sql += " where idTaiLieu like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Book sach = new Book(
                        resultSet.getString("IdTaiLieu"),
                        resultSet.getString("TenNXB"),
                        resultSet.getString("SoBPH"),
                        resultSet.getString("TenTG"),
                        resultSet.getString("SoTrang")
                );
                dataList.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(Book sach) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME,ConnectSQL.PASSWORD);
            
            String sql = "insert into Book(IdTaiLieu,TenNXB,SoBPH,TenTG,SoTrang) "
                    + "values (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, sach.getIdTaiLieu());
            statement.setString(2, sach.getTenNXB());
            statement.setString(3, sach.getSoBPH());
            statement.setString(4, sach.getTenTG());
            statement.setString(5, sach.getSoTrang());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(Book sach) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME, ConnectSQL.PASSWORD);
            
            String sql = "update Book set idTaiLieu = ?, TenNXB = ?, SoBPH = ?, TenTG = ?, SoTrang = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, sach.getIdTaiLieu());
            statement.setString(2, sach.getTenNXB());
            statement.setString(3, sach.getSoBPH());
             statement.setString(4, sach.getTenTG());
            statement.setString(5, sach.getSoTrang());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String IdSach) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(ConnectSQL.URL, ConnectSQL.USERNAME,ConnectSQL.PASSWORD);
            
            String sql = "delete from Sach where idTaiLieu = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, IdSach);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
