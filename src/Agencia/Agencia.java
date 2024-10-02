package Agencia;

import java.util.ArrayList;

public class Agencia {
    public static ArrayList<Vuelo> listaVuelo = new ArrayList<>();
    
	public static void main(String[] args) {
		Ciudad salida = new Ciudad(1000, "Bogota");
		Ciudad llegada = new Ciudad(2000, "Valledupar");
		Piloto piloto = new Piloto("Pachito", 5000);
		
		Vuelo vuelo1020 = new Vuelo(1020, salida, llegada, 10, 1, piloto, 10);
		
		Pasajero pasajero1 = new Pasajero(1234, "Jorge", 1, "Mujer");
		
		Silla silla1 = new Silla('A', 1, pasajero1);
		
		vuelo1020.adicionarSilla(silla1);
		vuelo1020.listaPasajero();

	}
}
