

class Sai {
    private String name;
    private int age;

    // Parameterized constructor
    public Sai(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Sai(Sai other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display the Sai's details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an original object
        Sai original = new Sai("Goutham", 25);
        System.out.println("Original object:");
        original.display();

        // Create a new object using the copy constructor
        Sai copy = new Sai(original);
        System.out.println("Copied object:");
        copy.display();
    }
}
