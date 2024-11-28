class ParameterizedConstructor {
    int number;
    String name;

    // Parameterized constructor
    ParameterizedConstructor(int num, String str) {
        number = num;
        name = str;
    }

    void display() {
        System.out.println("Number: " + number + ", Name: " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(42, "Java");
        obj.display();
    }
}
