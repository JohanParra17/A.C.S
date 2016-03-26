/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dto;

/**
 *
 * @author edwin
 */
public class EquipoPk {
    private String codigoBarras;
    private String marca;
    private String descripcion;

    public EquipoPk() {
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
       StringBuffer ret = new StringBuffer();
        ret.append("edu.co.sena.ejemplodao.dto.EquipoPk");
        ret.append("codigoBarras"+codigoBarras);
        ret.append("marca"+marca);
        ret.append("descripcion"+descripcion);
        
        return  ret.toString();
    }
    
    
}
