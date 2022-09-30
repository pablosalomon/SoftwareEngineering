package co.edu.poli.facade.model;

public class Blackberry extends MobileShop {
	
	public Blackberry(String model, String price) {
		super(model, price);
	}

	@Override
	public String modelNo() {
		return getModel();
	}

	@Override
	public String price() {
		return getPrice();
	}
}