package builderCar;

public class Director {
	   private Builder builder;

	    public Director(Builder builder) {
	        this.builder = builder;
	    }

	    public void constructSUV() {
	        builder.setSeats(4);
	        builder.setEngine("V6");
	        builder.setTripComputer(true);
	        builder.setGPS(true);
	    }

	    public void constructSportsCar() {
	        builder.setSeats(2);
	        builder.setEngine("V8");
	        builder.setTripComputer(true);
	        builder.setGPS(false);
	    }
}
