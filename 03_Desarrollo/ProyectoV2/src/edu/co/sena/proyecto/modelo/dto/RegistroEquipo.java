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
    private java.sql.Date fechaEntrada;
    private java.sql.Time horaEntrada;
    private java.sql.Date fechaSalida;
    private java.sql.Time horaSalida;

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

    public java.sql.Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(java.sql.Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public java.sql.Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(java.sql.Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public java.sql.Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(java.sql.Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public java.sql.Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(java.sql.Time horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
}
