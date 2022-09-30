package co.edu.poli.adapter.model;

/**
 * 
 */
public class Principal {

	public static void main(String[] args) {

		// One event does this activity
		DetalleCliente d = new DetalleCliente();

		d.setId("123556767");
		d.setNombre("Wilson");
		d.setContacto("31098833221");

		// One event does this activity
		CreditoLibreInversion c = new Cliente();

		c.darInfoCliente(d);

		System.out.println(c.conseguirInfoProducto());

	}

}