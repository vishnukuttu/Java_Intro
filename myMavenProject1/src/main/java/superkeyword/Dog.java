package superkeyword;

public class Dog extends Animal{
int a=15;

public void show()
{
	System.out.println(a);
	System.out.println(super.a);//immediate parent class refer
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog obj= new Dog();
		obj.show();
	}

}
