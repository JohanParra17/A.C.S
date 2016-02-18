package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.co.sena.modulo.factory.DAOAbstractFactory;
import edu.co.sena.modulo.factory.DAOFactory;
import edu.co.sena.modulo.factory.MysqlDAOFactory;
import edu.co.sena.proyecto.modelo.dao.mysql.EquipoDAOImp;
import edu.co.sena.proyecto.modelo.daoo.EquipoDAO;
import edu.co.sena.proyecto.modelo.dto.Equipo;
import edu.co.sena.proyecto.modelo.dto.EquipoPk;
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
public class EquipoDAOImpTest {

    public EquipoDAOImpTest() {
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
        EquipoDAO instance = fact.creaEquipoDAO();
        List<Equipo> equipo1 = instance.findAll();
        for (Equipo equipo : equipo1) {
            System.out.println(equipo.toString());
            
        }

    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Equipo equipoDTO = new Equipo();
        equipoDTO.setCodigoBarras("7 0077-7777");
        equipoDTO.setMarca("DELL");
        equipoDTO.setDescripcion("CP negro");
        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        EquipoDAO instance = fact.creaEquipoDAO();
        instance.insert(equipoDTO);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Equipo equipoDTO = new Equipo();
        equipoDTO.setCodigoBarras("7 00777-7777");
        equipoDTO.setMarca("DELL");
        equipoDTO.setDescripcion("CP negro");
        
        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        EquipoDAO instance = fact.creaEquipoDAO();
        instance.insert(equipoDTO);
    }

    @Test
    public void testUpdatePk() {

        System.out.println("updatePK");
        EquipoPk nuevo = new EquipoPk();
        EquipoPk viejo = new EquipoPk();
        EquipoDAOImp instance = new EquipoDAOImp();

        nuevo.setCodigoBarras("2341654");
        viejo.setCodigoBarras("1165435");
        instance.updatePK(nuevo, viejo);

    }

    @Test
    public void testDelete() {
        System.out.println("DELETE");
        Equipo equipoDTO = new Equipo();
        EquipoDAOImp instance = new EquipoDAOImp();
        equipoDTO.setCodigoBarras("1564854785");

        instance.delete(equipoDTO);
    }
}
