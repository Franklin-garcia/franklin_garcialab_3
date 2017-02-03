
package franklin_garcia_lab3_progra2;

/**
 *
 * @author Franklin Garcia
 */
public class persona {
private String nombre,id;
private int edad;
private double altura,peso;

    public persona() {
    }

    public persona(String nombre, String id, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=18) {
            this.edad = edad;
        }else{
            System.out.println("No menor de edad");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>=1.55) {
            this.altura = altura;
        }else{
            System.out.println("Muy bajito para andar carro");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso>=120) {
            this.peso = peso;
        }
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }

}
