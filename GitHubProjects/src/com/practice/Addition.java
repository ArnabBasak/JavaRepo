package com.practice;
import java.util.Scanner;
public class Addition {
	protected int num1,num2,ans;
	public void getnum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = in.nextInt();
		System.out.println("Enter Second number");
		num2 = in.nextInt();
		
	}

	public void calculateAddition() {
		ans = num1 + num2;
		System.out.println("Addition of "+num1+" and "+num2+" is "+ans);
		
		
	}
	

}
