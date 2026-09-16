package OOPs;

public class ShoppingCart {
    public static void main(String[] args) {
        
        Product p1 = new Product("Milk", 45.37, 13);
        p1.displayProduct();
        System.out.println("Total: " + p1.total());

    }
}

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    double total() {
        return price * quantity;
    }
}