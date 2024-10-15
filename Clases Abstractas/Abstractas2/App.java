package Abstractas2;

public class App {
    public static void main(String[] args) {
        Ahorro ahorro = new Ahorro(1010, "Santiago");
        ahorro.deposito(1000);
        System.out.println(ahorro.getSaldo());
        ahorro.retiro(500);
        System.out.println(ahorro.getSaldo());
    }
}
