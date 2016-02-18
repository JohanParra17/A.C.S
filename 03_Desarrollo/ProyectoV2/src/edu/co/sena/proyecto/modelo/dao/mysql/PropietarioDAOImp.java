/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.PropietarioDAO;
import edu.co.sena.proyecto.modelo.dto.Propietario;
import edu.co.sena.proyecto.modelo.dto.ResourceManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fores
 */
public class PropietarioDAOImp implements PropietarioDAO {

    private Connection conexion;

    private final String SQL_SELECT = "select * from " + getTableName() + "";

    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + "(EQUIPO_CODIGO_BARRAS, \n"
            + "CUENTA_TIPO_DOCUMENTO, \n"
            + "CUENTA_NUMERO_DOCUMENTO) \n"
            + "VALUES \n"
            + "(?,?,?);";

    public final String SQL_DELETE = "DELETE FROM " + getTableName()
            + " WHERE EQUIPO_CODIGO_BARRAS = ? \n"
            + " CUENTA_TIPO_DOCUMENTO = ?"
            + " CUENTA_NUMERO_DOCUMENTO = ?;";

    public String getTableName() {
        return "acs.propietario";
    }

    @Override
    public List<Propietario> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Propietario> propietarios = new ArrayList<>();

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
                    Propietario propietario = new Propietario();

                    propietario.setEquipoCodigoBarras(resultSet.getString(1));
                    propietario.setCuentaTipoDocumento(resultSet.getString(2));
                    propietario.setCuentaNumeroDocumento(resultSet.getString(3));
                    ;

                    propietarios.add(propietario);
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
        return propietarios;
    }

    @Override
    public void insert(Propietario propietarioDTO) {
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

            statement.setString(indice++, propietarioDTO.getEquipoCodigoBarras());
            statement.setString(indice++, propietarioDTO.getCuentaTipoDocumento());
            statement.setString(indice++, propietarioDTO.getCuentaNumeroDocumento());

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

    @Override
    public void delete(Propietario propietarioDTO) {
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
            final String SQL = SQL_DELETE;
            int indice = 1;
            System.out.println("se ejecuto " + SQL);
            statement = conn.prepareStatement(SQL);
            statement.setString(indice++, propietarioDTO.getEquipoCodigoBarras());
            statement.setString(indice++, propietarioDTO.getCuentaNumeroDocumento());
            statement.setString(indice++, propietarioDTO.getCuentaTipoDocumento());

            resultSet = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("error en el Delete " + e.getMessage());
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }
    }

}
