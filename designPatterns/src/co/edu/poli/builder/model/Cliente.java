package co.edu.poli.builder.model;

public class Cliente {

	public static void main(String[] args) {

		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);

		engineer.constructHouse("igloo");

		House house = engineer.getHouse();
		
		house.setBasement("ICE");
		System.out.println("Builder constructed: " + house);
			
	}

}
