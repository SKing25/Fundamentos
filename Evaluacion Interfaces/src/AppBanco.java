import java.util.ArrayList;

public class AppBanco {
    public static void main(String[] args) {
        ArrayList<Cuenta> lista = new ArrayList<>();
    
        Titular titular1 = new Titular(10, "Santiago Rodriguez", "santi20@gmail.com");
        Cuenta nomina = new Nomina(1010, 2023, titular1, "U Sergio Arboleda");
        lista.add (nomina);
    
        Titular titular2 = new Titular(20, "Nicolas Perez", "nicoperez@gmail.com");
        Cuenta corriente = new Corriente(1020, 2020, titular2, 0);
        lista.add (corriente);
    
        Titular titular3 = new Titular(30, "Camilo Diaz", "camidiaz@gmail.com");
        Cuenta ahorro = new Ahorro(1030, 2003, titular3);
        lista.add (ahorro);
    
        Titular titular4 = new Titular(40, "Jorge Garcia", "d10s@gmail.com");
        Cuenta vivienda = new Vivienda(1040, 2009, titular4, 1000000, "Apartamento");
        lista.add (vivienda);

        for (Cuenta cuenta : lista) {
            System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta() + " - Año de apertura: " + cuenta.getAñoApertura() + 
            " - Titular: " + cuenta.getTitular().getNombreApellido() + " - Tipo de cuenta: " + cuenta.getClass().getName());
        }
    }
}
