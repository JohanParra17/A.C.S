/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.modulo.factory;

import edu.co.sena.proyecto.modelo.dao.mysql.CuentaDAOImp;
import edu.co.sena.proyecto.modelo.dao.mysql.EquipoDAOImp;
import edu.co.sena.proyecto.modelo.dao.mysql.PropietarioDAOImp;
import edu.co.sena.proyecto.modelo.dao.mysql.RegistroDAOImp;
import edu.co.sena.proyecto.modelo.dao.mysql.RegistroEquipoDAOImp;
import edu.co.sena.proyecto.modelo.dao.mysql.UsuarioDAOImp;
import edu.co.sena.proyecto.modelo.daoo.CuentaDAO;
import edu.co.sena.proyecto.modelo.daoo.EquipoDAO;
import edu.co.sena.proyecto.modelo.daoo.PropietarioDAO;
import edu.co.sena.proyecto.modelo.daoo.RegistroDAO;
import edu.co.sena.proyecto.modelo.daoo.RegistroEquipoDAO;
import edu.co.sena.proyecto.modelo.daoo.UsuarioDAO;

/**
 *
 * @author Sebestian
 */
public class MYSQL_FACTORY extends AbstrctFactory{

    public CuentaDAO creaCuenta() {
       return new CuentaDAOImp();
    }

    public EquipoDAO creaDispositivo() {
       return new  EquipoDAOImp();
    }

    public PropietarioDAO creaPropietario() {
      return new PropietarioDAOImp();
    }

    public RegistroDAO creaRegistro() {
     return  (RegistroDAO) new RegistroDAOImp();
    }

    public RegistroEquipoDAO creaRegistroEquipo() {
        return new RegistroEquipoDAOImp();
                }

    public UsuarioDAO creaUsuario() {
     return new UsuarioDAOImp();
    }
    
}
