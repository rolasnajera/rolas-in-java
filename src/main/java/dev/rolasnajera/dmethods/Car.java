package dev.rolasnajera.dmethods;

public class Car implements Vehicle{

    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning car!");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.cleanVehicle();
        car.startVehicle();

        // Following line fails, because the method is static, cannot be referenced through the implementation class
        //car.stopVehicle();

        // Must be called through the interface, as follows:
        Vehicle.stopVehicle();

    }

}
