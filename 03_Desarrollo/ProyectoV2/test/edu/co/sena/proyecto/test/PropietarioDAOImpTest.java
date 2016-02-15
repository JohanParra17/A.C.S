package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.co.sena.proyecto.modelo.dao.mysql.PropietarioDAOImp;
import edu.co.sena.proyecto.modelo.dto.Propietario;
import edu.co.sena.proyecto.modelo.dto.PropietarioPk;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebestian
 */
public class PropietarioDAOImpTest {
    
    public PropietarioDAOImpTest() {
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
        PropietarioDAOImp instance = new PropietarioDAOImp();
        List<Propietario> propietario1 = instance.findAll();
        for (Propietario propietario : propietario1) {
            System.out.println(propietario1.toString());
            
        }

    }
    @Test
    public void testInsert() {
        System.out.println("insert");
        Propietario propietarioDTO = new Propietario();
        propietarioDTO.setEquipoCodigoBarras("241654515");
        propietarioDTO.setUsuarioTipoDocumento("C.C");
        propietarioDTO.setUsuarioNumeroDocumento("1012437950");

        PropietarioDAOImp instance = new PropietarioDAOImp();
        instance.insert(propietarioDTO);

    }
    @Test
    public void testUpdate() {
        System.out.println("update");
        Propietario propietarioDTO = new Propietario();
        propietarioDTO.setEquipoCodigoBarras("25165145321");
        propietarioDTO.setUsuarioTipoDocumento("C.C");
        propietarioDTO.setUsuarioNumeroDocumento("1020894947");
        PropietarioDAOImp instance = new PropietarioDAOImp();
        instance.insert(propietarioDTO);
    }
    @Test
    public void testUpdatePk() {

        System.out.println("updatePK");
        PropietarioPk nuevo = new PropietarioPk();
        PropietarioPk viejo = new PropietarioPk();
        PropietarioDAOImp instance = new PropietarioDAOImp();

        nuevo.setEquipoCodigoBarras("4571548658");
        viejo.setEquipoCodigoBarras("154875648A");
        instance.updatePK(nuevo, viejo);

    }
     @Test
    public void testDelete() {
        System.out.println("DELETE");
        Propietario propietarioDTO = new Propietario();
        PropietarioDAOImp instance = new PropietarioDAOImp();
        propietarioDTO.setEquipoCodigoBarras("51654654651");

        instance.delete(propietarioDTO);
    }
}
