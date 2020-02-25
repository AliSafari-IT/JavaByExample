package safari.ali.java;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {
    @Test
    void case1() {
        Person p = new Person();
        // setting first name
        try {
            p.setFirstName("  Kristien"); //Kristien
        } catch (IllegalArgumentException e) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            p.setFirstName(JOptionPane.showInputDialog(f, "Enter a valid first name"));
        }
        // setting last name
        try {
            p.setLastName("Van Assche  ");    //Van Assche
        } catch (IllegalArgumentException e) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            p.setLastName(JOptionPane.showInputDialog(f, "Enter a valid last name"));
        }
        // setting age
        try {
            p.setAge(+10);
        } catch (IllegalArgumentException e) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            String inp="enterAge";
            while (!isNumber(inp)){
                inp = JOptionPane.showInputDialog(f, "Enter a valid age");
            }
            p.setAge((int) Double.parseDouble(inp));
        }
        p.setFemale(true);
        System.out.println(p.toString());
    }

    private boolean isNumber(String enter_age) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        return pattern.matcher(enter_age).matches();
    }

    @Test
    void case2() {
        Person p2 = new Person("2", "Firstname", 20, false);
        System.out.println(p2.toString());
    }


    @Test
    void exceptionTesting() {
        Person p1 = new Person("Van Assche", "Kristien", -10, false);
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("a message");
                });
        assertEquals("a message", exception.getMessage());
    }
}