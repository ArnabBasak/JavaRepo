package com.practice;

public class Percentage extends Addition {
	public void calculatePercentage() {
		ans = ((num1/num2) * 100);
		System.out.println("Percentage of "+num1+" and "+num2+" is "+ans);
}
}

