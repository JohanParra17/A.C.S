/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.test;

import edu.co.sena.modulo.factory.DAOAbstractFactory;
import edu.co.sena.modulo.factory.DAOFactory;
import edu.co.sena.modulo.factory.MysqlDAOFactory;

import edu.co.sena.proyecto.modelo.daoo.RegistroDAO;
import edu.co.sena.proyecto.modelo.dto.Registro;


import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class RegistroDAOImpTest {

    public RegistroDAOImpTest() {
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
        RegistroDAO instance = fact.creaRegistroDAO();
        List<Registro> registro1 = instance.findAll();
        for (Registro registro : registro1) {
            System.out.println(registro.toString());
        }

    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Registro registroDTO = new Registro();
        Calendar c1 = GregorianCalendar.getInstance();
        c1.set(2016, 12, 16, 10, 20, 00);
        Timestamp fecha = new Timestamp(c1.getTimeInMillis());

        Calendar c2 = GregorianCalendar.getInstance();
        c2.set(2016, 12, 16, 11, 20, 00);
        Timestamp fecha1 = new Timestamp(c2.getTimeInMillis());

        
        registroDTO.setCuentaTipoDocumento("C.C");
        registroDTO.setCuentaNumeroDocumento("1020824947");
        registroDTO.setFechaEntrada_horaEntrada(fecha);
        registroDTO.setFechaSalida_horaSalida(fecha1);

        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        RegistroDAO instance = fact.creaRegistroDAO();
        instance.insert(registroDTO);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Registro registroDTO = new Registro();

        Timestamp ts1 = new Timestamp(0);
        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        RegistroDAO instance = fact.creaRegistroDAO();
        registroDTO.setCuentaTipoDocumento("C.C");
        registroDTO.setCuentaNumeroDocumento("1020824947");
        registroDTO.setFechaEntrada_horaEntrada(ts1);
        registroDTO.setFechaSalida_horaSalida(ts1);

        instance.update(registroDTO);
    }

    
}
