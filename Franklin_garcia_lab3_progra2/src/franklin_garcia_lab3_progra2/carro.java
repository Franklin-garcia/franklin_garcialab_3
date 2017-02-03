/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab3_progra2;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Franklin Garcia
 */
public class carro {
 private int serie;
 private Date fecha;
 private Color color;
 private String marac_llantas;
 private String polarizado;
 private int velocidad;
 private int kilometros_galon;
 private int precio;

    public carro() {
    }

    public carro(int serie, Date fecha, Color color, String marac_llantas, String polarizado, int velocidad, int kilometros_galon, int precio) {
        this.serie = serie;
        this.fecha = fecha;
        this.color = color;
        this.marac_llantas = marac_llantas;
        this.polarizado = polarizado;
        this.velocidad = velocidad;
        this.kilometros_galon = kilometros_galon;
        this.precio = precio;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarac_llantas() {
        return marac_llantas;
    }

    public void setMarac_llantas(String marac_llantas) {
        this.marac_llantas = marac_llantas;
    }

    public String getPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;
        
    }

    public int getKilometros_galon() {
        return kilometros_galon;
    }

    public void setKilometros_galon(int kilometros_galon) {
        this.kilometros_galon = kilometros_galon;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "carro{" + "serie=" + serie + ", fecha=" + fecha + ", color=" + color + ", marac_llantas=" + marac_llantas + ", polarizado=" + polarizado + ", velocidad=" + velocidad + ", kilometros_galon=" + kilometros_galon + ", precio=" + precio + '}';
    }
 
}
