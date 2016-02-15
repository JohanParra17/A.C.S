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
public class EquipoDAOImp implements EquipoDAO{
    
    private Connection conexion;
    
    private final String SQL_SELECT = "select * from " + getTableName() + "";
    
    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + "CODIGO_BARRAS,\n"
            + "MARCA,\n"
            + "DESCRIPCION\n"
            + "VALUES\n"
            + "(?,?,?)";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "CODIGO_BARRAS = ?,\n"
            + "WHERE MARCA = ? "
            + "AND DESCRIPCION = ?";

    private final String SQL_UPDATEPK = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "CODIGO_BARRAS = ?,\n"
            + "MARCA = ?"
            + "DESCRIPCION = ?"
            + "WHERE CODIGO_BARRAS = ?"
            + "AND MARCA = ? "
            + "AND DESCRIPCION = ?";
    
    

    public String getTableName() {
        return "acs.equipo";
    }

    public List<Equipo> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Equipo> Equipo = new ArrayList<>();

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
                    Equipo equipo1 = new Equipo();
                    equipo1.setCodigoBarras(resultSet.getString(1));
                    equipo1.setMarca(resultSet.getString(2));
                    equipo1.setDescripcion(resultSet.getString(3));
                    
                   
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
        return Equipo;
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

        } catch (Exception _e) {
            System.out.println("error en el findAll");
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
            statement.setString(indice++, viejo.getMarca());
            statement.setString(indice++, viejo.getDescripcion());

            statement.setString(indice++, nuevo.getCodigoBarras());
            statement.setString(indice++, nuevo.getMarca());
            statement.setString(indice++, nuevo.getDescripcion());
            
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


