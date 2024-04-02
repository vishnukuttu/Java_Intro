package polymorphism;

public class OverridingChild extends OverridingParent{

	public void addition(int a, int b)
	{
		int z=a+b;
		System.out.println("add " +z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		OverridingChild obj= new OverridingChild();
		obj.addition(12, 13);
		//obj.substraction(14, 23);
		
	}

}
