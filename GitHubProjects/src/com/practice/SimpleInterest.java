package com.practice;

import java.util.Scanner;

public class SimpleInterest {
	protected double p,n,r,amount;
	Scanner in = new Scanner(System.in);
	public void getData()
	{	
		System.out.println("Enter the Principle amount");
		p = in.nextDouble();
		System.out.println("Enter the number of years");
		n = in.nextDouble();
		System.out.println("Enter the rate of interest");
		r = in.nextDouble();
		
	}
	public void calculateAmount()
	{
		amount = (p*n*r)/100;
		System.out.println("You have to pay "+amount+" extra on your " +p+" after the end of "+n+" years ");
	}
}
