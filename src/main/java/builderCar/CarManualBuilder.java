package builderCar;

public class CarManualBuilder implements Builder{
	private CarManual carManual;

    public CarManualBuilder() {
        this.reset();
    }

    public void reset() {
        this.carManual = new CarManual();
    }

    public void setSeats(int number) {
        this.carManual.setSeats(number);
    }

    public void setEngine(String engine) {
        this.carManual.setEngine(engine);
    }

    public void setTripComputer(boolean tripComputer) {
        this.carManual.setTripComputer(tripComputer);
    }

    public void setGPS(boolean GPS) {
        this.carManual.setGPS(GPS);
    }

    public CarManual getResult() {
        CarManual result = this.carManual;
        this.reset();
        return result;
    }
}
