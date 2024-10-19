package Abstractas2;

public class Corriente extends Cuenta{
    private long sobregiro;

    public Corriente(int numeroCuenta, String titular, long sobregiro) {
        super(numeroCuenta, titular);
        this.sobregiro = sobregiro;
    }

    @Override
    public void deposito(long valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Depósito: " + valor + ". Nuevo saldo: " + saldo);

    }

    @Override
    public void retiro(long valor) {
        if (saldo - valor < 0) {
            // Si el saldo no es suficiente, genera sobregiro
            sobregiro += Math.abs(saldo - valor);
            saldo = 0; // El saldo queda en 0
            System.out.println("Retiro realizado. Se ha generado un sobregiro de " + sobregiro + ". Saldo actual: " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Retiro de " + valor + " realizado. Nuevo saldo: " + saldo);
        }
    }
}
