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
public class PropietarioPk {
    private String equipoCodigoBarras;
    private String usuarioTipoDocumento;
    private String usuarioNumeroDocumento;
    
    public PropietarioPk() {
    }

    public String getEquipoCodigoBarras() {
        return equipoCodigoBarras;
    }

    public void setEquipoCodigoBarras(String equipoCodigoBarras) {
        this.equipoCodigoBarras = equipoCodigoBarras;
    }

    public String getUsuarioTipoDocumento() {
        return usuarioTipoDocumento;
    }

    public void setUsuarioTipoDocumento(String usuarioTipoDocumento) {
        this.usuarioTipoDocumento = usuarioTipoDocumento;
    }

    public String getUsuarioNumeroDocumento() {
        return usuarioNumeroDocumento;
    }

    public void setUsuarioNumeroDocumento(String usuarioNumeroDocumento) {
        this.usuarioNumeroDocumento = usuarioNumeroDocumento;
    }

    @Override
    public String toString() {
        StringBuffer ret = new StringBuffer();
        ret.append("edu.co.sena.ejemplodao.dto.propietarioPk");
        ret.append("equipoCodigoBarras"+equipoCodigoBarras);
        ret.append("usuarioTipoDocumento"+usuarioTipoDocumento);
        ret.append("usuarioNumeroDocumento"+usuarioNumeroDocumento);
        
        return ret.toString();
    }
    
    
    
    
}
