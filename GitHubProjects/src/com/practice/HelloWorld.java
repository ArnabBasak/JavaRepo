package com.practice;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Scanner in = new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("6. Percentage");
		System.out.println("7. Simple interest");
		System.out.println("8. Average");
		int userinput = in.nextInt();
		switch(userinput)
		{
		case 1:
			
			Addition add = new Addition();
			add.getnum();
			add.calculateAddition();
			break;
		case 2:
			
			Substraction sub = new Substraction();
			sub.getnum();
			sub.calculateSubstraction();
			break;
		case 3:
			Multiplcation mul = new Multiplcation();
			mul.getnum();
			mul.calculateMultiplication();
			break;
		case 4:
			Division div = new Division();
			div.getnum();
			div.calculateDivision();
			break;
		case 5:
			Modulus mod = new Modulus();
			mod.getnum();
			mod.calculateModulus();
			break;
		case 6:
			Percentage per = new Percentage();
			per.getnum();
			per.calculatePercentage();
			break;
		case 7:
			SimpleInterest si = new SimpleInterest();
			si.getData();
			si.calculateAmount();
			break;
		case 8:
			Average avg = new Average();
			avg.getnum();
			avg.calculateAverage();
			break;
		default:
			System.out.println("Invalid Option");
			
		
		

	}

}
}

