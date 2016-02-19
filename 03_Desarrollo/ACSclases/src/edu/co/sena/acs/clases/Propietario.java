/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.acs.clases;

import java.util.List;

/**
 *
 * @author Sebestian
 */
public class Propietario {
    private String equipoIdEquipo;
    private String usuarioTipoDocumento;
    private int usuarioNumeroDocumento;
    private Equipo equipo;
    private List<RegistroEquipo> registroequipo;

    public Propietario() {
    }

    public String getEquipoIdEquipo() {
        return equipoIdEquipo;
    }

    public void setEquipoIdEquipo(String equipoIdEquipo) {
        this.equipoIdEquipo = equipoIdEquipo;
    }

    public String getUsuarioTipoDocumento() {
        return usuarioTipoDocumento;
    }

    public void setUsuarioTipoDocumento(String usuarioTipoDocumento) {
        this.usuarioTipoDocumento = usuarioTipoDocumento;
    }

    public int getUsuarioNumeroDocumento() {
        return usuarioNumeroDocumento;
    }

    public void setUsuarioNumeroDocumento(int usuarioNumeroDocumento) {
        this.usuarioNumeroDocumento = usuarioNumeroDocumento;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<RegistroEquipo> getRegistroequipo() {
        return registroequipo;
    }

    public void setRegistroequipo(List<RegistroEquipo> registroequipo) {
        this.registroequipo = registroequipo;
    }
    
    
}
