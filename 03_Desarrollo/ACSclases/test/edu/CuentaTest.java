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
    public void pruebaUsuario() {
        
         System.out.println("------Usuario--------");
    Usuario c1 = new Usuario();
    c1.setCuentaTipoDocumento("C.C");
    c1.setCuentaNumeroDocumento(1020824947);
    c1.setPassword("12345");
    
    
         System.out.println(c1.getCuentaTipoDocumento());
         System.out.println(c1.getCuentaNumeroDocumento());
         System.out.println(c1.getPassword());
    }
    
    @Test
    public void pruebaCuenta() {
        System.out.println("------------Cuenta---------");
        Cuenta u1 = new Cuenta();
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
        System.out.println("-----------Equipo-----------");
        
        Equipo eq = new Equipo();
        eq.setIdEquipo("5459597");
        eq.setMarca("asus");
        eq.setDescripcion("equipo negro");
        
        System.out.println(eq.getIdEquipo());
        System.out.println(eq.getMarca());
        System.out.println(eq.getDescripcion());
        
        
    }
     @Test
    public void pruebaRegistro() {
        
         System.out.println("--------Registro---------");
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
        System.out.println("-------------Registro-Equipo------------");
       RegistroEquipo re = new RegistroEquipo();
         re.setRegistroIdRegistro(001);
         re.setPropietarioEquipoIdEquipo(" ID Equipo: "+ "7 1207 7777");
         re.setFechaEntrada(new Date(01, 11, 2015));
         re.setHoraEntrada(new Time(12, 55, 01));
         re.setFechaSalida(new Date(01, 11, 2015));
         re.setHoraSalida(new Time(02, 45, 25));
         
         System.out.println(re.getRegistroIdRegistro());
         System.out.println(re.getPropietarioEquipoIdEquipo());
         System.out.println(re.getFechaEntrada());
         System.out.println(re.getHoraEntrada());
         System.out.println(re.getFechaSalida());
         System.out.println(re.getHoraSalida());
       
    }
    @Test
    public void pruebaPropietario() {
        System.out.println("------------Propietario----------");
        Propietario pr1 = new Propietario();
        pr1.setEquipoIdEquipo("ID Equipo: "+"5145678");  
        pr1.setCuentaTipoDocumento("Tipo y Numero de documento: "+"C.C");
        pr1.setCuentaNumeroDocumento(1012437950);
      
        
        System.out.println(pr1.getEquipoIdEquipo());
        System.out.println(pr1.getCuentaTipoDocumento());
        System.out.println(pr1.getCuentaNumeroDocumento());
        
        
    }
    

    
   
    
}

