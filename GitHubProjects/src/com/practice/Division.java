package com.practice;

public class Division extends Addition{
	public void calculateDivision() {
		if (num2 == 0)
		{
			System.out.println("Sorry denominator is 0 cannot proceed");
		}
		else
		{
			ans = num1 / num2;
			System.out.println("Divions of "+num1+" and "+num2+" is "+ans);
		}
		

}
}