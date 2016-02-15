package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.co.sena.proyecto.modelo.dao.mysql.UsuarioDAOImp;
import edu.co.sena.proyecto.modelo.dto.Usuario;
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
        UsuarioDAOImp instance = new UsuarioDAOImp();
        List<Usuario> usuario1 = instance.findAll();
        for (Usuario usuario11 : usuario1) {
            System.out.println(usuario1.toString());
        }
            
        }
    @Test
    public void testInsert() {
        System.out.println("insert");
        Usuario usuarioDTO = new Usuario();
        usuarioDTO.setCuentaTipoDocumento("C.C");
        usuarioDTO.setCuentaNumeroDocumento("54639852");
        usuarioDTO.setPassword("123456789a");

        UsuarioDAOImp instance = new UsuarioDAOImp();
        instance.insert(usuarioDTO);

    }
     @Test
    public void testUpdate() {
        System.out.println("update");
        Usuario usuarioDTO = new Usuario();
        usuarioDTO.setCuentaTipoDocumento("C.C");
        usuarioDTO.setCuentaTipoDocumento("15456321848");
        usuarioDTO.setPassword("987654321b");
        UsuarioDAOImp instance = new UsuarioDAOImp();
        instance.insert(usuarioDTO);
        
    }
    @Test
    public void testDelete() {
        System.out.println("DELETE");
        Usuario usuarioDTO = new Usuario();
        UsuarioDAOImp instance = new UsuarioDAOImp();
        usuarioDTO.getPassword();

        instance.delete(usuarioDTO);
    }
    }

    
