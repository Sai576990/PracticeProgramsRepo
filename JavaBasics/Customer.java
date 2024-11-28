public class Customer{

	//instance variables
	long customerId;
	String name;
	String email;
	long phone;

	static int branchId = 30;

	public Customer(long id, String name, String email, long phone)
	{

	this.customerId = id;
	this.name = name;
	this.email = email;
	this.phone = phone;

	}

	public String saveCustomer()
	{

	System.out.println("SaveCustomer executed");
	return "Customer : " + this.customerId+ " , " + this.name + " , " + this.email + " , " + this.phone ;

	}

	public String deleteCustomer(long customerId)
	{
	System.out.println("deleteCustomer executed");
	return "Customer with Customer ID " + customerId + "is deleted successfully";
	}
	
	public void updateCustomer()
	{
	
	System.out.println("updateCustomer executed");
	}

	public static void staticMethodExample()
	{
	System.out.println(branchId);
	System.out.println("staticMethodExample executed");
	}
}