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
public class tramontana extends carro {

    protected int peso, transimicion;

    public tramontana() {
        super();
    }

    public tramontana(int peso, int transimicion, int serie, Date fecha, Color color, String marac_llantas, String polarizado, int velocidad, int kilometros_galon, int precio) {
        super(serie, fecha, color, marac_llantas, polarizado, velocidad, kilometros_galon, precio);
        this.peso = peso;
        this.transimicion = transimicion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso > 1276 && peso < 1376) {
            this.peso = peso;
        } else {
            System.out.println("Peso fuera de rango");
        }
    }

    public int getTransimicion() {
        return transimicion;
    }

    public void setTransimicion(int transimicion) {
        if (transimicion > 5 && transimicion < 8) {
            this.transimicion = transimicion;
        } else {
            System.out.println("Fuera de rango de trasmicion");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "tramontana{" + "peso=" + peso + ", transimicion=" + transimicion + '}';
    }

}
