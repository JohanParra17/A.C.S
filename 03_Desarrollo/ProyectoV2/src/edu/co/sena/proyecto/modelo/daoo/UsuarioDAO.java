/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.daoo;


import edu.co.sena.proyecto.modelo.dto.Usuario;
import java.util.List;

/**
 *
 * @author Fores
 */
public interface UsuarioDAO {
   public List<Usuario> findAll();

    public void insert(Usuario UsuarioDTO);

    public void update(Usuario UsuarioDTO);

    public void delete(Usuario propietarioDTO);
    
    
}
