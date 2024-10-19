package Ejercicio2;

public class Perecedero extends Producto {
    private int dias;

    public Perecedero(int codigo, String descripcion, double precio, int dias) {
        super(codigo, descripcion, precio);
        this.dias = dias;
    }

    public static double venta(int dias, double precio){
        double venta = precio;
        
        switch (dias) {
            case 1:
                venta /= 2;
                break;
            case 2:
                venta /= 3;
                break;
            case 3:
                venta /= 2;
                break;
            default:
                break;
        }

        return venta;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Producto perecedero - Codigo: " + codigo + " - Dias para caducar: " + dias + " - Descripcion: " + descripcion + " - Precio: $" + venta(dias, precio);
    }
}
