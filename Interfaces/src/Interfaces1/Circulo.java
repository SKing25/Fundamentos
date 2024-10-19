package Interfaces1;

public class Circulo extends Figura implements ICalcularArea, ICalcularPerimetro{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
}