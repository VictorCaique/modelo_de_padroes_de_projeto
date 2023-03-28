package builderCar;

public class CarBuilder implements Builder{
	    private Car car;

	    public CarBuilder() {
	        this.reset();
	    }

	    public void reset() {
	        this.car = new Car();
	    }

	    public void setSeats(int number) {
	        this.car.setSeats(number);
	    }

	    public void setEngine(String engine) {
	        this.car.setEngine(engine);
	    }

	    public void setTripComputer(boolean tripComputer) {
	        this.car.setTripComputer(tripComputer);
	    }

	    public void setGPS(boolean GPS) {
	        this.car.setGPS(GPS);
	    }

	    public Car getResult() {
	        Car result = this.car;
	        this.reset();
	        return result;
	    }
}
