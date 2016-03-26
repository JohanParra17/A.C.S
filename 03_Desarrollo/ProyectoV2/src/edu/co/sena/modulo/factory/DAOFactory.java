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
public interface DAOFactory {
    public CuentaDAO creaCuentaDAO();
    public EquipoDAO creaEquipoDAO();    
    public PropietarioDAO creaPropietarioDAO();
    public RegistroDAO creaRegistroDAO();
    public RegistroEquipoDAO creaRegistroEquipoDAO();
    public UsuarioDAO creaUsuarioDAO();
}
