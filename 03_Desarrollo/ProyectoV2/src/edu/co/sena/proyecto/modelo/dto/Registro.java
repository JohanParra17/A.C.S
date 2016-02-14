package edu.co.sena.proyecto.modelo.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class Registro {
     private int idRegistro;
     private String cuentaTipoDocumento;
     private String cuentaNumeroDocumento;
     private java.sql.Date fechaEntrada;
     private java.sql.Time horaEntrada;
     private java.sql.Date fechaSalida;
     private java.sql.Time horaSalida;

    public Registro() {
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
