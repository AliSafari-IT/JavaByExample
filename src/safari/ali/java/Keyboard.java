package safari.ali.java;

public class Keyboard {
    //    fields or attributes
    private int serialNumber;
    private String brand;
    private boolean wireless;
    private double price;

    public Keyboard(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //    extra methods
    public double getPriceDollar(double recalculate) {
        return price * recalculate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "The keyboard with serial number\n" + serialNumber +", costs=" + price +" euros!";
    }
}
