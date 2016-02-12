/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.proyecto.modelo.dao.mysql;

import edu.co.sena.proyecto.modelo.daoo.PropietarioDAO;
import edu.co.sena.proyecto.modelo.daoo.UsuarioDAO;
import edu.co.sena.proyecto.modelo.dto.ResourceManager;
import edu.co.sena.proyecto.modelo.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fores
 */
public class UsuarioDAOImp implements UsuarioDAO{
    
public class PropietarioDAOImp implements PropietarioDAO {

        private Connection conexion;

        private final String SQL_SELECT = "select * from " + getTableName() + "";

        private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
                + "CUENTA_TIPO_DOCUMENTO,\n"
                + "CUENTA_NUEMRO_DOCUMENTO,\n"
                + "PASSWORD\n"
                + "VALUES\n"
                + "(?,?,?)";

        private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
                + "SET\n"
                + "CUENTA_TIPO_DOCUMENTO = ?,\n"
                + "WHERE CUENTA_NUEMRO_DOCUMENTO = ? AND PASSWORD = ?";

        public String getTableName() {
            return "acs.usuario";
        }

        public List<Usuario> findAll() {
            // declaracion de variables
            final boolean estaConectado = (conexion != null);
            Connection conn = null;
            PreparedStatement statement = null;
            ResultSet resultSet = null;
            List<Usuario> Usuario = new ArrayList<>();

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
                        Usuario usuario1 = new Usuario();
                        usuario1.setCuentaTipoDocumento(resultSet.getString(1));
                        usuario1.setCuentaNumeroDocumento(resultSet.getString(2));
                        usuario1.setPassword(resultSet.getString(3));

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
            return Usuario;
        }

        public void insert(Usuario usuarioDTO) {
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
                statement.setString(indice++, usuarioDTO.getCuentaTipoDocumento());
                statement.setString(indice++, usuarioDTO.getCuentaNumeroDocumento());
                statement.setString(indice++, usuarioDTO.getPassword());

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

        public void update(Usuario usuarioDTO) {
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
                statement.setString(indice++, usuarioDTO.getCuentaTipoDocumento());
                statement.setString(indice++, usuarioDTO.getCuentaNumeroDocumento());
                statement.setString(indice++, usuarioDTO.getPassword());
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
}
