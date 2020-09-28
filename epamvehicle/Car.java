package epamvehicle;

public class Car extends Vehicle {

    Car(){
        System.out.println("Car");
    }

    @Override
    public void start(){
        System.out.println("Car start");
    }
}
