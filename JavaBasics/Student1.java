
/* Create a program that shows constructor overloading in Java */

class Student1 {
    int id;
    String name;
    int age;

    // Default constructor
    Student1()
	 {

       	 id = 0;
       	 name = " ";
       	 age = 0;

        System.out.println("Default constructor called");

    	 }

    // Constructor with one parameter
    Student1(int studentId)
	 {
	
        id = studentId;
        name = " ";
        age = 0;
        System.out.println("Constructor with one parameter called");

  	  }

    // Constructor with two parameters
    Student1(int studentId, String studentName)
	 {

        id = studentId;
        name = studentName;
        age = 0;
        System.out.println("Constructor with two parameters called");

         }

    // Constructor with three parameters
    Student1(int studentId, String studentName, int studentAge) {
        id = studentId;
        name = studentName;
        age = studentAge;
        System.out.println("Constructor with three parameters called");
    }

    void display() 
	{
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args)
	 {
	
        // Using default constructor
        Student1 student2 = new Student1();
        student2.display();

        // Using constructor with one parameter
        Student1 student3 = new Student1(101);
        student3.display();

        // Using constructor with two parameters
        Student1 student4 = new Student1(102, "Sai");
        student4.display();

        // Using constructor with three parameters
        Student1 student5 = new Student1(103, "Gooutham", 30);
        student5.display();
    }
}
