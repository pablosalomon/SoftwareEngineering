package co.edu.poli.builder.model;

public class Cliente {

	public static void main(String[] args) {

		House h1 = new House.Builder()
					.withType("apto")
					.withCeil(null)
					.withWindow(null)
					.build();
		
		System.out.println(h1);
		
		House h2 = new House.Builder()
				.withType("apto")
				.withFloor(null)
				.withWindow(null)
				.build();
		
		System.out.println(h2);

	}

}
