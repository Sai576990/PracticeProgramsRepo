public class MethodsDemo{
	public static void main(String args[])
	{
	Customer c1 = new Customer(10,"asdf","asdf@gmail.com",9000000001L);
	String value1 = c1.saveCustomer();
	System.out.println(value1);

	/*Customer c2 = new Customer(20,"XYZ","XYZ@gmail.com",9000000002L);
	String value = c2.saveCustomer();
	System.out.println(value2);
	*/

	String str = c1.deleteCustomer(10);
	System.out.println(str);
	
	c1.updateCustomer();
	
	Customer.staticMethodExample();
	
	}
}

