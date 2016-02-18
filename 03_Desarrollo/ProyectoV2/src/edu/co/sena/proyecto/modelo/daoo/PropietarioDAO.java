/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.daoo;

import edu.co.sena.proyecto.modelo.dto.Propietario;

import java.util.List;

/**
 *
 * @author Fores
 */
public interface PropietarioDAO {
    public List<Propietario> findAll();

    public void insert(Propietario propietarioDTO);
    
    public void delete(Propietario propietarioDTO);
}
