package Interfaces2;

public class Nomina extends Cuenta implements IRetiro{
    
    public Nomina(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
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
