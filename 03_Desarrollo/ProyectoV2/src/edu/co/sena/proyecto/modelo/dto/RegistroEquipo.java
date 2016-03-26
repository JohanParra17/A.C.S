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
public class RegistroEquipo {
    
    private int registroIdRegistro;
    private String propietarioEquipoCodigoBarras;
    private String propietarioCuentaTipoDocumento;
    private String propietarioCuentaNumeroDocumento;
    private java.sql.Timestamp fechaEntrada_horaEntrada;
    private java.sql.Timestamp fechaSalida_horaSalida;
    

    public RegistroEquipo() {
    }

    public int getRegistroIdRegistro() {
        return registroIdRegistro;
    }

    public void setRegistroIdRegistro(int registroIdRegistro) {
        this.registroIdRegistro = registroIdRegistro;
    }

    public String getPropietarioEquipoCodigoBarras() {
        return propietarioEquipoCodigoBarras;
    }

    public void setPropietarioEquipoCodigoBarras(String propietarioEquipoCodigoBarras) {
        this.propietarioEquipoCodigoBarras = propietarioEquipoCodigoBarras;
    }

    public String getPropietarioCuentaTipoDocumento() {
        return propietarioCuentaTipoDocumento;
    }

    public void setPropietarioCuentaTipoDocumento(String propietarioCuentaTipoDocumento) {
        this.propietarioCuentaTipoDocumento = propietarioCuentaTipoDocumento;
    }

    public String getPropietarioCuentaNumeroDocumento() {
        return propietarioCuentaNumeroDocumento;
    }

    public void setPropietarioCuentaNumeroDocumento(String propietarioCuentaNumeroDocumento) {
        this.propietarioCuentaNumeroDocumento = propietarioCuentaNumeroDocumento;
    }

    public java.sql.Timestamp getFechaEntrada_horaEntrada() {
        return fechaEntrada_horaEntrada;
    }

    public void setFechaEntrada_horaEntrada(java.sql.Timestamp fechaEntrada_horaEntrada) {
        this.fechaEntrada_horaEntrada = fechaEntrada_horaEntrada;
    }

    public java.sql.Timestamp getFechaSalida_horaSalida() {
        return fechaSalida_horaSalida;
    }

    public void setFechaSalida_horaSalida(java.sql.Timestamp fechaSalida_horaSalida) {
        this.fechaSalida_horaSalida = fechaSalida_horaSalida;
    }

    
    
}
