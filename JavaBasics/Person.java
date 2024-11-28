class Person {
    String name;

    // Constructor in Parent Class
    Person(String name)
	 {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

class Student extends Person 
	{
    int id;

    // Constructor in Child Class
    Student(int id, String name)
	 {
        super(name); // Calling the constructor of the parent class
        this.id = id;
        System.out.println("Student constructor called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) 
	{
        Student student = new Student(101, "Sai");
        student.display();
    }
}
