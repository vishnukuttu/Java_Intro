package inheritance;

public class BabyDog extends DogMulti{
	public void baby()
	{
		
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BabyDog obj= new BabyDog();
      obj.dog();
      obj.show();
      obj.baby();
	}

}
