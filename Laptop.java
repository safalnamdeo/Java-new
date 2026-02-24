public class Laptop {

    String brand;
    int ram;
    double price;

    // Constructor
    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    // Method to display details
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: $" + price);
    }

    // Main method
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16, 75000);
        l1.display();
    }
}