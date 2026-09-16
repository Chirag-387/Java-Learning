package OOPs;

public class MobilePhone {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", "Galaxy", 499.99);
        mobile.displayDetails();
        mobile.call("1234567890");
        mobile.message("Hello, let's meet this afternoon at coffee house");
    }
}

class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    void call(String number) {
        System.out.println("Call to " + number + " is being made.");
    }

    void message(String message) {
        System.out.println("The message -> " + message + " has been sent.");
    }
}