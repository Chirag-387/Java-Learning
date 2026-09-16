package OOPs;

public class CarManagment {
    public static void main(String[] args) {
        
        Car c1 = new Car("Toyota", "Camry", 2022, 2800000);
        c1.displayDetails();
        c1.start();
        c1.stop();

    }
}

class Car {
    String brand;
    String model;
    int year;
    double price;

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
    
    void start() {
        System.out.println("The car got started.");
    }

    void stop() {
        System.out.println("The car has been stopped.");
    }

}