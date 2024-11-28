class Manager 
{
  	  // No-argument constructor
  	  Manager() 
		{
     	   System.out.println("No-argument const of Manager class");
   		}

    	// Parameterized constructor
        Manager(int i) 
	{
        this(); // Calls the no-argument constructor of the same class
        System.out.println("Calling parameterized constructor of Manager");
    }
}

	public class TL extends Manager
 
	{

    // No-argument constructor
   	 TL() 
	{
        super(4); // Calls the parameterized constructor of the parent class
        System.out.println("Calling constructor of TL");
    }

    public static void main(String[] args)
	 {
        TL p = new TL(); // Create an instance of TL, triggering constructor chaining
   	 }
}

	

	