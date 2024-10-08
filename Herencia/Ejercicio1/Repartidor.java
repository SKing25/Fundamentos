package Ejercicio1;

public class Repartidor extends Empleado {
    private int zona;
    private int repartos;
    
    public Repartidor(int id, String nombre, int edad, int añoIngreso, int zona, int repartos) {
        super(id, nombre, edad, añoIngreso);
        this.zona = zona;
        this.repartos = repartos;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getRepartos() {
        return repartos;
    }

    public void setRepartos(int repartos) {
        this.repartos = repartos;
    }

    public static int verificarZona(int zona){
        if(zona != 1 && zona != 2 && zona != 3 && zona != 4 && zona != 5){
            return 1;
        }
        else {
            return zona;
        }
    }

    public static double salarioTotal(double salario, int repartos){
        return salario + repartos * 10000;
    }

    @Override
    public String toString() {
        return "Repartidor - ID: " + id + " - Zona: " + verificarZona(zona) + " - Nombre: " + nombre + " - Repartos: " + repartos + " - Edad: "
                + edad + " - Año de ingreso: " + añoIngreso + " - Salario: $" + salarioTotal(salario, repartos);
    }

    
}
