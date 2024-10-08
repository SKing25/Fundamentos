package Ejercicio1;

public class Empleado {
    protected int id;
    protected String nombre;
    protected int edad;
    protected int añoIngreso;
    protected double salario = 1200000;

    public Empleado(int id, String nombre, int edad, int añoIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.añoIngreso = añoIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
}
