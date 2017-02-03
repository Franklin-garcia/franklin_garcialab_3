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
public class Maybach extends carro {
protected int llantas_respuestas;

    public Maybach() {
        super();
    }

    public Maybach(int llantas_respuestas, int serie, Date fecha, Color color, String marac_llantas, String polarizado, int velocidad, int kilometros_galon, int precio) {
        super(serie, fecha, color, marac_llantas, polarizado, velocidad, kilometros_galon, precio);
        this.llantas_respuestas = llantas_respuestas;
    }
    

    public int getLlantas_respuestas() {
        return llantas_respuestas;
    }

    public void setLlantas_respuestas(int llantas_respuestas) {
        if (llantas_respuestas==1||llantas_respuestas==2) {
            this.llantas_respuestas = llantas_respuestas;
        }else{
            System.out.println("Exeso de llantas de repuesto");
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+ "Maybach{" + "llantas_respuestas=" + llantas_respuestas + '}';
    }
    
}
