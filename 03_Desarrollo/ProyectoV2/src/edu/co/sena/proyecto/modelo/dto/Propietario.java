/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dto;

/**
 *
 * @author Usuario
 */
public class Propietario {
    private String equipoCodigoBarras;
    private String cuentaTipoDocumento;
    private String cuentaNumeroDocumento;

    public Propietario() {
    }

    public String getEquipoCodigoBarras() {
        return equipoCodigoBarras;
    }

    public void setEquipoCodigoBarras(String equipoCodigoBarras) {
        this.equipoCodigoBarras = equipoCodigoBarras;
    }

    public String getCuentaTipoDocumento() {
        return cuentaTipoDocumento;
    }

    public void setCuentaTipoDocumento(String cuentaTipoDocumento) {
        this.cuentaTipoDocumento = cuentaTipoDocumento;
    }

    public String getCuentaNumeroDocumento() {
        return cuentaNumeroDocumento;
    }

    public void setCuentaNumeroDocumento(String cuentaNumeroDocumento) {
        this.cuentaNumeroDocumento = cuentaNumeroDocumento;
    }

    
}
