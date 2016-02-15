package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.co.sena.proyecto.modelo.dao.mysql.CuentaDAOImp;
import edu.co.sena.proyecto.modelo.dto.Cuenta;
import edu.co.sena.proyecto.modelo.dto.CuentaPk;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edwin
 */
public class CuentaDAOImpTest {
    
    public CuentaDAOImpTest() {
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
        CuentaDAOImp instance = new CuentaDAOImp();
        List<Cuenta> cuenta1 = instance.findAll();
        for (Cuenta cuenta : cuenta1) {
            System.out.println(cuenta1.toString());
            
        }
    }
    
     @Test
    public void testInsert() {
         System.out.println("insert");
         Cuenta cuentaDTO = new Cuenta();
         cuentaDTO.setTipoDocumento("C.C.");
         cuentaDTO.setNumeroDocumento("1020824947");
         cuentaDTO.setPrimerNombre("Johan");
         cuentaDTO.setSegundoNombre("Sebastian");
         cuentaDTO.setPrimerApellido("Parra");
         cuentaDTO.setSegundoApellido("Rojas");
         cuentaDTO.setCargo("Aprendiz");
         cuentaDTO.setFoto(null);
         CuentaDAOImp instance = new CuentaDAOImp();
         instance.insert(cuentaDTO);
         
    }
    
    @Test
    public void testUpdate () {
         System.out.println("update");
         Cuenta cuentaDTO = new Cuenta();
         cuentaDTO.setTipoDocumento("C.C.");
         cuentaDTO.setNumeroDocumento("1012824947");
         cuentaDTO.setPrimerNombre("n");
         cuentaDTO.setSegundoNombre("Sebastian");
         cuentaDTO.setPrimerApellido("Parra");
         cuentaDTO.setSegundoApellido("Rojas");
         cuentaDTO.setCargo("Aprendiz");
         cuentaDTO.setFoto(null);
         CuentaDAOImp instance = new CuentaDAOImp();
         instance.update(cuentaDTO);
    }
    
        @Test
    public void testUpdatePk () {
        
            System.out.println("updatePK");
            CuentaPk nuevo = new CuentaPk();
            CuentaPk viejo = new CuentaPk();
            CuentaDAOImp instance = new CuentaDAOImp();
            
            nuevo.setTipoDocumento("C.C");
            nuevo.setNumeroDocumento("1020854947");
            viejo.setTipoDocumento("C.E");
            viejo.setNumeroDocumento("A1548248");
            instance.updatePK(nuevo, viejo);
        
    }
    
     @Test
    public void testDelete () {
         System.out.println("DELETE");
         Cuenta cuentaDTO = new Cuenta();
         CuentaDAOImp instance = new CuentaDAOImp();
         cuentaDTO.setTipoDocumento("C.C");
         cuentaDTO.setNumeroDocumento("1020824947");
         cuentaDTO.setPrimerNombre("Johan");
         cuentaDTO.setSegundoNombre("Sebastian");
         cuentaDTO.setPrimerApellido("Parra");
         cuentaDTO.setSegundoApellido("Rojas");
         cuentaDTO.setCargo("Aprendiz");
         cuentaDTO.setFoto(null);
         
         instance.delete(cuentaDTO);
    }
    
    
}
