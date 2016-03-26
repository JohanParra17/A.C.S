/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.RegistroEquipoDAO;
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
public class RegistroEquipoDAOImp implements RegistroEquipoDAO {

    private Connection conexion;

    private final String SQL_SELECT = "select * from " + getTableName() + "";

    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + " (PROPIETARIO_EQUIPO_CODIGO_BARRAS,\n"
            + " PROPIETARIO_CUENTA_NUMERO_DOCUMENTO, \n"
            + " PROPIETARIO_CUENTA_TIPO_DOCUMENTO, \n"
            + " FECHA_ENTRADA_HORA_ENTRADA, \n"
            + " FECHA_SALIDA_HORA_SALIDA) \n"
            + " VALUES \n"
            + " (?,?,?,?,?);";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + " SET \n"
            + " PROPIETARIO_EQUIPO_CODIGO_BARRAS = ?, \n "
            + " PROPIETARIO_CUENTA_TIPO_DOCUMENTO = ?, \n "
            + " PROPIETARIO_CUENTA_NUMERO_DOCUMENTO = ?, \n"
            + " FECHA_ENTRADA_HORA_ENTRADA = ?, \n"
            + " FECHA_SALIDA_HORA_SALIDA = ?, \n"
            + " WHERE REGISTRO_ID_REGISTRO = ? ;";

    public String getTableName() {
        return "acs.registro_equipo";
    }

    @Override
    public List<RegistroEquipo> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<RegistroEquipo> registroequipos = new ArrayList<>();

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

                    registroe.setPropietarioEquipoCodigoBarras(resultSet.getString(1));
                    registroe.setPropietarioCuentaTipoDocumento(resultSet.getString(2));
                    registroe.setPropietarioCuentaNumeroDocumento(resultSet.getString(3));
                    registroe.setFechaEntrada_horaEntrada(resultSet.getTimestamp(4));
                    registroe.setFechaSalida_horaSalida(resultSet.getTimestamp(5));

                    registroequipos.add(registroe);
                }
            }

        } catch (Exception e) {
            System.out.println("error en el findAll" + e.getMessage());
        } finally {
            ResourceManager.close(resultSet);
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }
        return registroequipos;
    }

    @Override
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

            statement.setString(indice++, registroEquipoDTO.getPropietarioEquipoCodigoBarras());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaNumeroDocumento());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaTipoDocumento());
            statement.setTimestamp(indice++, registroEquipoDTO.getFechaEntrada_horaEntrada());
            statement.setTimestamp(indice++, registroEquipoDTO.getFechaSalida_horaSalida());

            resultSet = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("error en el findAll" + e.getMessage());
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }

   

}
