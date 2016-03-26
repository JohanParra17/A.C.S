/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.acs.clases;

/**
 *
 * @author Sebestian
 */
public class RegistroEquipo {
    private int registroIdRegistro;
    private String propietarioEquipoIdEquipo;
    private String propietarioUsuarioTipoDocumento;
    private int propietarioUsuarionumeroDocumento;
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

    public String getPropietarioEquipoIdEquipo() {
        return propietarioEquipoIdEquipo;
    }

    public void setPropietarioEquipoIdEquipo(String propietarioEquipoIdEquipo) {
        this.propietarioEquipoIdEquipo = propietarioEquipoIdEquipo;
    }

    public String getPropietarioUsuarioTipoDocumento() {
        return propietarioUsuarioTipoDocumento;
    }

    public void setPropietarioUsuarioTipoDocumento(String propietarioUsuarioTipoDocumento) {
        this.propietarioUsuarioTipoDocumento = propietarioUsuarioTipoDocumento;
    }

    public int getPropietarioUsuarionumeroDocumento() {
        return propietarioUsuarionumeroDocumento;
    }

    public void setPropietarioUsuarionumeroDocumento(int propietarioUsuarionumeroDocumento) {
        this.propietarioUsuarionumeroDocumento = propietarioUsuarionumeroDocumento;
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
