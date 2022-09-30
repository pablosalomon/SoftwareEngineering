package co.edu.poli.facade.model;

public class Iphone extends MobileShop {

	public Iphone(String model, String price) {
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