/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.daoo;

import edu.co.sena.proyecto.modelo.dto.Cuenta;
import edu.co.sena.proyecto.modelo.dto.CuentaPk;
import java.util.List;

/**
 *
 * @author Sena-901540
 */
public interface CuentaDAO {

    public  List<Cuenta> findAll();

    public  void insert(Cuenta cuentaDTO);

    public  void update(Cuenta cuenataDTO);

    public void updatePK(CuentaPk viejo, CuentaPk nuevo);

    public void delete(Cuenta cuentaDTO);
    
   
}
