package builderCar;

public class Client {
	public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        Director director = new Director(carBuilder);
        Director manualDirector = new Director(carManualBuilder);

        director.constructSportsCar();
        Car sportsCar = carBuilder.getResult();
        System.out.println("Sports car built:\n" + sportsCar.toString());

        director.constructSUV();
        Car SUV = carBuilder.getResult();
        System.out.println("SUV built:\n" + SUV.toString());

        manualDirector.constructSportsCar();
	}
}
