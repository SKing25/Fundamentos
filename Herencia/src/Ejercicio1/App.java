package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(1010, "Santiago", 48, 2000, 0.15, 55);
        Vendedor vendedor2 = new Vendedor(1020, "Nicolas", 55, 1985, 0.15, 30);
        Vendedor vendedor3 = new Vendedor(1030, "Camilo", 38, 2010, 0.15, 10);

        Repartidor repartidor1 = new Repartidor(2010, "Jorge", 30, 2020, 2, 2);
        Repartidor repartidor2 = new Repartidor(2020, "Ivan", 20, 2024, 5, 20);
        Repartidor repartidor3 = new Repartidor(2030, "Brayan", 45, 1999, 1, 0);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        Collections.addAll(listaEmpleados, vendedor1, vendedor2, vendedor3, repartidor1, repartidor2, repartidor3);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el ID del empleado: ");
        int id = scanner.nextInt();
        scanner.close();

        Empleado empleadoEncontrado = null;

        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Vendedor) {
                System.out.println("Vendedor: " + empleado);
            } else if (empleado instanceof Repartidor) {
                System.out.println("Repartidor: " + empleado);
            }
        }

        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId() == id) {
                empleadoEncontrado = empleado;
                break;
            }
        }

        if (empleadoEncontrado != null) {
            System.out.println(empleadoEncontrado);
        } else {
            System.out.println("Empleado no existe");
        }

    }
}