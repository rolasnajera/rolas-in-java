package dev.rolasnajera.dmethods;

public interface Vehicle {

    void cleanVehicle();

    default void startVehicle() {
        System.out.println("Vehicle started!");
    }

    static void stopVehicle() {
        System.out.println("Vehicle stoped!");
    }

}
