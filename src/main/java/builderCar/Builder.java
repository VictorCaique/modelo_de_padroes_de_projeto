package builderCar;

public interface Builder {
	void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean GPS);
}
