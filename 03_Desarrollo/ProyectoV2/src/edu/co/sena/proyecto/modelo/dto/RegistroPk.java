/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dto;

/**
 *
 * @author Sebestian
 */
public class RegistroPk {

    private int idRegistro;
    private String cuentaTipoDocumento;
    private String cuentaNumeroDocumento;

    public RegistroPk() {
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
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

    @Override
    public String toString() {
        StringBuffer ret = new StringBuffer();
        ret.append("edu.co.sena.ejemplodao.dto.registroPk");
        ret.append("idRegistro" + idRegistro);
        ret.append("cuentaTipoDocumento" + cuentaTipoDocumento);
        ret.append("cuentaNumeroDocumento" + cuentaNumeroDocumento);
        return ret.toString();
    }

}
