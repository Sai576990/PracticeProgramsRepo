/* Write a program that uses the this keyword to call one constructor from another */ 

class Example {
    private String message;
    private int number;

    // 1: Default constructor
    public Example() {
        // Calls Constructor 2
        this("Default Message", 0);
        System.out.println("Default constructor called.");
    }

    // 2: Parameterized constructor
    public Example(String message, int number)
	 {
        this.message = message;
        this.number = number;
        System.out.println("Parameterized constructor called with message: " + message + " and number: " + number);
    }

    // Method to display values
    public void display()
	 {
        System.out.println("Message: " + message + ", Number: " + number);
    }

    public static void main(String[] args) 
	{
        // Using default constructor
        Example obj1 = new Example();
        obj1.display();

        // Using parameterized constructor
        Example obj2 = new Example("Hello, World!", 42);
        obj2.display();
    }
}
