package Tienda;

public class Detalle {
    private Producto producto;
	private int cantidad;
	private double precio;

	public Detalle(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = producto.getPrecioventa();
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Detalle producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio;
	}
}
