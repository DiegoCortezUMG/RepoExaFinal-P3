/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.clsPeli;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author visitante
 */
public class daoPeli {
    private static final String SQL_SELECT = "SELECT idPeliculas,Nombre,Clasificación,Genero,Subtitulado,Idioma,precio FROM peliculas";
    private static final String SQL_INSERT = "INSERT INTO peliculas(idPeliculas,Nombre,Clasificación,Genero,Subtitulado,Idioma,precio) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE peliculas SET Nombre=?,Clasificación=?,Genero=?,Subtitulado=?,Idioma=?,precio=? WHERE idPeliculas = ?";
    private static final String SQL_DELETE = "DELETE FROM peliculas WHERE idPeliculas=?";
    public List<clsPeli> consultaP() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsPeli> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idCines");
                String nombre = rs.getString("Nombre");
                String clas = rs.getString("Clasificación");
                String gen = rs.getString("Genero");
                String sub = rs.getString("Subtitulado");
                String idioma = rs.getString("Idioma");
                String precio = rs.getString("precio");
                
                clsPeli cine = new clsPeli();
                cine.setIdPeli(id);
                cine.setNombrePeli(nombre);
                cine.setClsPeli(clas);
                cine.setGenPeli(gen);
                cine.setSubPeli(sub);
                cine.setIdiomaPeli(idioma);
                cine.setPrecioPeli(precio);
                
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
    public int ingresaP(clsPeli cine) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cine.getNombrePeli());
            stmt.setString(2, cine.getClsPeli());
            stmt.setString(1, cine.getGenPeli());
            stmt.setString(2, cine.getSubPeli());
            stmt.setString(1, cine.getIdiomaPeli());
            stmt.setString(2, cine.getPrecioPeli());
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
    public int actualizaP(clsPeli cine) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cine.getNombrePeli());
            stmt.setString(2, cine.getClsPeli());
            stmt.setString(3, cine.getGenPeli());
            stmt.setString(4, cine.getSubPeli());
            stmt.setString(5, cine.getIdiomaPeli());
            stmt.setString(6, cine.getPrecioPeli());
            stmt.setInt(7, cine.getIdPeli());
            
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
    public int borrarP(clsPeli cine) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cine.getIdPeli());
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