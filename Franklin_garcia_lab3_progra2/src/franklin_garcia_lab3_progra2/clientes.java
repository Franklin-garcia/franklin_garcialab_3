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
public class clientes extends persona{
    protected int dinero;
    private ArrayList<carro>carros=new ArrayList();

    public clientes() {
        super();
    }

    public clientes(int dinero, String nombre, String id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return super.toString()+"clientes{" + "dinero=" + dinero + ", carros=" + carros + '}';
    }
    
}
