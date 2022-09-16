package co.edu.poli.builder.model;

public class CivilEngineer {

	private HouseBuilder houseBuilder;

	public CivilEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public House getHouse() {
		return this.houseBuilder.getHouse();
	}

	public void constructHouse(String s) {
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildInterior();
		if (!s.equals("igloo")) {
			this.houseBuilder.buildBasement();
			this.houseBuilder.buildRoof();
		}
		
	}
}
