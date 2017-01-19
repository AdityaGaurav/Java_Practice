package com.javapractice.geeksforgeeks;

public class PuzzleArray2 {

	public static int[] shiftNegativeAtEnd(int[] inputs) {

		int length = inputs.length - 1;
		
		int[] newArray = new int[length + 1];
		
		int countstart=0;
		int countend=length;
		 
		
		for (int i = 0; i <= length; i++) {

			if (inputs[i] < 0) {
				
				newArray[countend] = inputs[i];
				countend--;
				
			} else {
				
				newArray[countstart] = inputs[i];
				countstart++;
				
			}
			
			
		}
		int temp = countend+1;
		int temp1 = length;
		
		for(int i = countend+1; i<=length;i++ ){
			
			int tmp = newArray[temp1];
			newArray[temp1] = newArray[temp];
			newArray[temp]=tmp;
			temp++;
			temp--;
			
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, -1, 3, 2, -7, -5, 11};
		int[] output = shiftNegativeAtEnd(numbers);
		for (int ele : output) {
			System.out.printf("%d ", ele);
		}
	}
}
