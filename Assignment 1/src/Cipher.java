/* Programming Fundamentals
 * NAME: Michael Carrasco
 * PROGRAMMING ASSIGNMENT 1
 * Summer 2020
 */

import java.util.Scanner; 
import java.util.Random;
public class Cipher {

	public static void main(String[] args) {
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Michael Carrasco");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println("\nWelcome to the Cipher program.");
		
		Random rand= new Random();
		Scanner input = new Scanner(System.in);
		
		int sum = 0; //starts value of sum at 0 for arithmetic purposes
		int []integer= new int[5]; //creates an array that can hold 5 values
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		
		for (int i=0; i<5; i++) {
			System.out.print("1st number: ");
			integer[0] = input.nextInt(); //User input for integers
			i++;
			System.out.print("2nd number: ");
			integer[1] = input.nextInt(); //User input for integers
			i++;
			System.out.print("3rd number: ");
			integer[2] = input.nextInt(); //User input for integers
			i++;
			System.out.print("4th number: ");
			integer[3] = input.nextInt(); //User input for integers
			i++;
			System.out.print("5th number: ");
			integer[4] = input.nextInt(); //User input for integers
			sum = sum + integer[0] + integer[1] + integer[2] + integer[3] + integer[4]; //sums integers into plainText(unencoded number)
			if (integer[i] < 0 || integer[i] > 19 ) {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
		}
		System.out.println("\nTotal = "+sum);
		
		int key=rand.nextInt(10); //Randomizes value from 0 to 9(inclusive)
		System.out.println("Your random key is " + key);
		
		int firstDigit = sum/10; //calculates first digit of number
		int secondDigit = sum%10; //calculates second digit of number
		int encoded = (((firstDigit + key))%10)*10 + (((secondDigit + key))%10); //encodes the two digits together with the key
		System.out.println("Your encoded number is " + encoded); 
		input.close();
		
		
	}

}