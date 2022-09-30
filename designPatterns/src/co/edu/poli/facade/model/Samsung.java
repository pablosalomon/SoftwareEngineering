package co.edu.poli.facade.model;

public class Samsung extends MobileShop {

	public Samsung(String model, String price) {
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
