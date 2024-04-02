package com.obsqura.myMavenProject;

public class Sampleproject {
    
	
	int z;
	public void add(int a, int b)
	{
		int z;
		z=a+b;
	System.out.println("Add:"+z);	
	}
	public int multiply(int a , int b,  int c)
	{
		
		z= a*b*c;
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sampleproject obj1= new Sampleproject();
		obj1.add(6,8);
		
		System.out.println("Product is: "+obj1.multiply(1, 2, 3));
		
		
      
	}

}
