/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.RegistroDAO;
import edu.co.sena.proyecto.modelo.dto.Registro;
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
public class RegistroDAOImp implements RegistroDAO {

    private Connection conexion;

    private final String SQL_SELECT = "select * from " + getTableName() + "";

    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + " (ID_REGISTRO, \n"
            + " CUENTA_TIPO_DOCUMENTO, \n"
            + " CUENTA_NUMERO_DOCUMENTO, \n"
            + " FECHA_ENTRADA_HORA_ENTRADA, \n"
            + " FECHA_SALIDA_HORA_SALIDA) \n"
            + " VALUES \n"
            + " (?,?,?,?,?);";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + " SET \n"
            + " CUENTA_TIPO_DOCUMENTO = ?, \n"
            + " CUENTA_NUMERO_DOCUMENTO = ?,\n"
            + " FECHA_ENTRADA_HORA_ENTRADA = ?, \n"
            + " FECHA_SALIDA_HORA_SALIDA = ? \n"
            + " WHERE ID_REGISTRO = ? ;";

    public String getTableName() {
        return "acs.registro";
    }

    @Override
    public List<Registro> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Registro> registros = new ArrayList<>();

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
                    Registro registro1 = new Registro();
                    registro1.setIdRegistro(resultSet.getInt(1));
                    registro1.setCuentaTipoDocumento(resultSet.getString(2));
                    registro1.setCuentaNumeroDocumento(resultSet.getString(3));
                    registro1.setFechaEntrada_horaEntrada(resultSet.getTimestamp(4));
                    registro1.setFechaSalida_horaSalida(resultSet.getTimestamp(5));

                    registros.add(registro1);

                }
            }

        } catch (Exception e) {
            System.err.println("error en el findAll" + e.getMessage());
        } finally {
            ResourceManager.close(resultSet);
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }
        return registros;
    }

    @Override
    public void insert(Registro registroDTO) {
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

            statement.setInt(indice++, registroDTO.getIdRegistro());
            statement.setString(indice++, registroDTO.getCuentaTipoDocumento());
            statement.setString(indice++, registroDTO.getCuentaNumeroDocumento());
            statement.setTimestamp(indice++, registroDTO.getFechaEntrada_horaEntrada());
            statement.setTimestamp(indice++, registroDTO.getFechaSalida_horaSalida());

            resultSet = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("error en el findAll" + e.getLocalizedMessage());
        } finally {

            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }

    public void update(Registro registroDTO) {
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

            statement.setString(indice++, registroDTO.getCuentaTipoDocumento());
            statement.setString(indice++, registroDTO.getCuentaNumeroDocumento());
            statement.setTimestamp(indice++, registroDTO.getFechaEntrada_horaEntrada());
            statement.setTimestamp(indice++, registroDTO.getFechaSalida_horaSalida());
            statement.setInt(indice++, registroDTO.getIdRegistro());

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
