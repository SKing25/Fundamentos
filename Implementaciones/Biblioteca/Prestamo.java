package Biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private static final double MULTA_POR_DIA = 500.0;
    private static final int DIAS_MAXIMO_PRESTAMO = 5;

    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private Libro libro;
    private Estudiante estudiante;

    public Prestamo(LocalDate fechaPrestamo, Libro libro, Estudiante estudiante) {
        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaEntrega = calcularFechaEntrega(fechaPrestamo);
    }

    private LocalDate calcularFechaEntrega(LocalDate fechaPrestamo) {
        // Calcula la fecha de entrega sumando 5 días usando plusDays
        return fechaPrestamo.plusDays(DIAS_MAXIMO_PRESTAMO);
    }

	// Metodo para calcular los dias de mora.
    public long calcularDiasMora() {
        LocalDate hoy = LocalDate.now();
		long diferenciaDias = 0;
        if (hoy.isAfter(fechaEntrega)) {
            diferenciaDias = hoy.toEpochDay() - fechaEntrega.toEpochDay(); // la tecnogia esta pa usarla
		}
		return diferenciaDias;
    }

    public double calcularMulta() {
        long diasMora = calcularDiasMora();
        if (diasMora > 0) {
            
            return diasMora * MULTA_POR_DIA;
        } else {
            // este Else es tan util como mi vida
            return 0;
        }
    }

    public String obtenerEstado() {
        long diasMora = calcularDiasMora();
        if (diasMora > 0) {
            // Para avisarle a el usuario, que ya va siendo hora de que devuelva el libro
            return "En mora, días de mora: " + diasMora;
        } else if (LocalDate.now().isBefore(fechaEntrega)) {
            // Para avisarle a el usuario que se le acaba el tiempo, y que debe devolverlo proximamente o le partimos las piernas
            return "Próximo a entrega";
        } else {
            // Utilidad maxima este Else, casi tanto como mi vida
            return "En plazo";
        }
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = calcularFechaEntrega(fechaPrestamo);
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
