package Agencia;

import java.util.ArrayList;

public class Vuelo {
    private int numero;
	private Ciudad salida;
	private Ciudad llegada;
	private int horaSalida;
	private int duracion;
	private Piloto piloto;
	private ArrayList<Silla> listaPasajero;
	private int nSillas;
	
	public Vuelo(int numero, Ciudad salida, Ciudad llegada, int horaSalida, int duracion, Piloto piloto, int nSillas) {
		super();
		this.numero = numero;
		this.salida = salida;
		this.llegada = llegada;
		this.horaSalida = horaSalida;
		this.duracion = duracion;
		this.piloto = piloto;
		this.nSillas = nSillas;
		this.listaPasajero = new ArrayList<Silla>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Ciudad getSalida() {
		return salida;
	}

	public void setSalida(Ciudad salida) {
		this.salida = salida;
	}

	public Ciudad getLlegada() {
		return llegada;
	}

	public void setLlegada(Ciudad llegada) {
		this.llegada = llegada;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public ArrayList<Silla> getListaPasajero() {
		return listaPasajero;
	}

	public void setListaPasajero(ArrayList<Silla> listaPasajero) {
		this.listaPasajero = listaPasajero;
	}

	public int getnSillas() {
		return nSillas;
	}

	public void setnSillas(int nSillas) {
		this.nSillas = nSillas;
	}

	@Override
	public String toString() {
		return "Vuelo [numero=" + numero + ", salida=" + salida + ", llegada=" + llegada + ", horaSalida=" + horaSalida
				+ ", duracion=" + duracion + ", piloto=" + piloto + ", nSillas=" + nSillas + "]";
	}
	
	public void adicionarSilla(Silla silla) {
		if (listaPasajero.size() < nSillas) 
			listaPasajero.add(silla);
		else
			System.out.println("no hay cupo");	
	}
	
	public void listaPasajero() {
		System.out.println("Vuelo # " + this.numero);
		System.out.println("Ciudad salida " + this.salida + " " + "Ciudad llegada " + this.llegada);
		System.out.println("Hora de salida: " + this.horaSalida);
		
		for (Silla silla : listaPasajero) {
			System.out.println(silla);
		}
	}
}
