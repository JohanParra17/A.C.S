package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.co.sena.proyecto.modelo.dto.ResourceManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before; 
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sena-901540
 */
public class TestResourceManager {

    public TestResourceManager() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getConection method, of class ResourceManager.
     */
    @Test
    public void testGetConection() throws SQLException {
        System.out.println("getConection");
        Connection resultado = ResourceManager.getConection();
        resultado.close();

    }
    @Test
    public void testCloseConection() throws SQLException {
        System.out.println("CloseConection");
        Connection resultado = ResourceManager.getConection();
        ResourceManager.close(resultado);

    }
     @Test
    public void testCloseAll() throws SQLException {
        System.out.println("closeConection");

        Connection conexion = ResourceManager.getConection();
        ResultSet rs = null;
        PreparedStatement sentencia = null;
        String sqlPrepared = "SELECT * FROM acs.usuario where TIPO_DOCUMENTO = ?;";
        sentencia = conexion.prepareStatement(sqlPrepared);
        sentencia.setInt(1, 1);
        rs = sentencia.executeQuery();

        if (!rs.wasNull()) {
            while (rs.next()) {
                System.out.println("TIPO_DOCUMENTO: " + rs.getString(1));

                System.out.println("------------------------------------------------------");
            }

        }
        ResourceManager.close(rs);
        ResourceManager.close(sentencia);
        
        ResourceManager.close(conexion);

    }

}
