package Interfaces2;

public class Vivienda extends Cuenta implements IDeposito{

    public Vivienda(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void deposito(long valor) {
        this.saldo += valor;
        
    }
}
