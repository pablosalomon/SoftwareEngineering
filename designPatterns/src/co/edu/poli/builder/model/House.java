package co.edu.poli.builder.model;

public final class House {

	private String type;
	private Ceil ceil;
	private Floor floor;
	private Door door;
	private Window window;
	private Pool pool;
	private Garden garden;

	public House(Builder builder) {
		this.type = builder.type;
		this.ceil = builder.ceil;
		this.floor = builder.floor;
		this.door = builder.door;
		this.window = builder.window;
		this.pool = builder.pool;
		this.garden = builder.garden;
	}
	
	public static class Builder {

		private String type;
		private Ceil ceil;
		private Floor floor;
		private Door door;
		private Window window;
		private Pool pool;
		private Garden garden;

		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public Builder withCeil(Ceil ceil) {
			this.ceil = ceil;
			return this;
		}

		public Builder withFloor(Floor floor) {
			this.floor = floor;
			return this;
		}

		public Builder withDoor(Door door) {
			this.door = door;
			return this;
		}

		public Builder withWindow(Window window) {
			this.window = window;
			return this;
		}

		public Builder withPool(Pool pool) {
			this.pool = pool;
			return this;
		}

		public Builder withGarden(Garden garden) {
			this.garden = garden;
			return this;
		}

		public House build() {
			return new House(this);
		}

	}

	public String getType() {
		return type;
	}

	public House setType(String type) {
		this.type = type;
		return this;
	}

	public Ceil getCeil() {
		return ceil;
	}

	public House setCeil(Ceil ceil) {
		this.ceil = ceil;
		return this;
	}

	public Floor getFloor() {
		return floor;
	}

	public House setFloor(Floor floor) {
		this.floor = floor;
		return this;
	}

	public Door getDoor() {
		return door;
	}

	public House setDoor(Door door) {
		this.door = door;
		return this;
	}

	public Window getWindow() {
		return window;
	}

	public House setWindow(Window window) {
		this.window = window;
		return this;
	}

	public Pool getPool() {
		return pool;
	}

	public House setPool(Pool pool) {
		this.pool = pool;
		return this;
	}

	public Garden getGarden() {
		return garden;
	}

	public House setGarden(Garden garden) {
		this.garden = garden;
		return this;
	}

	@Override
	public String toString() {
		return "House [type=" + type + ", ceil=" + ceil + ", floor=" + floor + ", door=" + door + ", window=" + window
				+ ", pool=" + pool + ", garden=" + garden + "]";
	}

}
