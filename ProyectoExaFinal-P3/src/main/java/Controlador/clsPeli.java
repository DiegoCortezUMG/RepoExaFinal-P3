/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class clsPeli {
    private int idPeli;
    private String nombrePeli;
    private String clsPeli;
    private String genPeli;
    private String subPeli;
    private String idiomaPeli;
    private String precioPeli;

    public int getIdPeli() {
        return idPeli;
    }

    public void setIdPeli(int idPeli) {
        this.idPeli = idPeli;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public String getClsPeli() {
        return clsPeli;
    }

    public void setClsPeli(String clsPeli) {
        this.clsPeli = clsPeli;
    }

    public String getGenPeli() {
        return genPeli;
    }

    public void setGenPeli(String genPeli) {
        this.genPeli = genPeli;
    }

    public String getSubPeli() {
        return subPeli;
    }

    public void setSubPeli(String subPeli) {
        this.subPeli = subPeli;
    }

    public String getIdiomaPeli() {
        return idiomaPeli;
    }

    public void setIdiomaPeli(String idiomaPeli) {
        this.idiomaPeli = idiomaPeli;
    }

    public String getPrecioPeli() {
        return precioPeli;
    }

    public void setPrecioPeli(String precioPeli) {
        this.precioPeli = precioPeli;
    }

    public clsPeli() {
    }

    public clsPeli(int idPeli) {
        this.idPeli = idPeli;
    }

    public clsPeli(int idPeli, String nombrePeli, String clsPeli, String genPeli, String subPeli, String idiomaPeli, String precioPeli) {
        this.idPeli = idPeli;
        this.nombrePeli = nombrePeli;
        this.clsPeli = clsPeli;
        this.genPeli = genPeli;
        this.subPeli = subPeli;
        this.idiomaPeli = idiomaPeli;
        this.precioPeli = precioPeli;
    }

    @Override
    public String toString() {
        return "clsPeli{" + "idPeli=" + idPeli + ", nombrePeli=" + nombrePeli + ", clsPeli=" + clsPeli + ", genPeli=" + genPeli + ", subPeli=" + subPeli + ", idiomaPeli=" + idiomaPeli + ", precioPeli=" + precioPeli + '}';
    }
    public List<clsPeli> getListadoP()
    {
        daoPelis daopeli = new daoPeli();
        List<clsPeli> listadoPelis = daoPeli.consultaP();
        return ListadoPelis;
    }
    public int setBorrarP(clsPeli peli)
    {
        daoPeli daopeli = new daopeli();
        return daopeli.borrarP(peli);
    }          
    public int setIngresarP(clsPeli peli)
    {
        daoPeli daopeli = new daoPeli();
        return daopeli.ingresaP(peli);
    }              
    public int setModificarP(clsPeli peli)
    {
        daoPeli daopeli = new daoPeli();
        return daopeli.actualizaP(peli);
    }
}
