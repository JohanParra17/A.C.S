/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.test;

import edu.co.sena.proyecto.modelo.dao.mysql.RegistroDAOImp;
import edu.co.sena.proyecto.modelo.dto.Registro;
import edu.co.sena.proyecto.modelo.dto.RegistroPk;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
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
public class ResgistroDAOImpTest {
    
    public ResgistroDAOImpTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testfindAll() {
        System.out.println("FindAll");
        RegistroDAOImp instance = new RegistroDAOImp();
        List<Registro> registro1 = instance.findAll();
        for (Registro registro : registro1) {
            System.out.println(registro1.toString());
        }
        
    }
    
     @Test
    public void testInsert() {
         System.out.println("insert");
         Registro registroDTO = new Registro();
         Timestamp ts1 = new Timestamp(0);
         registroDTO.setIdRegistro(12345);
         registroDTO.setCuentaNumeroDocumento("1012437950");
         registroDTO.setCuentaTipoDocumento("C.C");
         
         registroDTO.setFechaEntrada_horaEntrada(ts1);
         registroDTO.setFechaSalida_horaSalida(ts1);
         
         
    }
    
    @Test
    public void testUpdate () {
         System.out.println("update");
         Registro registroDTO = new Registro();
         Timestamp ts1 = new Timestamp(0);
         registroDTO.setCuentaNumeroDocumento("124658488");
         registroDTO.setCuentaTipoDocumento("C.C");
         registroDTO.setIdRegistro(41564);
         registroDTO.setFechaEntrada_horaEntrada(ts1);
         registroDTO.setFechaSalida_horaSalida(ts1);
         
         RegistroDAOImp instance = new RegistroDAOImp();
         instance.update(registroDTO);
    }
    
        @Test
    public void testUpdatePk () throws SQLException{
        
            System.out.println("updatePK");
            RegistroPk nuevo = new RegistroPk();
            RegistroPk viejo = new RegistroPk();
            RegistroDAOImp instance = new RegistroDAOImp();
            
            nuevo.setCuentaNumeroDocumento("564684654");
            nuevo.setCuentaTipoDocumento("C.C");
            viejo.setCuentaNumeroDocumento("C.E");
            viejo.setCuentaTipoDocumento("A1548248");
            instance.updatePK(nuevo, viejo);
        
    }
    
     @Test
    public void testDelete () {
         System.out.println("DELETE");
         Registro registroDTO = new Registro();
         RegistroDAOImp instance = new RegistroDAOImp();
         Timestamp ts1 = new Timestamp(0);
         registroDTO.setCuentaNumeroDocumento("36165454");
         registroDTO.setCuentaTipoDocumento("C.C");
         registroDTO.setIdRegistro(4687894);
         registroDTO.setFechaEntrada_horaEntrada(ts1);
         registroDTO.setFechaSalida_horaSalida(ts1);
         
         
         instance.delete(registroDTO);
    }
    
    
}
