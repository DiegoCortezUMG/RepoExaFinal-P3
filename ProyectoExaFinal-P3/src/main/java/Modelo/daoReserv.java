/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.clsReserv;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author visitante
 */
public class daoReserv {
    private static final String SQL_SELECT = "SELECT idReservaciones,fkAsientos,subTotalAsiento,fkFactura FROM reservaciones";
    private static final String SQL_INSERT = "INSERT INTO reservaciones(idReservaciones,fkAsientos,subTotalAsiento,fkFactura) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE reservaciones SET fkAsientos=?,subTotalAsiento=?,fkFactura=? WHERE idReservaciones=?";
    private static final String SQL_DELETE = "DELETE FROM reservaciones WHERE idReservaciones=?";   
    public List<clsReserv> consultaR() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsReserv> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idReservaciones");
                int nombre = rs.getInt("fkAsientos");
                double contrasena = rs.getDouble("subTotalAsiento");
                int fact = rs.getInt("fkFactura");
                clsReserv usuario = new clsReserv();
                usuario.setIdR(id);
                usuario.setAsientos(nombre);
                usuario.setSubTotal(contrasena);
                usuario.setFactura(fact);
                usuarios.add(usuario);
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
    public int ingresaR(clsReserv usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, usuario.getAsientos());
            stmt.setDouble(2, usuario.getSubTotal());
            stmt.setInt(3, usuario.getFactura());
            
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
    public int actualizaR(clsReserv usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, usuario.getAsientos());
            stmt.setDouble(2, usuario.getSubTotal());
            stmt.setInt(3, usuario.getFactura());
            
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
    public int borrarR(clsReserv usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdR());
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
