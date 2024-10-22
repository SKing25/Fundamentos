public class Vivienda extends Cuenta implements IDeposito{
    private double precio;
    private String tipo;

    public Vivienda(int numeroCuenta, int añoApertura, Titular titular, double precio, String tipo) {
        super(numeroCuenta, añoApertura, titular);
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public void deposito(long valor) {
        this.saldo += valor; 
        if(this.saldo >= precio){
            System.out.println("Pago de vivienda realizado");
        }
        else{
            System.out.println("Deposito realizado");
            System.out.println("Falta $" + (precio - saldo) + " para completar el pago de vivienda");
        }       
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " - Precio de vivienda: " + precio + " - Tipo: " + tipo + " - Tipo de cuenta: Vivienda";
    }
}
