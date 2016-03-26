/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.test;

import edu.co.sena.modulo.factory.DAOAbstractFactory;
import edu.co.sena.modulo.factory.DAOFactory;
import edu.co.sena.modulo.factory.MysqlDAOFactory;

import edu.co.sena.proyecto.modelo.daoo.RegistroEquipoDAO;
import edu.co.sena.proyecto.modelo.dto.RegistroEquipo;

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
        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        RegistroEquipoDAO instance = fact.creaRegistroEquipoDAO();
        List<RegistroEquipo> registroequipo1 = instance.findAll();
        for (RegistroEquipo registroEquipo : registroequipo1) {
            System.out.println(registroEquipo.toString());

        }

    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        RegistroEquipo registroequipoDTO = new RegistroEquipo();

        Timestamp fecha;
        fecha = new Timestamp(2016, 04, 17, 10, 12, 00, 00);

        registroequipoDTO.setPropietarioEquipoCodigoBarras("7 0007-7777");
        registroequipoDTO.setPropietarioCuentaTipoDocumento("C.C");
        registroequipoDTO.setPropietarioCuentaNumeroDocumento("1020824947");
        registroequipoDTO.setFechaEntrada_horaEntrada(fecha);
        registroequipoDTO.setFechaSalida_horaSalida(fecha);

        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        RegistroEquipoDAO instance = fact.creaRegistroEquipoDAO();

        instance.insert(registroequipoDTO);

    }

    

}
