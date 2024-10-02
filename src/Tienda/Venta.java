package Tienda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private int numero;
    private LocalDate fecha;
    private Cliente cliente;
    private int valorTotal;
    private int iva;
    private ArrayList<Detalle> listaDetalle;

    public Venta(int numero, Cliente cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.listaDetalle = new ArrayList<>();
        fecha = LocalDate.now();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public ArrayList<Detalle> getListaDetalle() {
        return listaDetalle;
    }

    public void setListaDetalle(ArrayList<Detalle> listaDetalle) {
        this.listaDetalle = listaDetalle;
    }

    public void adicionardetalle(Detalle detalle) {
		listaDetalle.add(detalle);
	}

    public void Mostrardetalles() {
	    System.out.println();
    }

}
