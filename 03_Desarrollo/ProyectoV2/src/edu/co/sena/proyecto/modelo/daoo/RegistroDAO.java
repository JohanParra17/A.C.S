/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.daoo;

import edu.co.sena.proyecto.modelo.dto.Registro;
import edu.co.sena.proyecto.modelo.dto.RegistroPk;
import java.util.List;

/**
 *
 * @author Sena-901540
 */
public interface RegistroDAO {
    public List<Registro> findAll();

    public void insert(Registro registroDTO);

    public void update(Registro registroDTO);

    public void updatePK(RegistroPk nuevo, RegistroPk viejo);
    
    public void delete(Registro registroDTO);
}
