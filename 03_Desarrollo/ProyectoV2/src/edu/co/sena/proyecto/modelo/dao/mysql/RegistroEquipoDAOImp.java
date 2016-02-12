/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.dto.RegistroEquipo;
import edu.co.sena.proyecto.modelo.dto.ResourceManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sena-901540
 */
public class RegistroEquipoDAOImp {
    private Connection conexion;
    
    private final String SQL_SELECT = "select * from " + getTableName() + "";
    
    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + "REGISTRO_ID_REGISTRO,\n"
            + "PROPIETARIO_EQUIPO_CODIGO_BARRAS,\n"
            + "PROPIETARIO_CUENTA_TIPO_DOCUMENTO\n"
            + "PROPIETARIO_CUENTA_NUMERO_DOCUMENTO\n"
            + "FECHA_ENTRADA\n"
            + "HORA_ENTRADA\n"
            + "FECHA_SALIDA\n"
            + "HORA_SALIDA\n"
            + "VALUES\n"
            + "(?,?,?)";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "REGISTRO_ID_REGISTRO = ?,\n"
            + "WHERE PROPIETARIO_EQUIPO_CODIGO_BARRAS = ? AND PROPIETARIO_CUENTA_TIPO_DOCUMENTO = ? AND PROPIETARIO_CUENTA_NUMERO_DOCUMENTO = ?"
            + "AND FECHA_ENTRADA = ? AND HORA_ENTRADA = ? AND FECHA_SALIDA = ? ? AND HORA_SALIDA = ?";

    public String getTableName() {
        return "acs.registro";
    }

    public List<RegistroEquipo> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<RegistroEquipo> cuentas = new ArrayList<>();

        try {
            // obtener el la conexion 

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            // construct the SQL statement
            final String SQL = SQL_SELECT;

            System.out.println("se ejecuto " + SQL);
            statement = conn.prepareStatement(SQL);
            resultSet = statement.executeQuery();

            if (!resultSet.wasNull()) {
                while (resultSet.next()) {
                    RegistroEquipo registroe = new RegistroEquipo();
                    registroe.setRegistroIdRegistro(resultSet.getInt(1));
                    registroe.setPropietarioEquipoCodigoBarras(resultSet.getString(2));
                    registroe.setPropietarioCuentaTipoDocumento(resultSet.getString(3));
                    registroe.setPropietarioCuentaNumeroDocumento(resultSet.getString(4));
                    registroe.setFechaEntrada(resultSet.getDate(5));
                    registroe.setHoraEntrada(resultSet.getTime(6));
                    registroe.setFechaSalida(resultSet.getDate(7));
                    registroe.setHoraSalida(resultSet.getTime(8));
                    
                    
                    
                }
            }

        } catch (Exception _e) {
            System.out.println("error en el findAll");
        } finally {
            ResourceManager.close(resultSet);
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }
        return cuentas;
    }

    public void insert(RegistroEquipo registroEquipoDTO) {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        int resultSet;

        try {
            // obtener el la conexion 

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            // construct the SQL statement
            final String SQL = SQL_INSERT;
            int indice = 1;
            System.out.println("se ejecuto " + SQL);
            statement = conn.prepareStatement(SQL);
            statement.setInt(indice++, registroEquipoDTO.getRegistroIdRegistro());
            statement.setString(indice++, registroEquipoDTO.getPropietarioEquipoCodigoBarras());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaTipoDocumento());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaNumeroDocumento());
            statement.setDate(indice++, registroEquipoDTO.getFechaEntrada());
            statement.setTime(indice++, registroEquipoDTO.getHoraEntrada());
            statement.setDate(indice++, registroEquipoDTO.getFechaSalida());
            statement.setTime(indice++, registroEquipoDTO.getHoraSalida());
       
          
          

            resultSet = statement.executeUpdate();

        } catch (Exception _e) {
            System.out.println("error en el findAll");
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }

    public void update(RegistroEquipo registroEquipoDTO) {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        int resultSet;

        try {
            // obtener el la conexion 

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            // construct the SQL statement
            final String SQL = SQL_UPDATE;
            int indice = 1;
            System.out.println("se ejecuto " + SQL);
            statement = conn.prepareStatement(SQL);
            statement.setInt(indice++, registroEquipoDTO.getRegistroIdRegistro());
            statement.setString(indice++, registroEquipoDTO.getPropietarioEquipoCodigoBarras());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaTipoDocumento());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaNumeroDocumento());
            statement.setDate(indice++, registroEquipoDTO.getFechaEntrada());
            statement.setTime(indice++, registroEquipoDTO.getHoraEntrada());
            statement.setDate(indice++, registroEquipoDTO.getFechaSalida());
            statement.setTime(indice++, registroEquipoDTO.getHoraSalida());
       
            resultSet = statement.executeUpdate();

        } catch (Exception _e) {
            System.out.println("error en el findAll");
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    } 
}
