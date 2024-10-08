package Ejercicio1;

public class Vendedor extends Empleado {
    private double comision;
    private double ventas;

    public Vendedor(int id, String nombre, int edad, int añoIngreso, double comision, double ventas) {
        super(id, nombre, edad, añoIngreso);
        this.comision = comision;
        this.ventas = ventas;
        
    }

    public static double salarioTotal(double salario, double comision, double ventas){
        return salario + comision * ventas; 
    } 

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Vendedor - ID: " + id + " - Nombre: " + nombre + " - Ventas: " + ventas + " - Edad: "
                + edad + " - Año de ingreso: " + añoIngreso + " - Salario: $" + salarioTotal(salario, comision, ventas);
    }

}
