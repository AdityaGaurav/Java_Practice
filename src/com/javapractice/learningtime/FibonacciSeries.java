package com.javapractice.learningtime;

public class FibonacciSeries {
	
	public long  evenFib(int n)
	{
	    if (n < 1)
	       return n;
	    if (n == 1) 
	       return 2;
	 
	    // calculation of Fn = 4*(Fn-1) + Fn-2
	    return ((4*evenFib(n-1)) + evenFib(n-2));  
	}
	
	public static void main(String[] args) {
		long result=new FibonacciSeries().evenFib(1);
		System.out.println(result);
	}

}
