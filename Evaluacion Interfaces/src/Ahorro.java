public class Ahorro extends Cuenta implements IRetiro, IDeposito{
    private final double INTERES = 0.03;

    public Ahorro(int numeroCuenta, int añoApertura, Titular titular) {
        super(numeroCuenta, añoApertura, titular);
    }

    @Override
    public void retiro(long valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void deposito(long valor) {
        this.saldo = this.saldo + valor + (valor * INTERES);
        
    }

    public double getINTERES() {
        return INTERES;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo de cuenta: Ahorro";
    }
}
