package Ejercicio2;

public class NoPerecedero extends Producto {
    private int tipo;

    public NoPerecedero(int codigo, String descripcion, double precio, int tipo) {
        super(codigo, descripcion, precio);
        this.tipo = tipo;
    }

    private static int comprobar(int tipo){
        if (tipo != 1 && tipo != 2 && tipo != 3) {
            return 1;
        }
        else return tipo;
    }

    public static double venta(int tipo, double precio){
        switch (tipo) {
            case 1:
                precio += precio * 0.03;
                break;
            case 2:
                precio += precio * 0.02;
                break;
            case 3:
                precio += precio * 0.01;
                break;
            default:
                break;
        }

        return precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto no perecedero - Codigo: " + codigo + " - Tipo: " + comprobar(tipo) + " - Descripcion: " + descripcion + " - Precio: " + venta(tipo, precio);
    }
}
