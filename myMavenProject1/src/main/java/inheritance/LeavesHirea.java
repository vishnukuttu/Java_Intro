package inheritance;

public class LeavesHirea extends FlowersHirea {

	public void leaves()
	{
		System.out.println("Green");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeavesHirea obj =new LeavesHirea();
       obj.flowers();
       obj.leaves();
       Rose obj1=new Rose();
       obj1.rosecolor();
	}

}
