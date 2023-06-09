/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.daoReserv;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class clsReserv {
    private int idR;
    private int asientos;
    private double subTotal;
    private int factura;

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public clsReserv() {
    }

    public clsReserv(int idR) {
        this.idR = idR;
    }

    public clsReserv(int idR, int asientos, double subTotal, int factura) {
        this.idR = idR;
        this.asientos = asientos;
        this.subTotal = subTotal;
        this.factura = factura;
    }
    public List<clsReserv> getListadoR()
    {
        daoReserv daor = new daoReserv();
        List<clsReserv> listadoR = daor.consultaR();
        return listadoR;
    }
    public int setBorrarR(clsReserv reserv)
    {
        daoReserv daor = new daoReserv();
        return daor.borrarR(reserv);
    }          
    public int setIngresarR(clsReserv reserv)
    {
        daoReserv daor= new daoReserv();
        return daor.ingresaR(reserv);
    }              
    public int setModificarR(clsReserv reserv)
    {
        daoReserv daor = new daoReserv();
        return daor.actualizaR(reserv);
    }            
}
