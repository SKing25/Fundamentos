package Abstractas1;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        area = ancho * alto;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * (ancho + alto);
    }
}