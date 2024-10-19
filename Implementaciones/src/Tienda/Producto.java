package Tienda;

public class Producto {
    private TipoProducto tipoproducto;
	private int codigo;
	private String descripcion;
	private double precioventa;
	private int cantidad;
	private Proveedor proveedor;

	public Producto(TipoProducto tipoproducto, int codigo, String descripcion, double precioventa, int cantidad,
			Proveedor proveedor) {
		this.tipoproducto = tipoproducto;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioventa = precioventa;
		this.cantidad = cantidad;
		this.proveedor = proveedor;
	}

	public TipoProducto getTipoproducto() {
		return tipoproducto;
	}
	public void setTipoproducto(TipoProducto tipoproducto) {
		this.tipoproducto = tipoproducto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Producto [tipoproducto=" + tipoproducto + ", codigo=" + codigo + ", descripcion=" + descripcion
				+ ", precioventa=" + precioventa + ", cantidad=" + cantidad + ", proveedor=" + proveedor + "]";
	}
	
}
