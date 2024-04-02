package polymorphism;

public class Methodoverridingchild extends Methodoverridingparent
{

	public void show()
	{
		System.out.println("Its child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Methodoverridingchild obj =new Methodoverridingchild();
		obj.show();
		Methodoverridingparent obj1= new Methodoverridingparent();
		obj1.show();
		
	}

}

