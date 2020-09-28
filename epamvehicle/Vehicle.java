package epamvehicle;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle");
    }

    public void start() {
        System.out.println("Vehicle start");
    }

    public static void main(String[] args){
        Vehicle firstVehicle = new Supercar();
        firstVehicle.start();
        System.out.println(firstVehicle instanceof Car);
        Car secondVehicle = (Car) firstVehicle;
        secondVehicle.start();
        System.out.println(secondVehicle instanceof Supercar);
        Supercar thirdVehicle = new Vehicle();
        thirdVehicle.start();
    }
}
