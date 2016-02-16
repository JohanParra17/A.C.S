/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.RegistroEquipoDAO;
import edu.co.sena.proyecto.modelo.dto.RegistroEquipo;
import edu.co.sena.proyecto.modelo.dto.RegistroEquipoPk;
import edu.co.sena.proyecto.modelo.dto.ResourceManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            + "REGISTRO_ID_REGISTRO,\n"
            + "PROPIETARIO_EQUIPO_CODIGO_BARRAS,\n"
            + "PROPIETARIO_CUENTA_TIPO_DOCUMENTO\n"
            + "PROPIETARIO_CUENTA_NUMERO_DOCUMENTO\n"
            + "fechaEntrada_horaEntrada\n"
            + "fechaSalida_horaSalida\n"
            + "VALUES\n"
            + "(?,?,?,?,?,?,?,?)";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "REGISTRO_ID_REGISTRO = ?,\n"
            + "AND PROPIETARIO_EQUIPO_CODIGO_BARRAS = ? "
            + "AND PROPIETARIO_CUENTA_TIPO_DOCUMENTO = ? "
            + "AND PROPIETARIO_CUENTA_NUMERO_DOCUMENTO = ?"
            + "AND fechaEntrada_horaEntrada = ? "
            + "AND fechaSalida_horaSalida = ? ";

    private final String SQL_UPDATEPK = "UPDATE" + getTableName() + "\n"
            + "SET\n"
            + "REGISTRO_ID_REGISTRO = ?"
            + "PROPIETARIO_EQUIPO_CODIGO_BARRAS = ? "
            + "PROPIETARIO_CUENTA_NUMERO_DOCUMENTO = ?"
            + "WHERE REGISTRO_ID_REGISTRO = ?"
            + "AND PROPIETARIO_EQUIPO_CODIGO_BARRAS = ? "
            + "AND PROPIETARIO_CUENTA_NUMERO_DOCUMENTO = ?";
            
    private final String SQL_DELETE = "DELETE" + getTableName()
            + "PROPIETARIO_CUENTA_NUMERO_DOCUMENTO = ?";

    public String getTableName() {
        return "acs.registroequipo";
    }

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
                    registroe.setRegistroIdRegistro(resultSet.getInt(1));
                    registroe.setPropietarioEquipoCodigoBarras(resultSet.getString(2));
                    registroe.setPropietarioCuentaTipoDocumento(resultSet.getString(3));
                    registroe.setPropietarioCuentaNumeroDocumento(resultSet.getString(4));
                    registroe.setFechaEntrada_horaEntrada(resultSet.getTimestamp(5));
                    registroe.setFechaSalida_horaSalida(resultSet.getTimestamp(6));
                    

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
            statement.setInt(indice++, registroEquipoDTO.getRegistroIdRegistro());
            statement.setString(indice++, registroEquipoDTO.getPropietarioEquipoCodigoBarras());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaTipoDocumento());
            statement.setString(indice++, registroEquipoDTO.getPropietarioCuentaNumeroDocumento());
            statement.setTimestamp(indice++, registroEquipoDTO.getFechaEntrada_horaEntrada());
            statement.setTimestamp(indice++, registroEquipoDTO.getFechaSalida_horaSalida());
            

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
            statement.setTimestamp(indice++, registroEquipoDTO.getFechaEntrada_horaEntrada());
            statement.setTimestamp(indice++, registroEquipoDTO.getFechaSalida_horaSalida());
            

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

    
   
    public void updatePK(RegistroEquipoPk nuevo, RegistroEquipoPk viejo)  {
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

            statement.setInt(indice++, viejo.getRegistroIdRegistro());
            statement.setString(indice++, viejo.getPropietarioEquipoCodigoBarras());
            statement.setString(indice++, viejo.getPropietarioCuentaTipoDocumento());
            statement.setString(indice++, viejo.getPropietarioCuentaNumeroDocumento());

            statement.setInt(indice++, nuevo.getRegistroIdRegistro());
            statement.setString(indice++, nuevo.getPropietarioEquipoCodigoBarras());
            statement.setString(indice++, nuevo.getPropietarioCuentaTipoDocumento());
            statement.setString(indice++, nuevo.getPropietarioCuentaNumeroDocumento());

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
    public void delete(RegistroEquipo registroequipoDTO) {
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
            statement.setString(indice++, registroequipoDTO.getPropietarioCuentaNumeroDocumento());
            statement.setString(indice++, registroequipoDTO.getPropietarioCuentaTipoDocumento());
            statement.setString(indice++, registroequipoDTO.getPropietarioEquipoCodigoBarras());
            statement.setTimestamp(indice++, registroequipoDTO.getFechaEntrada_horaEntrada());
            statement.setTimestamp(indice++, registroequipoDTO.getFechaSalida_horaSalida());

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
