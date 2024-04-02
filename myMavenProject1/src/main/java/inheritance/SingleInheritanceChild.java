package inheritance;

public class  SingleInheritanceChild extends SingleInheritanceParent{
	
	
	public void childMethod()
	{
		System.out.println("My Child Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritanceChild obj1= new SingleInheritanceChild();
		obj1.childMethod();
		obj1.intanceMethod();
		
	}

}
