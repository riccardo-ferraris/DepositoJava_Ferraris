public class Person {
    // private
    private String name;
    private int age;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Private method
    private boolean verifyAdult() {
        return this.age >= 18;
    }

    // Public method that uses private method
    public void printStatus() {
        if (verifyAdult()) {
            System.out.println(this.name + " is adult.");
        } else
            System.out.println(this.name + " isn't adult");
    }
}