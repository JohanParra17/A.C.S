/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.daoo;

import edu.co.sena.proyecto.modelo.dto.Propietario;
import edu.co.sena.proyecto.modelo.dto.PropietarioPk;
import java.util.List;

/**
 *
 * @author Fores
 */
public interface PropietarioDAO {
    public List<Propietario> findAll();

    public void insert(Propietario propietarioDTO);

    public void update(Propietario propietarioDTO);

    public void updatePK(PropietarioPk nuevo, PropietarioPk viejo);
    
    public void delete(Propietario propietarioDTO);
}
