package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.modulo.factory.DAOAbstractFactory;
import edu.co.sena.modulo.factory.DAOFactory;
import edu.co.sena.modulo.factory.MysqlDAOFactory;
import edu.co.sena.proyecto.modelo.dao.mysql.UsuarioDAOImp;
import edu.co.sena.proyecto.modelo.daoo.UsuarioDAO;
import edu.co.sena.proyecto.modelo.dto.Usuario;

import java.sql.SQLException;
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
public class UsuarioDAOImpTest {

    public UsuarioDAOImpTest() {
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
        UsuarioDAO instance = fact.creaUsuarioDAO();
        instance.findAll();
        List<Usuario> usuario = instance.findAll();
        for (Usuario usuario1 : usuario) {
            System.out.println(usuario1.toString());
        }

    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Usuario usuarioDTO = new Usuario();

        usuarioDTO.setCuentaTipoDocumento("C.C");
        usuarioDTO.setCuentaNumeroDocumento("1020824947");
        usuarioDTO.setPassword("738fea4cba5abd5a0c2d5113f6692585b64cd8ab210ab7e5b1fd7790");

        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        UsuarioDAO instance = fact.creaUsuarioDAO();
        instance.insert(usuarioDTO);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");

        Usuario usuarioDTO = new Usuario();

        usuarioDTO.setCuentaTipoDocumento("C.C");
        usuarioDTO.setCuentaNumeroDocumento("1020824947");
        usuarioDTO.setPassword("12852a");

        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        UsuarioDAO instance = fact.creaUsuarioDAO();
        instance.update(usuarioDTO);

    }

    @Test
    public void testDelete() {
        System.out.println("DELETE");

        Usuario usuarioDTO = new Usuario();
        UsuarioDAOImp instance = new UsuarioDAOImp();
        usuarioDTO.setPassword("856fd92e865d0245afab90e1d2cbcd2fba24ac9f42aed32b089bce60");

        instance.delete(usuarioDTO);
    }

}
