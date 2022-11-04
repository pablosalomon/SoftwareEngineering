package co.edu.poli.decorator.model;

public abstract class AddOn extends Bouquet{
	
	protected Bouquet b;
	
	public AddOn (String description, Bouquet b) {
		super(description);
		this.b = b;
	}

	public abstract double cost();
	
}
