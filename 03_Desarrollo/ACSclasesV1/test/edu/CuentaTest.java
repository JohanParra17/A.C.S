/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;

import edu.co.sena.acs.clases.Cuenta;
import edu.co.sena.acs.clases.Equipo;
import edu.co.sena.acs.clases.Propietario;
import edu.co.sena.acs.clases.Registro;
import edu.co.sena.acs.clases.RegistroEquipo;
import edu.co.sena.acs.clases.Usuario;
import java.sql.Date;
import java.sql.Time;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class CuentaTest {
    
    public CuentaTest() {
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
    public void pruebaCuenta() {
    Cuenta c1 = new Cuenta();
    c1.setTipoDocumento("C.C");
    c1.setNumeroDocumento(1020824947);
    c1.setPassword("12345");
    
    
         System.out.println(c1.getTipoDocumento());
         System.out.println(c1.getNumeroDocumento());
         System.out.println(c1.getPassword());
    }
    
    @Test
    public void pruebaUsuario() {
        Usuario u1 = new Usuario();
        u1.setCargo("Aprendiz");
        u1.setTipoDocumento("C.C");
        u1.setNumeroDocumento(1012437950);
        u1.setPrimerNombre("Juan");
        u1.setSegundoNombre("David");
        u1.setPrimerApellido("Perez");
        u1.setSegundoApellido("Ramirez");
        
        System.out.println(u1.getCargo());
        System.out.println(u1.getTipoDocumento());
        System.out.println(u1.getNumeroDocumento());
        System.out.println(u1.getPrimerNombre());
        System.out.println(u1.getSegundoNombre());
        System.out.println(u1.getPrimerApellido());
        System.out.println(u1.getSegundoApellido());
        
        
    }
    @Test
    public void pruebaEquipo() {
        Equipo eq = new Equipo();
        eq.setMarca("asus");
        eq.setIdEquipo("5459597");
        eq.setDescripcion("equipo negro");
        
        System.out.println(eq.getMarca());
        System.out.println(eq.getIdEquipo());
        System.out.println(eq.getDescripcion());
        
        
    }
     @Test
    public void pruebaRegistro() {
         Registro r1 = new Registro();
         r1.setIdRegistro(01);
         r1.setFechaEntrada(new Date(01, 11, 2015));
         r1.setHoraEntrada(new Time(12, 55, 01));
         r1.setFechaSalida(new Date(01, 11, 2015));
         r1.setHoraSalida(new Time(02, 45, 25));
         
         System.out.println(r1.getIdRegistro());
         System.out.println(r1.getFechaEntrada());
         System.out.println(r1.getHoraEntrada());
         System.out.println(r1.getFechaSalida());
         System.out.println(r1.getHoraSalida());
    }
    
    @Test
    public void pruebaRegistroEquipo() {
        
       RegistroEquipo re = new RegistroEquipo();
         re.setPropietarioEquipoIdEquipo("Juan56+1469");
         re.setFechaEntrada(new Date(01, 11, 2015));
         re.setHoraEntrada(new Time(12, 55, 01));
         re.setFechaSalida(new Date(01, 11, 2015));
         re.setHoraSalida(new Time(02, 45, 25));
         
         System.out.println(re.getPropietarioEquipoIdEquipo());
         System.out.println(re.getFechaEntrada());
         System.out.println(re.getHoraEntrada());
         System.out.println(re.getFechaSalida());
         System.out.println(re.getHoraSalida());
       
    }
    @Test
    public void pruebaPropietario() {
        Propietario pr1 = new Propietario();
        pr1.setEquipoIdEquipo("5145678");
        pr1.setUsuarioNumeroDocumento(1012437950);
        pr1.setUsuarioTipoDocumento("C.C");
        
        
        System.out.println(pr1.getEquipoIdEquipo());
        System.out.println(pr1.getUsuarioNumeroDocumento());
        System.out.println(pr1.getUsuarioTipoDocumento());
        
        
    }
    

    
   
    
}

