package Abstractas1;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("Área del Círculo: " + circulo.getArea());
        System.out.println("Perímetro del Círculo: " + circulo.getPerimetro());

        Triangulo triangulo = new Triangulo(3, 4, 5);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        System.out.println("Área del Triángulo: " + triangulo.getArea());
        System.out.println("Perímetro del Triángulo: " + triangulo.getPerimetro());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        System.out.println("Área del Rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del Rectángulo: " + rectangulo.getPerimetro());
    }
}
