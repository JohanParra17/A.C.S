/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dto;

/**
 *
 * @author Fores
 */
public class UsuarioPK {
    private String cuentaTipoDocumento;
    private String cuentaNumeroDocumento;
    private String password;

    public UsuarioPK() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
     StringBuilder ret = new StringBuilder();
     ret.append("edu.co.sena.ejemplo.dto.UsuarioPK");
     ret.append("cuentaTipoDocumento"+cuentaTipoDocumento);
     ret.append("cuentaNumeroDocumento"+cuentaNumeroDocumento);
     ret.append("password"+password);
     return ret.toString();
    }
    
    
}


