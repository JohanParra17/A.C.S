/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.EquipoDAO;
import edu.co.sena.proyecto.modelo.dto.Equipo;
import edu.co.sena.proyecto.modelo.dto.EquipoPk;
import edu.co.sena.proyecto.modelo.dto.ResourceManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SebasH
 */
public class EquipoDAOImp implements EquipoDAO {

    private Connection conexion;

    private final String SQL_SELECT = "select * from " + getTableName() + "";

    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + "(CODIGO_BARRAS,\n"
            + "MARCA,\n"
            + "DESCRIPCION) \n"
            + "VALUES\n"
            + "(?,?,?)";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "MARCA = ?,\n"
            + "DESCRIPCION = ? "
            + "WHERE CODIGO_BARRAS = ?;";

    private final String SQL_UPDATEPK = "UPDATE " + getTableName() + "\n"
            + "SET \n"
            + "CODIGO_BARRAS = ? \n"
            + "WHERE CODIGO_BARRAS = ?;";

    private final String SQL_DELETE = "DELETE FROM " + getTableName() + "\n"
            + " WHERE CODIGO_BARRAS = ? ;\n";

    @Override
    public String getTableName() {
        return "acs.equipo";
    }

    @Override
    public List<Equipo> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Equipo> equipos = new ArrayList<>();

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
                    Equipo equipo = new Equipo();
                    equipo.setCodigoBarras(resultSet.getString(1));
                    equipo.setMarca(resultSet.getString(2));
                    equipo.setDescripcion(resultSet.getString(3));

                    equipos.add(equipo);
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
        return equipos;
    }

    public void insert(Equipo equipoDTO) {
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
            statement.setString(indice++, equipoDTO.getCodigoBarras());
            statement.setString(indice++, equipoDTO.getMarca());
            statement.setString(indice++, equipoDTO.getDescripcion());

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

    public void update(Equipo equipoDTO) {
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
            statement.setString(indice++, equipoDTO.getCodigoBarras());
            statement.setString(indice++, equipoDTO.getMarca());
            statement.setString(indice++, equipoDTO.getDescripcion());
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
    public void updatePK(EquipoPk nuevo, EquipoPk viejo) {

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

            statement.setString(indice++, viejo.getCodigoBarras());

            statement.setString(indice++, nuevo.getCodigoBarras());

            resultSet = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("error en el UpdatePK" + e.getMessage());
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }

        }
    }

    public void delete(Equipo equipoDTO) {
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
            statement.setString(indice, equipoDTO.getCodigoBarras());
            
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
