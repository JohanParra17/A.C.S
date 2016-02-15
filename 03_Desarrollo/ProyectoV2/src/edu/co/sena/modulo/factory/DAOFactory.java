/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.modulo.factory;

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
interface DAOFactory {
    public CuentaDAO creaCuenta();
    public EquipoDAO creaDispositivo();    
    public PropietarioDAO creaPropietario();
    public RegistroDAO creaRegistro();
    public RegistroEquipoDAO creaRegistroEquipo();
    public UsuarioDAO creaUsuario();
}
