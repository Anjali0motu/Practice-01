package com.test.practice;

import java.util.Scanner;

public class NumberPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);//taking the input from the console
		System.out.println("Enter the number");
		int n = scn.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");

		}

	}

}
