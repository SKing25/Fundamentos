import java.util.ArrayList;

public class AppBanco {
    public static void main(String[] args) {
        ArrayList<Cuenta> lista = new ArrayList<>();
    
        Titular titular1 = new Titular(10, "a", "a@gmail.com");
        Cuenta nomina = new Nomina(1010, 2023, titular1, "Universidad");
        lista.add (nomina);
        
        ((IDeposito) nomina).deposito(100000);

        Titular titular2 = new Titular(20, "b", "b@gmail.com");
        Cuenta corriente = new Corriente(1020, 2020, titular2, 0);
        lista.add (corriente);
        
        ((ID))

        Titular titular3 = new Titular(30, "c", "c@gmail.com");
        Cuenta ahorro = new Ahorro(1030, 2003, titular3);
        lista.add (ahorro);
    
        Titular titular4 = new Titular(40, "d", "d@gmail.com");
        Cuenta vivienda = new Vivienda(1040, 2009, titular4, 1000000, "Apartamento");
        lista.add (vivienda);

        for (Cuenta cuenta : lista) {
            System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta() + " - Año de apertura: " + cuenta.getAñoApertura() + 
            " - Titular: " + cuenta.getTitular().getNombreApellido() + " - Tipo de cuenta: " + cuenta.getClass().getName());
        }

        
        
    }
}
