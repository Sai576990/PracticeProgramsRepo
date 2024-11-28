class Student
{
	String name;
	int rno;
	
	Student()
	{
	name = "ABC";
	rno = 123;
	}
	
	Student(String str, int n)
	{
		name = str;
		rno=n;
	}
	public static void main(String args[])
	{
	Student s1 = new Student();   /*default constructor*/
	Student s2 = new Student("Sai", 456);	/*Parametarized constructor*/
	System.out.println(s1.name);
	System.out.println(s1.rno);
	System.out.println(s2.name);
	System.out.println(s2.rno);

	}
}