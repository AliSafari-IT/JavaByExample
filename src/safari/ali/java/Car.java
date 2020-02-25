package safari.ali.java;

public class Car {
    private String brand;
    private String color;
    private double price;
    private double newPrice;
    private double purchasePrice;
    private int distanceTraveled;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Car(String brand, double price, int distanceTraveled) {
        this.brand = brand;
        this.price = price;
        this.distanceTraveled = distanceTraveled;
    }


    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void totalTraveledDistance(int distance) {
        this.distanceTraveled += distance;
    }

    //    Overloading constructor shortened
    public Car(String brand, String color, double newPrice, double purchasePrice, int distanceTraveled) {
        this.brand = brand;
        this.distanceTraveled = distanceTraveled;
    }

    public Car(String brand, String color, double newPrice) {
        this(brand, color, newPrice, newPrice, 0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Car(Car a) {
        this.brand = a.brand;
        this.color = a.color;
        this.newPrice = a.newPrice;
        this.purchasePrice = a.purchasePrice;
        this.distanceTraveled = a.distanceTraveled;

    }
}
