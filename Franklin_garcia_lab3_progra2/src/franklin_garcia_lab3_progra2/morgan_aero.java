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
public class morgan_aero extends carro {
protected String convertible,cabina;

    public morgan_aero() {
        super();
    }

    public morgan_aero(String convertible, String cabina, int serie, Date fecha, Color color, String marac_llantas, String polarizado, int velocidad, int kilometros_galon, int precio) {
        super(serie, fecha, color, marac_llantas, polarizado, velocidad, kilometros_galon, precio);
        this.convertible = convertible;
        this.cabina = cabina;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    @Override
    public String toString() {
        return super.toString()+ "morgan_aero{" + "convertible=" + convertible + ", cabina=" + cabina + '}';
    }
    

}
