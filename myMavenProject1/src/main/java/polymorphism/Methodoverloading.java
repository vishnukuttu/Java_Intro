package polymorphism;

public class Methodoverloading {

	public void flowers()
	{
		System.out.println("Rose");

	}
	public int numbers(int a, int b)
	{
		int z= a+b;
		return z;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading obj = new Methodoverloading();
		obj.flowers();
		System.out.println(obj.numbers(2,5));
		
	}

}
