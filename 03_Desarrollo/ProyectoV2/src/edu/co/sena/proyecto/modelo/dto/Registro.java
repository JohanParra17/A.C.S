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
     private java.sql.Timestamp fechaEntrada_horaEntrada;
     private java.sql.Timestamp fechaSalida_horaSalida;
    

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
    

   