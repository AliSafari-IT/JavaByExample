package safari.ali.java;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private boolean female;

    public Person() {
    }

    public Person(String lastName, String firstName, int age, boolean female) {
//      checking first name

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!\n");
        }

        if (lastName.trim().isEmpty() || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Person details cannot be empty!");
        }

        this.firstName = firstName.trim();
        this.lastName=lastName.trim();
        this.age = age;
        this.female = female;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Person details cannot be empty!");
        }
        this.lastName = lastName.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Person details cannot be empty!");
        }
        this.firstName = firstName.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!\n");
        }
        this.age = age;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean f) {
        this.female = f;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", Female? " + female +
                '}';
    }
}
