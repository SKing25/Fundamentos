package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Producto producto1 = new Perecedero(1010, "Cocacola", 2000, 1);
        Producto producto2 = new Perecedero(1020, "Pepsi", 2500, 2);
        Producto producto3 = new Perecedero(1030, "Postobon", 1500, 3);

        Producto producto4 = new NoPerecedero(2010, "lenteja", 5000, 1);
        Producto producto5 = new NoPerecedero(2020, "arroz", 9000, 2);
        Producto producto6 = new NoPerecedero(2030, "pasta", 10000, 3);

        ArrayList<Producto> listaProductos = new ArrayList<>();

        Collections.addAll(listaProductos, producto1, producto2, producto3, producto4, producto5, producto6);
        
        for (Producto producto : listaProductos) {
            if (producto instanceof Perecedero) {
                System.out.println("Productos perecederos: " + producto);
            } else if (producto instanceof NoPerecedero) {
                System.out.println("Productos no perecederos: " + producto);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa el codigo del producto: ");
        int codigo = scanner.nextInt();

        Producto productoEncontrado = null;

        for (Producto producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                productoEncontrado = producto;
                break;
            }
        }

        if (productoEncontrado != null) {
            System.out.print("\nDigite la cantidad a comprar: ");
            int cantidad = scanner.nextInt();
            scanner.close();

            productoEncontrado.setPrecio(cantidad * productoEncontrado.getPrecio());
            
            System.out.println(productoEncontrado);
        } else {
            System.out.println("Producto no existe");
        }
    }
}
