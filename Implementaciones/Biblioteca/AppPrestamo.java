package Biblioteca;

import java.time.*;

public class AppPrestamo {
    public static void main(String[] args) {
        // Crear país
        Pais pais = new Pais(173124, "Colombia");

        // Crear autor y editorial
        Autor autor = new Autor("Gabriel García Márquez", pais);
        Editorial editorial = new Editorial("001", "Editorial Sudamericana", pais);

        // Crear libro
        Libro libro = new Libro("123456789", "Cien años de soledad", "Primera", 417, autor, editorial);

        // Crear estudiante
        Estudiante estudiante = new Estudiante(1792, "Jorge Antonio");

        
        LocalDate fechaPrestamo = LocalDate.now().minusDays(10);  // Supongamos que el prestamo fue hace 10 dias
        Prestamo prestamo = new Prestamo(fechaPrestamo, libro, estudiante);

       
        System.out.println("Estado del préstamo: " + prestamo.obtenerEstado());
        System.out.println("Multa: $" + prestamo.calcularMulta());
    }
}
