package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	



    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
String[] strings = {"hi", "broo", "hii", "yooo", "booo"};
//for(int i = 0; i<strings.length; i++) {
	//System.out.println(strings[i]);
//}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
for(int i = strings.length - 1; i>=0; i--) {
	//System.out.println(strings[i]);
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
//for(int i = 0; i < strings.length; i+=2) {
	//System.out.println(strings[i]);
//}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
Random ran = new Random();
for(int i = 0; i<strings.length; i++) {
	System.out.println((strings[ran.nextInt(strings.length)]));
}
}
}