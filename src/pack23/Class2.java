package pack23;

public class Class2 extends Class1{

	public void m2()
	{
		System.out.println("Method m1 from Class2");
		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class2 obj = new Class2();
		obj.m2();
		
	}

}
