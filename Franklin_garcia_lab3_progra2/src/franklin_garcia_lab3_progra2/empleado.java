/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab3_progra2;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class empleado extends persona{
   protected int horas;
   private ArrayList<clientes>clientes=new ArrayList();

    public empleado() {
        super();
    }

    public empleado(int horas, String nombre, String id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public ArrayList<clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<clientes> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return super.toString()+"empleado{" + "horas=" + horas + ", clientes=" + clientes + '}';
    }
   
}
