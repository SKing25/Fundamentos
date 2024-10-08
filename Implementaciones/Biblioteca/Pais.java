package Biblioteca;

public class Pais {
	private int codigoPais;
	private String nombrePais;

	public Pais(int codigoPais, String nombrePais) {
		super();
		this.codigoPais = codigoPais;
		this.nombrePais = nombrePais;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	@Override
	public String toString() {
		return "País codigo: " + codigoPais + ", nombre País=" + nombrePais;
	}

}
