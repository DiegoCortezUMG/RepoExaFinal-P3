/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.clsCine;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author visitante
 */
public class daoCine {
    private static final String SQL_SELECT = "SELECT idCines,Nombre,Dirección FROM cines";
    private static final String SQL_INSERT = "INSERT INTO Cines(idCines,Nombre,Dirección) VALUES(?,?,?)";
    private static final String SQL_UPDATE = "UPDATE Cines SET Nombre=?, Dirección=? WHERE idCines = ?";
    private static final String SQL_DELETE = "DELETE FROM Cines WHERE idCines=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT idCines,Nombre,Dirección FROM Cines WHERE Nombre = ?";
    private static final String SQL_SELECT_ID = "SELECT IdCines, Nombre, Dirección FROM tbl_usuario WHERE idCines = ?";     
    public List<clsCine> consultaC() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsCine> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idCines");
                String nombre = rs.getString("Nombre");
                String contrasena = rs.getString("Dirección");
                clsCine cine = new clsCine();
                cine.setIdCine(id);
                cine.setNombreCine(nombre);
                cine.setDirCine(contrasena);
                usuarios.add(cine);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuarios;
    }
    public int ingresaC(clsCine cine) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cine.getNombreCine());
            stmt.setString(2, cine.getDirCine());
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public int actualizaC(clsCine cine) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cine.getNombreCine());
            stmt.setString(2, cine.getDirCine());
            stmt.setInt(, cine.getIdCine());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public int borrarC(clsCine cine) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cine.getIdCine());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
