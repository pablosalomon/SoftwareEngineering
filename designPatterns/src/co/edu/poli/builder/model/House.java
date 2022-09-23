package co.edu.poli.builder.model;

public final class House {

	private final String type;
	private final Ceil ceil;
	private final Floor floor;
	private final Door door;
	private final Window window;

	public House(Builder builder) {
		this.type = builder.type;
		this.ceil = builder.ceil;
		this.floor = builder.floor;
		this.door = builder.door;
		this.window = builder.window;
	}

	public static class Builder {

		private String type;
		private Ceil ceil;
		private Floor floor;
		private Door door;
		private Window window;

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

		public House build() {
			return new House(this);
		}

	}

	@Override
	public String toString() {
		return "House [type=" + type + ", ceil=" + ceil + ", floor=" + floor + ", door=" + door + ", window=" + window
				+ "]";
	}

}
