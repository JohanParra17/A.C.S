/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.daoo;

import edu.co.sena.proyecto.modelo.dto.Cuenta;
import java.util.List;

/**
 *
 * @author Sena-901540
 */
public interface CuentaDAO {
    public abstract String getTableName();

    public abstract List<Cuenta> findAll();

    public abstract void insert(Cuenta cuentaDTO);

    public abstract void update(Cuenta cuentaDTO);
}
