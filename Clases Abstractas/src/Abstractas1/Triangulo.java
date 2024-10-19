package Abstractas1;

public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2; // Semiperímetro
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3)); // Fórmula de Herón
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }
}
