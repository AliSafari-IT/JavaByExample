package safari.ali.java;

public class Console {
    public static void main(String[] args) {
        Car a1 = new Car();
        Car a2 = new Car("BMW");
        Car a3 = new Car("Audi", 30000);
        Car a4 = new Car("BMW", 20000.0, 12345);

        a4.totalTraveledDistance(100);

        int km = a4.getDistanceTraveled();

//niet toestaan dat de kilometerstand gemanipuleerd kan worden
        a4.setDistanceTraveled(km - 1000);
        System.out.println("Distance traveled (km): "+a4.getDistanceTraveled());
// car AUDI
        Car b1 = new Car("AUDI", "RED", 35000, 14500, 103000);
        Car b2 = new Car(b1);

        b2.setDistanceTraveled(1000);

//data opvragen
        km = b2.getDistanceTraveled();
        double purchasePrice = b2.getPurchasePrice();

        km = b1.getDistanceTraveled();

    }
}
