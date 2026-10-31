package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] names = new String[5];
		names[0] = "hi";
		names[1] = "hello";
		names[2] = "greetings";
		names[3] = "Hi there";
		names[4] = "Wassup";
		// 2. print the third element in the array
		System.out.println(names[2]);

		// 3. set the third element to a different value
		names[2] = "whats good";
		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < names.length; i++) {
			names[i] = "morning";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		 for(int i = 0; i < names.length; i++){
	            String s = names[i];
	            System.out.println("String at element " + i + " " + s);
	        }
		
		// 7. make an array of 50 integers
		int[] numbers = new int[50];
		// 8. use a for loop to make every value of the integer array a random
		// number
		Random ran = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(numbers.length);
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
int smallest = numbers[0];
for(int i = 0; i < numbers.length; i++) {
	if(numbers[i] < smallest) {
		smallest = numbers[i];
	}
	
}

System.out.println("The smallest number is " + smallest);
		// 10 print the entire array to see if step 8 was correct
				for(Integer i : numbers) {
					System.out.println(i);
				}
		// 11. print the largest number in the array.
int largest = -1;
for(int i = 0; i<numbers.length; i++) {
	if(numbers[i] > largest) {
		largest = numbers[i];
	}
}
	System.out.println("The largest number is " + largest);	
	// 12. print only the last element in the array
System.out.println(numbers[49]);
}
}
