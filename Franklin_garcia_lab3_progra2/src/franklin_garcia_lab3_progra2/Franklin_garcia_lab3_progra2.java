package franklin_garcia_lab3_progra2;

/**
 *
 * @author Franklin Garcia
 */
import java.awt.Color;
import static java.awt.Color.blue;
import java.util.*;

public class Franklin_garcia_lab3_progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<carro> inventario_carro = new ArrayList();
        ArrayList<persona> inventario_persona = new ArrayList();
        String opciongeneral = "";
        while (!opciongeneral.equalsIgnoreCase("4")) {
            System.out.println("Ingrese una opcion \n"
                    + "1-Agregar \n"
                    + "2-Modificar \n"
                    + "3-Eliminar \n");
            opciongeneral = lectura.nextLine();
            switch (opciongeneral) {
                case "1": {//agregar
                    String opcion_agregar = "";
                    while (!opcion_agregar.equalsIgnoreCase("3")) {
                        System.out.println("Ingrese opcion para agregar \n"
                                + "1-carro \n"
                                + "2-persona \n");
                        opcion_agregar = lectura.nextLine();
                        switch (opcion_agregar) {
                            case "1": {
                                String opcion_carro = "";
                                while (!opcion_carro.equalsIgnoreCase("5")) {
                                    System.out.println("Ingrese opcion de tipo de carro \n"
                                            + "1-Maybach \n"
                                            + "2-Morgan Aero 8 \n"
                                            + "3-Fisker automotive \n"
                                            + "4-Tramontana \n"
                                            + "5-salir \n");
                                    opcion_carro = lectura.nextLine();
                                    switch (opcion_carro) {
                                        case "1": {//Maybacha
                                            System.out.println("Agregar serie");
                                            int serie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String marca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int velocidad = lectura.nextInt();
                                            while (velocidad < 155 && velocidad > 160) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                velocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int kilometros = lectura.nextInt();
                                            while (kilometros < 50 && kilometros > 55) {
                                                System.out.println("Agregar kilometros");
                                                kilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int precio = lectura.nextInt();
                                            while (precio < 400000 && precio > 600000) {
                                                System.out.println("Precio de venta");
                                                precio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String polarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                polarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                polarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            System.out.println("Ingrese numero de llantas de repuesto");
                                            int llantas_repuesto = lectura.nextInt();
                                            inventario_carro.add(new Maybach(llantas_repuesto, serie, new Date(), blue, marca_llantas, polarizado, velocidad, kilometros, precio));
                                        }//fin de Maybach
                                        break;
                                        case "2": {
                                            System.out.println("Agregar serie");
                                            int serie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String marca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int velocidad = lectura.nextInt();
                                            while (velocidad < 140 && velocidad > 145) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                velocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int kilometros = lectura.nextInt();
                                            while (kilometros < 35 && kilometros > 40) {
                                                System.out.println("Agregar kilometros");
                                                kilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int precio = lectura.nextInt();
                                            while (precio < 500000 && precio > 700000) {
                                                System.out.println("Precio de venta");
                                                precio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String polarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                polarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                polarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            String convertible = "", cabina = "";
                                            String op_convertible = "", op_cabina = "";
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-convertible"
                                                    + "2-no convertible");
                                            op_convertible = lectura.nextLine();
                                            if (op_convertible.equals("1")) {
                                                convertible = "convertible";
                                            } else if (op_convertible.equals("2")) {
                                                convertible = "no convertible";
                                            }
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-Cabina unica"
                                                    + "2-Cabina doble");
                                            op_cabina = lectura.nextLine();
                                            if (op_cabina.equals("1")) {
                                                cabina = "Cabina unica";
                                            } else if (op_cabina.equals("2")) {
                                                cabina = "Cabina doble";
                                            }
                                            inventario_carro.add(new morgan_aero(convertible, cabina, serie, new Date(), blue, marca_llantas, polarizado, velocidad, kilometros, precio));
                                        }
                                        break;
                                        case "3": {
                                            System.out.println("Agregar serie");
                                            int serie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String marca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int velocidad = lectura.nextInt();
                                            while (velocidad < 160 && velocidad > 165) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                velocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int kilometros = lectura.nextInt();
                                            while (kilometros < 55 && kilometros > 60) {
                                                System.out.println("Agregar kilometros");
                                                kilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int precio = lectura.nextInt();
                                            while (precio < 450000 && precio > 650000) {
                                                System.out.println("Precio de venta");
                                                precio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String polarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                polarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                polarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            String op_camioneta = "", camioneta = "";
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-camioneta \n"
                                                    + "2-turismo \n");
                                            op_camioneta = lectura.nextLine();
                                            if (op_camioneta.equals("1")) {
                                                camioneta = "camioneta";
                                            } else if (op_camioneta.equals("2")) {
                                                camioneta = "turismo";
                                            }
                                            inventario_carro.add(new fisker_automatve(camioneta, serie, new Date(), blue, marca_llantas, polarizado, velocidad, kilometros, precio));
                                        }
                                        case "4": {
                                            System.out.println("Agregar serie");
                                            int serie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String marca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int velocidad = lectura.nextInt();
                                            while (velocidad < 175 && velocidad > 180) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                velocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int kilometros = lectura.nextInt();
                                            while (kilometros < 50 && kilometros > 55) {
                                                System.out.println("Agregar kilometros");
                                                kilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int precio = lectura.nextInt();
                                            while (precio < 800000 && precio > 1000000) {
                                                System.out.println("Precio de venta");
                                                precio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String polarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                polarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                polarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            System.out.println("Ingrese trasmicion");
                                            int transmicion = lectura.nextInt();
                                            System.out.println("Ingrese peso");
                                            int peso = lectura.nextInt();
                                            inventario_carro.add(new tramontana(peso, transmicion, serie, new Date(), blue, marca_llantas, polarizado, velocidad, kilometros, precio));
                                        }
                                        case "5": {
                                            break;
                                        }
                                        default: {
                                            System.out.println("Ingrese opcion de tipo de carro \n"
                                                    + "1-Maybach \n"
                                                    + "2-Morgan Aero 8 \n"
                                                    + "3-Fisker automotive \n"
                                                    + "4-Tramontana \n"
                                                    + "5-salir \n");
                                            opcion_carro = lectura.nextLine();
                                        }
                                    }
                                }
                            }
                            break;
                            case "2": {
                                String op_persona = "";
                                while (!op_persona.equalsIgnoreCase("3")) {
                                    System.out.println("Ingrese opcion \n"
                                            + "1-empleado \n"
                                            + "2-clientes \n");
                                    op_persona = lectura.nextLine();
                                    switch (op_persona) {
                                        case "1": {
                                            System.out.println("Ingres nombre");
                                            String nombre = lectura.nextLine();
                                            System.out.println("Ingrese ID");
                                            String Id = lectura.nextLine();
                                            System.out.println("Ingres edad");
                                            int edad = lectura.nextInt();
                                            System.out.println("Ingrese altura");
                                            double altura = lectura.nextDouble();
                                            System.out.println("Ingrese peso");
                                            double peso = lectura.nextInt();
                                            //-----------------------------
                                            System.out.println("Ingrese numero de horas");
                                            int horas = lectura.nextInt();
                                            inventario_persona.add(new empleado(horas, nombre, Id, edad, altura, peso));
                                        }
                                        break;
                                        case "2": {
                                            System.out.println("Ingres nombre");
                                            String nombre = lectura.nextLine();
                                            System.out.println("Ingrese ID");
                                            String Id = lectura.nextLine();
                                            System.out.println("Ingres edad");
                                            int edad = lectura.nextInt();
                                            System.out.println("Ingrese altura");
                                            double altura = lectura.nextDouble();
                                            System.out.println("Ingrese peso");
                                            double peso = lectura.nextInt();
                                            //-----------------------------
                                            System.out.println("Ingrese dinero que lleva");
                                            int dinero = lectura.nextInt();
                                            inventario_persona.add(new empleado(dinero, nombre, Id, edad, altura, peso));
                                        }
                                        break;
                                        case "3": {
                                            break;
                                        }
                                        default: {
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-empleado \n"
                                                    + "2-clientes \n");
                                            op_persona = lectura.nextLine();
                                        }
                                        break;
                                    }
                                }
                            }//fin de persona
                            break;
                            case "3": {
                                break;
                            }
                            default: {
                                System.out.println("Ingrese opcion para agregar \n"
                                        + "1-carro \n"
                                        + "2-persona \n");
                                opcion_agregar = lectura.nextLine();
                            }
                            break;
                        }
                    }

                }//fin de agregar
                break;
                case "2": {//modificar
                    String op_eliminar = "";
                    while (!op_eliminar.equalsIgnoreCase("3")) {
                        System.out.println("Ingrese opcion para eliminar \n"
                                + "1-carro \n"
                                + "2-persona \n");
                        op_eliminar = lectura.nextLine();
                        switch (op_eliminar) {
                            case "1": {
                                String op_carro = "";
                                while (!op_carro.equals("1")) {
                                    System.out.println("Ingrfese opcion \n"
                                            + "1-Maybach \n"
                                            + "2-Morgan Aero\n"
                                            + "3-Fisker automotive  8 \n"
                                            + "4-Tramontana \n"
                                            + "5-salir \n");
                                    op_carro = lectura.nextLine();
                                    switch (op_carro) {
                                        case "1": {
                                            System.out.println("Ingrese posicion que desea modificar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof Maybach) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((Maybach) t) + "\n";
                                                }
                                            }
                                            System.out.println("Agregar serie");
                                            int nuevoserie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String nuevomarca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int nuevovelocidad = lectura.nextInt();
                                            while (nuevovelocidad < 155 && nuevovelocidad > 160) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                nuevovelocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int nuevokilometros = lectura.nextInt();
                                            while (nuevokilometros < 50 && nuevokilometros > 55) {
                                                System.out.println("Agregar kilometros");
                                                nuevokilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int nuevoprecio = lectura.nextInt();
                                            while (nuevoprecio < 400000 && nuevoprecio > 600000) {
                                                System.out.println("Precio de venta");
                                                nuevoprecio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String nuevopolarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                nuevopolarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                nuevopolarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            System.out.println("Ingrese numero de llantas de repuesto");
                                            int nuevollantas_repuesto = lectura.nextInt();
                                            inventario_carro.get(pos).setKilometros_galon(nuevokilometros);
                                            inventario_carro.get(pos).setMarac_llantas(nuevomarca_llantas);
                                            inventario_carro.get(pos).setPolarizado(nuevopolarizado);
                                            inventario_carro.get(pos).setPrecio(nuevoprecio);
                                            inventario_carro.get(pos).setSerie(nuevoserie);
                                            inventario_carro.get(pos).setVelocidad(nuevovelocidad);
                                            ((Maybach) inventario_carro.get(pos)).setLlantas_respuestas(nuevollantas_repuesto);
                                        }//fin de maybach
                                        break;
                                        case "2": {
                                            System.out.println("Ingrese posicion que desea modificar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof morgan_aero) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((morgan_aero) t) + "\n";
                                                }
                                            }
                                            System.out.println("Agregar serie");
                                            int nuevoserie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String nuevomarca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int nuevovelocidad = lectura.nextInt();
                                            while (nuevovelocidad < 140 && nuevovelocidad > 145) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                nuevovelocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int nuevokilometros = lectura.nextInt();
                                            while (nuevokilometros < 35 && nuevokilometros > 40) {
                                                System.out.println("Agregar kilometros");
                                                nuevokilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int nuevoprecio = lectura.nextInt();
                                            while (nuevoprecio < 500000 && nuevoprecio > 700000) {
                                                System.out.println("Precio de venta");
                                                nuevoprecio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String nuevopolarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                nuevopolarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                nuevopolarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            String nuevoconvertible = "", nuevocabina = "";
                                            String op_convertible = "", op_cabina = "";
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-convertible"
                                                    + "2-no convertible");
                                            op_convertible = lectura.nextLine();
                                            if (op_convertible.equals("1")) {
                                                nuevoconvertible = "convertible";
                                            } else if (op_convertible.equals("2")) {
                                                nuevoconvertible = "no convertible";
                                            }
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-Cabina unica"
                                                    + "2-Cabina doble");
                                            op_cabina = lectura.nextLine();
                                            if (op_cabina.equals("1")) {
                                                nuevocabina = "Cabina unica";
                                            } else if (op_cabina.equals("2")) {
                                                nuevocabina = "Cabina doble";
                                            }
                                            ((morgan_aero) inventario_carro.get(pos)).setCabina(nuevocabina);
                                            ((morgan_aero) inventario_carro.get(pos)).setConvertible(nuevoconvertible);
                                            inventario_carro.get(pos).setKilometros_galon(nuevokilometros);
                                            inventario_carro.get(pos).setMarac_llantas(nuevomarca_llantas);
                                            inventario_carro.get(pos).setPolarizado(nuevopolarizado);
                                            inventario_carro.get(pos).setPrecio(nuevoprecio);
                                            inventario_carro.get(pos).setSerie(nuevoserie);
                                            inventario_carro.get(pos).setVelocidad(nuevovelocidad);
                                        }////////////////////////////////////////
                                        break;
                                        case "3": {
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof fisker_automatve) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((fisker_automatve) t) + "\n";
                                                }
                                            }

                                            System.out.println("Ingrese posicion que desea modificar");
                                            int pos = lectura.nextInt();
                                            System.out.println("Agregar serie");
                                            int nuevoserie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String nuevomarca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int nuevovelocidad = lectura.nextInt();
                                            while (nuevovelocidad < 160 && nuevovelocidad > 165) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                nuevovelocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int nuevokilometros = lectura.nextInt();
                                            while (nuevokilometros < 55 && nuevokilometros > 60) {
                                                System.out.println("Agregar kilometros");
                                                nuevokilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int nuevoprecio = lectura.nextInt();
                                            while (nuevoprecio < 450000 && nuevoprecio > 650000) {
                                                System.out.println("Precio de venta");
                                                nuevoprecio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String nuevopolarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                nuevopolarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                nuevopolarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            String op_camioneta = "",
                                                    nuevocamioneta = "";
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-camioneta \n"
                                                    + "2-turismo \n");
                                            op_camioneta = lectura.nextLine();
                                            if (op_camioneta.equals("1")) {
                                                nuevocamioneta = "camioneta";
                                            } else if (op_camioneta.equals("2")) {
                                                nuevocamioneta = "turismo";
                                            }
                                           ((fisker_automatve) inventario_carro.get(pos)).setCamioneta(nuevocamioneta);
                                            inventario_carro.get(pos).setKilometros_galon(nuevokilometros);
                                            inventario_carro.get(pos).setMarac_llantas(nuevomarca_llantas);
                                            inventario_carro.get(pos).setPolarizado(nuevopolarizado);
                                            inventario_carro.get(pos).setPrecio(nuevoprecio);
                                            inventario_carro.get(pos).setSerie(nuevoserie);
                                            inventario_carro.get(pos).setVelocidad(nuevovelocidad);
                                        }
                                        break;
                                        case "4": {
                                            System.out.println("Ingrese posicion que desea modificar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof tramontana) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((tramontana) t) + "\n";
                                                }
                                            }

                                            System.out.println("Agregar serie");
                                            int nuevoserie = lectura.nextInt();
                                            System.out.println("Agregar marca de llantas");
                                            String nuevomarca_llantas = lectura.nextLine();
                                            System.out.println("Agregar velocidad maxima");
                                            int nuevovelocidad = lectura.nextInt();
                                            while (nuevovelocidad < 175 && nuevovelocidad > 180) {
                                                System.out.println("Agregar velocidad maxima con un rango acpetable");
                                                nuevovelocidad = lectura.nextInt();
                                            }
                                            System.out.println("Agregar kilometros");
                                            int nuevokilometros = lectura.nextInt();
                                            while (nuevokilometros < 50 && nuevokilometros > 55) {
                                                System.out.println("Agregar kilometros");
                                                nuevokilometros = lectura.nextInt();
                                            }
                                            System.out.println("Precio de venta");
                                            int nuevoprecio = lectura.nextInt();
                                            while (nuevoprecio < 800000 && nuevoprecio > 1000000) {
                                                System.out.println("Precio de venta");
                                                nuevoprecio = lectura.nextInt();
                                            }
                                            System.out.println("Ingrese opcion  \n"
                                                    + "1-Polarizado"
                                                    + "2-No polarizado \n");
                                            String oppolarizado = lectura.nextLine();
                                            String nuevopolarizado = "";
                                            if (oppolarizado.equals("1")) {
                                                nuevopolarizado = "polarizado";
                                            } else if (oppolarizado.equals("2")) {
                                                nuevopolarizado = "No polarizado";
                                            }
                                            //------------------------------------------------------------------
                                            System.out.println("Ingrese trasmicion");
                                            int nuevotransmicion = lectura.nextInt();
                                            System.out.println("Ingrese peso");
                                            int nuevopeso = lectura.nextInt();
                                            ((tramontana) inventario_carro.get(pos)).setPeso(nuevopeso);
                                            ((tramontana) inventario_carro.get(pos)).setTransimicion(nuevotransmicion);
                                            inventario_carro.get(pos).setKilometros_galon(nuevokilometros);
                                            inventario_carro.get(pos).setMarac_llantas(nuevomarca_llantas);
                                            inventario_carro.get(pos).setPolarizado(nuevopolarizado);
                                            inventario_carro.get(pos).setPrecio(nuevoprecio);
                                            inventario_carro.get(pos).setSerie(nuevoserie);
                                            inventario_carro.get(pos).setVelocidad(nuevovelocidad);
                                        }
                                        break;

                                        case "5": {
                                            break;
                                        }
                                        default: {
                                            System.out.println("Ingrfese opcion \n"
                                                    + "1-Maybach \n"
                                                    + "2- morgan \n"
                                                    + "3-Fisker automotive 8 \n"
                                                    + "4-Tramontana \n"
                                                    + "5-salir \n");
                                            op_carro = lectura.nextLine();
                                        }
                                    }
                                }
                            }
                            break;
                            case "2": {
                                String op_persona = "";
                                while (!op_persona.equalsIgnoreCase("3")) {
                                    System.out.println("Ingrese opcion \n"
                                            + "1-empleado \n"
                                            + "2-clientes \n");
                                    op_persona = lectura.nextLine();
                                    switch (op_persona) {
                                        case "1": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_persona) {
                                                if (t instanceof empleado) {
                                                    elementos += inventario_persona.indexOf(t) + " " + ((empleado) t) + "\n";
                                                }
                                            }
                                            System.out.println("Ingres nombre");
                                            String nuevonombre = lectura.nextLine();
                                            System.out.println("Ingrese ID");
                                            String nuevoId = lectura.nextLine();
                                            System.out.println("Ingres edad");
                                            int nuevoedad = lectura.nextInt();
                                            System.out.println("Ingrese altura");
                                            double nuevoaltura = lectura.nextDouble();
                                            System.out.println("Ingrese peso");
                                            double nuevopeso = lectura.nextInt();
                                            //-----------------------------
                                            System.out.println("Ingrese numero de horas");
                                            int nuevohoras = lectura.nextInt();
                                            ((empleado) inventario_persona.get(pos)).setHoras(nuevohoras); 
                                            inventario_persona.get(pos).setAltura(nuevoaltura);
                                            inventario_persona.get(pos).setEdad(nuevoedad);
                                            inventario_persona.get(pos).setId(nuevoId);
                                            inventario_persona.get(pos).setNombre(nuevonombre);
                                            inventario_persona.get(pos).setPeso(nuevopeso);
                                        }
                                        break;
                                        case "2": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_persona) {
                                                if (t instanceof clientes) {
                                                    elementos += inventario_persona.indexOf(t) + " " + ((clientes) t) + "\n";
                                                }
                                            }
                                            System.out.println("Ingres nombre");
                                            String nuevonombre = lectura.nextLine();
                                            System.out.println("Ingrese ID");
                                            String nuevoId = lectura.nextLine();
                                            System.out.println("Ingres edad");
                                            int nuevoedad = lectura.nextInt();
                                            System.out.println("Ingrese altura");
                                            double nuevoaltura = lectura.nextDouble();
                                            System.out.println("Ingrese peso");
                                            double nuevopeso = lectura.nextInt();
                                            //-----------------------------
                                            System.out.println("Ingrese dinero que lleva");
                                            int nuevodinero = lectura.nextInt();
                                            ((clientes) inventario_persona.get(pos)).setDinero(nuevodinero);
                                            inventario_persona.get(pos).setAltura(nuevoaltura);
                                            inventario_persona.get(pos).setEdad(nuevoedad);
                                            inventario_persona.get(pos).setId(nuevoId);
                                            inventario_persona.get(pos).setNombre(nuevonombre);
                                            inventario_persona.get(pos).setPeso(nuevopeso);
                                        }
                                        break;
                                        case "3": {
                                            break;
                                        }
                                        default: {
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-empleado \n"
                                                    + "2-clientes \n");
                                            op_persona = lectura.nextLine();
                                        }
                                    }
                                }
                            }
                            break;
                            case "3": {
                                break;
                            }
                            default: {
                                System.out.println("Ingrese opcion para eliminar \n"
                                        + "1-carro \n"
                                        + "2-persona \n");
                                op_eliminar = lectura.nextLine();
                            }
                            break;
                        }
                    }

                }//fin de modificar
                break;
                case "3": {//elimibar
                    String op_eliminar = "";
                    while (!op_eliminar.equalsIgnoreCase("3")) {
                        System.out.println("Ingrese opcion para eliminar \n"
                                + "1-carro \n"
                                + "2-persona \n");
                        op_eliminar = lectura.nextLine();
                        switch (op_eliminar) {
                            case "1": {
                                String op_carro = "";
                                while (!op_carro.equals("1")) {
                                    System.out.println("Ingrfese opcion \n"
                                            + "1-Maybach \n"
                                            + "2-Fisker automotive \n"
                                            + "3-Morgan Aero 8 \n"
                                            + "4-Tramontana \n"
                                            + "5-salir \n");
                                    op_carro = lectura.nextLine();
                                    switch (op_carro) {
                                        case "1": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof Maybach) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((Maybach) t) + "\n";
                                                }
                                            }
                                            inventario_carro.remove(pos);

                                        }
                                        break;
                                        case "2": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof fisker_automatve) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((fisker_automatve) t) + "\n";
                                                }
                                            }
                                            inventario_carro.remove(pos);

                                        }
                                        break;
                                        case "3": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof morgan_aero) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((morgan_aero) t) + "\n";
                                                }
                                            }
                                            inventario_carro.remove(pos);
                                        }
                                        break;
                                        case "4": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_carro) {
                                                if (t instanceof tramontana) {
                                                    elementos += inventario_carro.indexOf(t) + " " + ((tramontana) t) + "\n";
                                                }
                                            }
                                            inventario_carro.remove(pos);
                                        }
                                        break;
                                        case "5": {
                                            break;
                                        }
                                        default: {
                                            System.out.println("Ingrfese opcion \n"
                                                    + "1-Maybach \n"
                                                    + "2-Fisker automotive \n"
                                                    + "3-Morgan Aero 8 \n"
                                                    + "4-Tramontana \n"
                                                    + "5-salir \n");
                                            op_carro = lectura.nextLine();
                                        }
                                    }
                                }
                            }
                            break;
                            case "2": {
                                String op_persona = "";
                                while (!op_persona.equalsIgnoreCase("3")) {
                                    System.out.println("Ingrese opcion \n"
                                            + "1-empleado \n"
                                            + "2-clientes \n");
                                    op_persona = lectura.nextLine();
                                    switch (op_persona) {
                                        case "1": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_persona) {
                                                if (t instanceof empleado) {
                                                    elementos += inventario_persona.indexOf(t) + " " + ((empleado) t) + "\n";
                                                }
                                            }
                                            inventario_persona.remove(pos);
                                        }
                                        break;
                                        case "2": {
                                            System.out.println("Ingrese posicion que desea eliminar");
                                            int pos = lectura.nextInt();
                                            String elementos = "";
                                            for (Object t : inventario_persona) {
                                                if (t instanceof clientes) {
                                                    elementos += inventario_persona.indexOf(t) + " " + ((clientes) t) + "\n";
                                                }
                                            }
                                            inventario_persona.remove(pos);
                                        }
                                        break;
                                        case "3": {
                                            break;
                                        }
                                        default: {
                                            System.out.println("Ingrese opcion \n"
                                                    + "1-empleado \n"
                                                    + "2-clientes \n");
                                            op_persona = lectura.nextLine();
                                        }
                                    }
                                }
                            }
                            break;
                            case "3": {
                                break;
                            }
                            default: {
                                System.out.println("Ingrese opcion para eliminar \n"
                                        + "1-carro \n"
                                        + "2-persona \n");
                                op_eliminar = lectura.nextLine();
                            }
                            break;
                        }
                    }
                }//fin de eliminar
                break;
                case "4": {//salir
                    break;
                }
                default: {
                    System.out.println("Ingrese una opcion \n"
                            + "1-Agregar \n"
                            + "2-Modificar \n"
                            + "3-Eliminar \n");
                    opciongeneral = lectura.nextLine();
                }
            }
        }/////////////////////////////
    }

}
