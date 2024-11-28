class DefaultConstructor {
    int number;
    String name;

    // Default constructor
    DefaultConstructor() {
        number = 0;
        name = "Sai";
    }

    void display() {
        System.out.println("Number: " + number + ", Name: " + name);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();
    }
}
