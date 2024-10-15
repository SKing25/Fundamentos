package Abstractas1;

public abstract class Figura {
    protected double area;
    protected double perimetro;

    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
}
