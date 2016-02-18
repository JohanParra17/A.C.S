package edu.co.sena.proyecto.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.co.sena.modulo.factory.DAOAbstractFactory;
import edu.co.sena.modulo.factory.MysqlDAOFactory;
import edu.co.sena.modulo.factory.DAOFactory;
import edu.co.sena.proyecto.modelo.dao.mysql.CuentaDAOImp;
import edu.co.sena.proyecto.modelo.daoo.CuentaDAO;
import edu.co.sena.proyecto.modelo.dto.Cuenta;
import edu.co.sena.proyecto.modelo.dto.CuentaPk;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edwin
 */
public class CuentaDAOImpTest {

    public CuentaDAOImpTest() {
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
        CuentaDAO instance = fact.creaCuentaDAO();
        List<Cuenta> cuenta1 = instance.findAll();
        for (Cuenta cuenta : cuenta1) {
            System.out.println(cuenta.toString());

        }
    }

    @Test
    public void testInsert() {
        System.out.println("insert cuenta");
        Cuenta cuentaDTO = new Cuenta();
        cuentaDTO.setTipoDocumento("C.C.");
        cuentaDTO.setNumeroDocumento("102066548247");
        cuentaDTO.setPrimerNombre("Johan");
        cuentaDTO.setSegundoNombre("Sebastian");
        cuentaDTO.setPrimerApellido("Parra");
        cuentaDTO.setSegundoApellido("Rojas");
        cuentaDTO.setCargo("Aprendiz");
        cuentaDTO.setEstado(true);
        cuentaDTO.setFoto(null);
        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        CuentaDAO instance = fact.creaCuentaDAO();
        instance.insert(cuentaDTO);

    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Cuenta cuenta = new Cuenta();
        cuenta.setTipoDocumento("C.C.");
        cuenta.setNumeroDocumento("1020824947");
        cuenta.setPrimerNombre("Johan");
        cuenta.setSegundoNombre("Sebastian");
        cuenta.setPrimerApellido("Parra");
        cuenta.setSegundoApellido("Rojas");
        cuenta.setEstado(true);
        cuenta.setCargo("Aprendiz");

        cuenta.setFoto(null);

        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        CuentaDAO instance = fact.creaCuentaDAO();
        instance.update(cuenta);
    }

    @Test
    public void testUpdatePk() {

        System.out.println("updatePK");
        CuentaPk nuevo = new CuentaPk();
        CuentaPk viejo = new CuentaPk();
        DAOFactory fact = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        CuentaDAO instance = fact.creaCuentaDAO();

        nuevo.setTipoDocumento("C.C");
        nuevo.setNumeroDocumento("1020854947");
        viejo.setTipoDocumento("C.E");
        viejo.setNumeroDocumento("12345895637");
        instance.updatePK(nuevo, viejo);

    }

    @Test
    public void testDelete() {
        System.out.println("DELETE");
        Cuenta cuentaDTO = new Cuenta();
        DAOFactory centa = MysqlDAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        CuentaDAO instance = centa.creaCuentaDAO();
        cuentaDTO.setTipoDocumento("C.C");
        cuentaDTO.setNumeroDocumento("1020824947");

        instance.delete(cuentaDTO);
    }

}
