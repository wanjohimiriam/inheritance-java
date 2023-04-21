class Vehicle {
    void run() {
        System.out.println("Vehicle is running.");
    }
}

class TukTuk extends Vehicle {
    @Override
    void run() {
        System.out.println("TukTuk is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        TukTuk tuktuk = new TukTuk();

        vehicle.run(); 
        tuktuk.run(); 
        // Call the run() method on the Vehicle instance (polymorphism)
        vehicle = tuktuk;
        vehicle.run();
    }
}
