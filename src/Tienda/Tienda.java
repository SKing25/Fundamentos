package Tienda;

import java.util.ArrayList;

public class Tienda {

    public static ArrayList<Producto> ProductosComprados = new ArrayList<>();

	public static void main(String[] args) {
		ArrayList<Producto> listaProducto = new ArrayList<>();
		ArrayList<Venta> listaVentas = new ArrayList<>();

		TipoProducto tipop1 = new TipoProducto(1792, "zapato", 0.1);
		TipoProducto tipop2 = new TipoProducto(1321, "Empacados", 0.15);

		Proveedor proveedor = new Proveedor(100, "Santiago");

		Producto producto1 = new Producto(tipop1, 1010, "cocacola", 2000, 1, proveedor);
		Producto producto2 = new Producto(tipop2, 1020, "Pepsi", 2500, 2, proveedor);

		listaProducto.add(producto1);
		listaProducto.add(producto2);

		for (Producto producto : listaProducto) {
			System.out.println(producto);
		}

		Cliente cliente1 = new Cliente (1893, "Zapallo");

		Venta venta1 = new Venta(1000, cliente1);

		Detalle detalle1 = new Detalle(producto1, 3);
	}
}
