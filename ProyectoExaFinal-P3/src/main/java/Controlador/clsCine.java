/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.daoCine;
import Modelo.daoPeli;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class clsCine {
    private int idCine;
    private String nombreCine;
    private String dirCine;

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public String getDirCine() {
        return dirCine;
    }

    public void setDirCine(String dirCine) {
        this.dirCine = dirCine;
    }

    public clsCine() {
    }

    public clsCine(int idCine) {
        this.idCine = idCine;
    }

    public clsCine(int idCine, String nombreCine) {
        this.idCine = idCine;
        this.nombreCine = nombreCine;
    }

    public clsCine(int idCine, String nombreCine, String dirCine) {
        this.idCine = idCine;
        this.nombreCine = nombreCine;
        this.dirCine = dirCine;
    }
    @Override
    public String toString() {
        return "clsCine{" + "idCine=" + idCine + ", nombreCine=" + nombreCine + ", dirCine=" + dirCine + '}';
    }
    public List<clsCine> getListadoC()
    {
        daoCine daocine = new daoCine();
        List<clsCine> ListadoCine= daocine.consultaC();
        return ListadoCine;
    }
    public int setBorrarC(clsCine cine)
    {
        daoCine daocine = new daoCine();
        return daocine.borrarC(cine);
    }          
    public int setIngresarC(clsCine cine)
    {
        daoCine daocine = new daoCine();
        return daocine.ingresaC(cine);
    }              
    public int setModificarC(clsCine cine)
    {
        daoCine daocine = new daoCine();
        return daocine.actualizaC(cine);
    }
}
