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
public class MysqlDAOFactory extends DAOAbstractFactory{

    @Override
    public CuentaDAO creaCuentaDAO() {
       return new CuentaDAOImp();
    }

    @Override
    public EquipoDAO creaEquipoDAO() {
       return new  EquipoDAOImp();
    }

    @Override
    public PropietarioDAO creaPropietarioDAO() {
      return new PropietarioDAOImp();
    }

    

    @Override
    public RegistroEquipoDAO creaRegistroEquipoDAO() {
        return new RegistroEquipoDAOImp();
                }

    @Override
    public UsuarioDAO creaUsuarioDAO() {
     return new UsuarioDAOImp();
    }

    @Override
    public RegistroDAO creaRegistroDAO() {
     return new RegistroDAOImp();
    }
    
}
