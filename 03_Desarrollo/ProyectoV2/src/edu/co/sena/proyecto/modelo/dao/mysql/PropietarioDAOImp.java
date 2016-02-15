/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.PropietarioDAO;
import edu.co.sena.proyecto.modelo.dto.Cuenta;
import edu.co.sena.proyecto.modelo.dto.Propietario;
import edu.co.sena.proyecto.modelo.dto.PropietarioPk;
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
public class PropietarioDAOImp implements PropietarioDAO{
    private Connection conexion;
    
    private final String SQL_SELECT = "select * from " + getTableName() + "";
    
    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + "EQUIPO_CODIGO_BARRAS,\n"
            + "CUENTA_TIPO_DOCUMENTO,\n"
            + "CUENTA_NUMERO_DOCUMENTO\n"
            + "VALUES\n"
            + "(?,?,?)";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "EQUIPO_CODIGO_BARRAS = ?,\n"
            + "WHERE CUENTA_TIPO_DOCUMENTO = ? "
            + "AND CUENTA_NUMERO_DOCUMENTO = ?";

    private final String SQL_UPDATEPK = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "EQUIPO_CODIGO_BARRAS = ?,\n"
            + "CUENTA_TIPO_DOCUMENTO = ? "
            + "CUENTA_NUMERO_DOCUMENTO = ?"
            + "WHERE EQUIPO_BARRAS = ?"
            + "AND CUENTA_TIPO_DOCUMENTO = ?"
            + "AND CUENTA_NUMERO_DOCUMENTO = ?";

    public String getTableName() {
        return "acs.propietario";
    }

    public List<Propietario> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Propietario> propietario = new ArrayList<>();

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
                    Propietario propietario1 = new Propietario();
                    propietario1.setEquipoCodigoBarras(resultSet.getString(1));
                    propietario1.setUsuarioNumeroDocumento(resultSet.getString(2));
                    propietario1.setUsuarioTipoDocumento(resultSet.getString(3));
                    
                   
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
        return propietario;
    }

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
            statement.setString(indice++, propietarioDTO.getUsuarioTipoDocumento());
            statement.setString(indice++, propietarioDTO.getUsuarioNumeroDocumento());
         
          

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

    public void update(Propietario propietarioDTO) {
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
            statement.setString(indice++, propietarioDTO.getEquipoCodigoBarras());
            statement.setString(indice++, propietarioDTO.getUsuarioTipoDocumento());
            statement.setString(indice++, propietarioDTO.getUsuarioNumeroDocumento());
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

    @Override
    public void updatePK(PropietarioPk nuevo, PropietarioPk viejo) {
        Object conecion = null;

        // declaracion de variables
        final boolean estaConectado = (conecion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        int resultSet;

        try {

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            final String SQL = SQL_UPDATEPK;
            int indice = 1;
            System.out.println("se ejecuto " + SQL);
            statement = conn.prepareStatement(SQL);

            statement.setString(indice++, viejo.getEquipoCodigoBarras());
            statement.setString(indice++, viejo.getUsuarioTipoDocumento());
            statement.setString(indice++, viejo.getUsuarioTipoDocumento());

            statement.setString(indice++, nuevo.getEquipoCodigoBarras());
            statement.setString(indice++, nuevo.getUsuarioTipoDocumento());
            statement.setString(indice++, nuevo.getUsuarioTipoDocumento());

            resultSet = statement.executeUpdate();

        } catch (Exception _e) {
            System.out.println("error en el UpdatePK");
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }

        }
    }
    }

           
