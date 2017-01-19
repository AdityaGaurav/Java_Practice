package com.javapractice.datastructure;

public class Practice1 {
	
	public static void main(String[] args){
//		while(9>9){
//			System.out.println("Hi");
//		}
		int i = 0; 
		int j=5;
		int[] numbers= new int[]{26,3,14,9,1,16};
		int pivot= (i+j)/2;
		System.out.println(pivot+" pivot");
		while(i<=j){
			
			while(numbers[i]<pivot){
				i++;
			}
			
			while(numbers[j]>pivot){
				j--;
			}
			
			System.out.println(i+" :i"+j+": j");
			if(i <= j){
				
				i++;
				j--;
			}
		}
		
//		if(low<j){
			
//		}
		
	}

}
