/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.CuentaDAO;
import edu.co.sena.proyecto.modelo.dto.Cuenta;
import edu.co.sena.proyecto.modelo.dto.CuentaPk;
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
public class CuentaDAOImp implements CuentaDAO{
    
    private Connection conexion;
    
    private final String SQL_SELECT = "select * from " + getTableName() + "";
    
    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + "(TIPO_DOCUMENTO,\n"
            + "NUMERO_DOCUMENTO,\n"
            + "PRIMER_NOMBRE, \n"
            + "SEGUNDO_NOMBRE, \n"
            + "PRIMER_APELLIDO, \n"
            + "SEGUNDO_APELLIDO, \n"
            + "ESTADO, \n"
            + "CARGO, \n"
            + "FOTO ) \n"
            + "VALUES"
            + "(?,?,?,?,?,?,?,?,?);";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + "  SET \n"
            + " PRIMER_NOMBRE = ?, \n"
            + " SEGUNDO_NOMBRE = ?, \n"
            + " PRIMER_APELLIDO = ?, \n"
            + " SEGUNDO_APELLIDO = ?, \n"
            + " ESTADO = ?, \n"
            + " CARGO = ?, \n "
            + " FOTO = ? "
            +" WHERE NUMERO_DOCUMENTO = ?  AND TIPO_DOCUMENTO = ?;";
    
    
    private final String SQL_UPDATEPK = "UPDATE " + getTableName() + "\n"
            + " SET\n "
            + "TIPO_DOCUMENTO = ?,\n"
            + "NUMERO_DOCUMENTO = ? " 
            + "WHERE NUMERO_DOCUMENTO = ? \n "
            + "AND TIPO_DOCUMENTO = ?; ";
    
    private final  String SQL_DELETE = "DELETE FROM " +getTableName() + "\n"
            + " WHERE TIPO_DOCUMENTO = ? ; ";
            

    public String getTableName() {
        return "acs.cuenta";
    }

    @Override
    public List<Cuenta> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Cuenta> cuentas = new ArrayList<>();

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
                    Cuenta cuenta = new Cuenta();
                    cuenta.setTipoDocumento(resultSet.getString(1));
                    cuenta.setNumeroDocumento(resultSet.getString(2));
                    cuenta.setPrimerNombre(resultSet.getString(3));
                    cuenta.setSegundoNombre(resultSet.getString(4));
                    cuenta.setPrimerApellido(resultSet.getString(5));
                    cuenta.setSegundoApellido(resultSet.getString(6));
                    cuenta.setEstado(resultSet.getBoolean(7));
                    cuenta.setCargo(resultSet.getString(8));
                    cuenta.setFoto(resultSet.getBlob(9));
                    
                    cuentas.add(cuenta);
                }
            }

        } catch (Exception e) {
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

    @Override
    public void insert(Cuenta cuentaDTO) {
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
            statement.setString(indice++, cuentaDTO.getTipoDocumento());
            statement.setString(indice++, cuentaDTO.getNumeroDocumento());
            statement.setString(indice++, cuentaDTO.getPrimerNombre());
            statement.setString(indice++, cuentaDTO.getSegundoNombre());
            statement.setString(indice++, cuentaDTO.getPrimerApellido());
            statement.setString(indice++, cuentaDTO.getSegundoApellido());
            statement.setBoolean(indice++, cuentaDTO.getEstado());
            statement.setString(indice++, cuentaDTO.getCargo());
            statement.setBlob(indice++, cuentaDTO.getFoto());
          

            resultSet = statement.executeUpdate();

        } catch (Exception e) {
            System.err.println("error en el insert "+e.getMessage());
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }


    @Override
    public void update(Cuenta cuentaDTO) {
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
            statement.setString(indice++, cuentaDTO.getTipoDocumento());
            statement.setString(indice++, cuentaDTO.getNumeroDocumento());
            statement.setString(indice++, cuentaDTO.getPrimerNombre());
            statement.setString(indice++, cuentaDTO.getSegundoNombre());
            statement.setString(indice++, cuentaDTO.getPrimerApellido());
            statement.setString(indice++, cuentaDTO.getSegundoApellido());
            statement.setBoolean(indice++, cuentaDTO.getEstado());
            statement.setString(indice++, cuentaDTO.getCargo());
            statement.setBlob(indice++, cuentaDTO.getFoto());
            
            resultSet = statement.executeUpdate();

        } catch (Exception e) {
            
            System.out.println("error en el findAll"+ e.getMessage());
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }

    @Override
    public void updatePK(CuentaPk nuevo, CuentaPk viejo) {
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

            statement.setString(indice++, viejo.getTipoDocumento());
            statement.setString(indice++, viejo.getNumeroDocumento());
            

            statement.setString(indice++, nuevo.getTipoDocumento());
            statement.setString(indice++, nuevo.getNumeroDocumento());
           

            resultSet = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println("error en el UpdatePK"+ e.getMessage());
        } finally {
            ResourceManager.close(statement);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }

        }
    }

    @Override
    public void delete(Cuenta cuentaDTO) {
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
            
            statement.setString(indice, cuentaDTO.getSegundoNombre());
          

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

