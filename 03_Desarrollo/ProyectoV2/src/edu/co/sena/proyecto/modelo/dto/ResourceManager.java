package edu.co.sena.proyecto.modelo.dto;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sena-901540
 */
public class ResourceManager {
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/acs";
    private static String JDBC_USER = "root";
    private static  String JDBC_PASSWORD = "123456789";
    
    public static Connection getConection(){
        Connection conexion = null;

      try {
         conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
       } catch (Exception e) {
           System.err.println("Falla en la conexion"+e.getMessage());
       }
        return conexion;
    } 
    
    public static void close(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.err.println("error al cerrrar la conexion " + e.getMessage());
        }

    }
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            System.out.println("no se cerro la resulset "+ sqle.getMessage());
        }

    }
    public static void close(PreparedStatement sentencia) {
        try {
            if (sentencia != null) {
                sentencia.close();
            }
        } catch (SQLException sqle) {
            System.out.println("no se cerro la sentencia "+ sqle.getMessage());
        }

    }
}
