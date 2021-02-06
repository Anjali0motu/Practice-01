package com.test.practice;

public class PracticeStaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mains start");
		Run.display();
		Run.i=10;	
		Run.display();
		System.out.println("Mains end");
	

	}

}
class Run
{
	static int i;
	
	static void display()
	{
		System.out.println("Display()start");
		System.out.println(i);
		System.out.println("Display()end");
		
	}
	
}

