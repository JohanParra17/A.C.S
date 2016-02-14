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
public class RegistroEquipoPk {

    private int registroIdRegistro;
    private String propietarioEquipoCodigoBarras;
    private String propietarioCuentaTipoDocumento;
    private String propietarioCuentaNumeroDocumento;

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

    @Override
    public String toString() {
        StringBuffer ret = new StringBuffer();
        ret.append("edu.co.sena.ejemplodao.dato.registroEquipoPk");
        ret.append("registroIdRegistro"+ registroIdRegistro);
        ret.append("propietarioEquipoCodigoBarras"+ propietarioEquipoCodigoBarras);
        ret.append("propietarioCuentaTipoDocumento"+ propietarioCuentaTipoDocumento);
        ret.append("propietarioCuentaNumeroDocumento"+ propietarioCuentaNumeroDocumento);
        
        
        return ret.toString();
    }
    
    
}
