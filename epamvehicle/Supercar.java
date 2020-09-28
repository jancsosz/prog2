package epamvehicle;

public class Supercar extends Vehicle {

    public Supercar(){
        System.out.println("Supercar");
    }

    @Override
    public void start(){
        System.out.println("supercar start");
    }
}
