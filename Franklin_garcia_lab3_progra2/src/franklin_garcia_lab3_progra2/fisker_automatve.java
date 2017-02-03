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
public class fisker_automatve extends carro {
protected String camioneta;
    public fisker_automatve() {
        super();
    }

    public fisker_automatve(String camioneta, int serie, Date fecha, Color color, String marac_llantas, String polarizado, int velocidad, int kilometros_galon, int precio) {
        super(serie, fecha, color, marac_llantas, polarizado, velocidad, kilometros_galon, precio);
        this.camioneta = camioneta;
    }

    public String getCamioneta() {
        return camioneta;
    }

    public void setCamioneta(String camioneta) {
        this.camioneta = camioneta;
    }

    @Override
    public String toString() {
        return super.toString()+"fisker_automatve{" + "camioneta=" + camioneta + '}';
    }
    
    
}
