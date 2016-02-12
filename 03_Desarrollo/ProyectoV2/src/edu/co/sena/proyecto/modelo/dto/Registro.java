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
     private int registro;
     private String centaTipoDocumento;
     private String centaNumeroDocumento;
     private java.sql.Date fechaEntrada;
     private java.sql.Time horaEntrada;
     private java.sql.Date fechaSalida;
     private java.sql.Time horaSalida;

    public Registro() {
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getCentaTipoDocumento() {
        return centaTipoDocumento;
    }

    public void setCentaTipoDocumento(String centaTipoDocumento) {
        this.centaTipoDocumento = centaTipoDocumento;
    }

    public String getCentaNumeroDocumento() {
        return centaNumeroDocumento;
    }

    public void setCentaNumeroDocumento(String centaNumeroDocumento) {
        this.centaNumeroDocumento = centaNumeroDocumento;
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
