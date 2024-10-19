package Abstractas2;

public class Ahorro extends Cuenta{
    private long interes;

    public Ahorro(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void deposito(long valor) {
        this.saldo = valor + valor * interes;
    }

    @Override
    public void retiro(long valor) {
        if(valor > saldo){
            System.out.println("Dinero insuficiente");
        } 
        else{
            this.saldo = this.saldo - valor;
        }       
    }
}
