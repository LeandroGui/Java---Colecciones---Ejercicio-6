/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se necesita
 * que la aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el main. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su precio
 * (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
 * el precio. Realizar un menú para lograr todas las acciones previamente
 * mencionadas.
 */
package Principal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class Ej_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        HashMap<String, String>Productos = new HashMap();
        String Prod = "", Prec = "" , dato = "S";
        
        do {
            System.out.println("<<<<< MENU >>>>>");
            System.out.println("1-Agregar Producto");
            System.out.println("2-Modificar Precio Producto");
            System.out.println("3-Borrar Producto");
            System.out.println("4-Mostrar todos los Productos");
            System.out.println("5-Salir");
            switch (leer.nextInt()) {
                case 1:
                    System.out.print("Nombre del Producto: ");
                    Prod = leer.next();
                    System.out.print("Precio Producto: ");
                    Prec = leer.next();
                    Productos.put(Prod, Prec);
                    break;
                case 2:
                    System.out.print("Nombre del Producto: ");
                    Prod = leer.next();
                    if (Productos.containsKey(Prod)) {
                        System.out.print("Precio Producto: ");
                        Prec = leer.next();
                        Productos.put(Prod, Prec);
                    }
                    else {
                        System.out.print("El producto no se encuentra cargado");
                    }
                    break;
                case 3:
                    System.out.print("Nombre del Producto: ");
                    Prod = leer.next();
                    if (Productos.containsKey(Prod)) {
                        Productos.remove(Prod);
                    }
                    else {
                        System.out.print("El producto no se encuentra cargado");
                    }
                    break;
                case 4:
                    for (Map.Entry<String, String> aux : Productos.entrySet()) {
                        String Producto = aux.getKey();
                        String Precio = aux.getValue();
                        System.out.println("Producto: "+ Producto + " - Precio: "+ Precio + "$");
                    }
                    break;
                case 5:
                    System.out.print("¿Desea realizar otra Operacion?(S/N)");
                    dato = leer.next();
                    break;
                default:
                    System.out.print("Opcion Erronea");
            }
        }
        while (dato.equals("S"));
    } 
    
}
