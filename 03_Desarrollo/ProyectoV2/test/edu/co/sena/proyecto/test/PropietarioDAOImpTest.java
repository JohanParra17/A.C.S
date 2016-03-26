package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.modulo.factory.DAOAbstractFactory;
import edu.co.sena.modulo.factory.DAOFactory;
import edu.co.sena.modulo.factory.MysqlDAOFactory;

import edu.co.sena.proyecto.modelo.dao.mysql.PropietarioDAOImp;
import edu.co.sena.proyecto.modelo.daoo.PropietarioDAO;
import edu.co.sena.proyecto.modelo.dto.Propietario;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        PropietarioDAO instance = fact.creaPropietarioDAO();
        List<Propietario> propietario1 = instance.findAll();
        for (Propietario propietario : propietario1) {
            System.out.println(propietario.toString());

        }

    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Propietario propietarioDTO = new Propietario();

        propietarioDTO.setEquipoCodigoBarras("7 1407-7777");
        propietarioDTO.setCuentaTipoDocumento("C.C");
        propietarioDTO.setCuentaNumeroDocumento("1020824947");

        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        PropietarioDAO instance = fact.creaPropietarioDAO();
        instance.insert(propietarioDTO);

    }

    @Test
    public void testDelete() {
        System.out.println("DELETE");
        Propietario propietarioDTO = new Propietario();
        PropietarioDAOImp instance = new PropietarioDAOImp();
        propietarioDTO.setEquipoCodigoBarras("123455546478 ");
        propietarioDTO.setCuentaTipoDocumento("C.C");
        propietarioDTO.setCuentaNumeroDocumento("1018492311");

        instance.delete(propietarioDTO);
    }
}
