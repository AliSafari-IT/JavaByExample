package safari.ali.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardTest {
    @Test
    void testklavier() {
        Keyboard klavier;
        klavier = new Keyboard("Logitech", 12.5);
        klavier.setBrand("Ergo");
        klavier.setWireless(false);
        klavier.setSerialNumber(5203);
        klavier.setPrice(90.94);
        System.out.println("The brand of my keyboard is: " + 	klavier.getBrand());
        System.out.println("The brand of my keyboard is: " + 	klavier.toString());
        System.out.println(klavier);
    }
}