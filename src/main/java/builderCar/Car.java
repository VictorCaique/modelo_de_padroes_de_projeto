package builderCar;

public class Car {
	    private int seats;
	    private String engine;
	    private boolean tripComputer;
	    private boolean GPS;

	    @Override
		public String toString() {
			return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", GPS=" + GPS
					+ "]";
		}

		public Car() {}

		public int getSeats() {
			return seats;
		}

		public void setSeats(int seats) {
			this.seats = seats;
		}

		public String getEngine() {
			return engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public boolean isTripComputer() {
			return tripComputer;
		}

		public void setTripComputer(boolean tripComputer) {
			this.tripComputer = tripComputer;
		}

		public boolean isGPS() {
			return GPS;
		}

		public void setGPS(boolean gPS) {
			GPS = gPS;
		}

}
