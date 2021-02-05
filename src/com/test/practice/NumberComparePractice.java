package com.test.practice;

import java.util.Scanner;

public class NumberComparePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter 1st number");
      int i = scn.nextInt();
      System.out.println("Enter 2nd number");
      int j = scn.nextInt();
      if(i>j)
      {
          System.out.println("i is bigger");

      }
      
      else
      {
          System.out.println("j is bigger");

      }

      
      
	}

}
