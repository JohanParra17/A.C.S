/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.test;

import edu.co.sena.proyecto.modelo.dao.mysql.RegistroEquipoDAOImp;
import edu.co.sena.proyecto.modelo.dto.RegistroEquipo;
import edu.co.sena.proyecto.modelo.dto.RegistroEquipoPk;
import java.sql.Timestamp;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Sena-901540
 */
public class RegistroEquipoDAOImpTest {
    
    public RegistroEquipoDAOImpTest() {
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
        RegistroEquipoDAOImp instance = new RegistroEquipoDAOImp();
        List<RegistroEquipo> registroequipo1 = instance.findAll();
         for (RegistroEquipo registroEquipo : registroequipo1) {
             System.out.println(registroEquipo.toString());
             
         }
        
        
    }
    
     @Test
    public void testInsert() {
         System.out.println("insert");
         RegistroEquipo registroequipoDTO = new RegistroEquipo();
         Timestamp ts1 = new Timestamp(0);
         registroequipoDTO.setPropietarioCuentaNumeroDocumento("6848946");
         registroequipoDTO.setPropietarioCuentaTipoDocumento("C.C");
         registroequipoDTO.setPropietarioEquipoCodigoBarras("aa1245cc");
         registroequipoDTO.setRegistroIdRegistro(56456);
         registroequipoDTO.setFechaEntrada_horaEntrada(ts1);
         registroequipoDTO.setFechaSalida_horaSalida(ts1);
        
         
         
    }
    
    @Test
    public void testUpdate () {
         System.out.println("update");
         RegistroEquipo registroequipoDTO = new RegistroEquipo();
         Timestamp ts1 = new Timestamp(0);
         registroequipoDTO.setPropietarioCuentaNumeroDocumento("534654");
         registroequipoDTO.setPropietarioCuentaTipoDocumento("C.C");
         registroequipoDTO.setPropietarioEquipoCodigoBarras("aa2233xxds54");
         registroequipoDTO.setRegistroIdRegistro(6545465);
         registroequipoDTO.setFechaEntrada_horaEntrada(ts1);
         registroequipoDTO.setFechaSalida_horaSalida(ts1);
         
         
         RegistroEquipoDAOImp instance = new RegistroEquipoDAOImp();
         instance.update(registroequipoDTO);
    }
    
        @Test
    public void testUpdatePk () {
        
            System.out.println("updatePK");
            RegistroEquipoPk nuevo = new RegistroEquipoPk();
            RegistroEquipoPk viejo = new RegistroEquipoPk();
            RegistroEquipoDAOImp instance = new RegistroEquipoDAOImp();
            
            nuevo.setPropietarioCuentaNumeroDocumento("654845");
            nuevo.setPropietarioCuentaTipoDocumento("C.C");
            viejo.setPropietarioCuentaNumeroDocumento("897465");
            viejo.setPropietarioCuentaTipoDocumento("C.C");
            instance.updatePK(nuevo, viejo);
        
    }
    
     @Test
    public void testDelete () {
         System.out.println("DELETE");
         RegistroEquipo registroequipoDTO = new RegistroEquipo();
         RegistroEquipoDAOImp instance = new RegistroEquipoDAOImp();
         Timestamp ts1 = new Timestamp(0);
         registroequipoDTO.setPropietarioCuentaNumeroDocumento("1564664864");
         registroequipoDTO.setPropietarioCuentaTipoDocumento("C.C");
         registroequipoDTO.setPropietarioEquipoCodigoBarras("44a5654s65f4daf");
         registroequipoDTO.setRegistroIdRegistro(154855);
         registroequipoDTO.setFechaEntrada_horaEntrada(ts1);
         registroequipoDTO.setFechaSalida_horaSalida(ts1);
         
         
         instance.delete(registroequipoDTO);
    }
    
    
}
