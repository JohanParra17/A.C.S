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
    private String cuentaTipoDocumento;
    private int cuentaNumeroDocumento;
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

    public String getCuentaTipoDocumento() {
        return cuentaTipoDocumento;
    }

    public void setCuentaTipoDocumento(String cuentaTipoDocumento) {
        this.cuentaTipoDocumento = cuentaTipoDocumento;
    }

    public int getCuentaNumeroDocumento() {
        return cuentaNumeroDocumento;
    }

    public void setCuentaNumeroDocumento(int cuentaNumeroDocumento) {
        this.cuentaNumeroDocumento = cuentaNumeroDocumento;
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
