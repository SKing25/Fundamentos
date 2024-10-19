package Abstractas2;

public class App {
    public static void main(String[] args) {
        
        Ahorro ahorro = new Ahorro(1010, "Santiago");
        ahorro.deposito(1000);
        System.out.println(ahorro.getSaldo());
        ahorro.retiro(500);
        System.out.println(ahorro.getSaldo());
        
        Corriente corriente = new Corriente(2020, "Santiago", 3);
        corriente.deposito(100000);
        System.out.println(corriente.getSaldo());
        corriente.retiro(20000000);
        System.out.println(corriente.getSaldo());
    }
}
