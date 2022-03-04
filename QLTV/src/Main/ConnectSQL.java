package Main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public interface ConnectSQL {
    String URL="jdbc:jtds:sqlserver://DESKTOP-S33MT4O:1433/QLTV;instance=SQLEXPRESS";
    String USERNAME = "sa";
    String PASSWORD = "123456";
 } 

