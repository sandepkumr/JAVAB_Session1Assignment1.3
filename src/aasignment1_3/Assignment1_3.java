/**
 * 
 */
package aasignment1_3;
import java.util.Scanner; // importing 
/**
 * This class will compare truth table for 	BitwiseAND and LogicalAND
 *
 */
public class Assignment1_3 {

	public static void main(String[] args) { //Main method starts
		
		byte a,b; // Declaring two byte variables a,b for BitwiseAND
		Scanner sc = new Scanner(System.in); // Creating Scanner object to take user input 
		
		System.out.println("Enter the first number 0 or 1 :");
		a=sc.nextByte(); // Assigning input to a
		System.out.println("Enter the second number 0 or 1 :");
		b=sc.nextByte();// Assigning input to b
		
		boolean c,d; // Declaring two boolean variables c,d for LogicalAND from user input
		c=(a!=0); // converting to boolean for first input(a) and assigning variable c
		d=(b!=0); // converting to boolean for second input(b) and assigning variable b
		
		boolean bitwiseAnd = ((a&b)!=0); //Assigning boolean value result after BitwiseAND between a and b
		boolean logicalAnd = (c&&d); //Assigning boolean value result after LogicalAND between c and d
		
		//Printing the truth table for BitwiseAND and LogicalAND
		System.out.println("+---+---+------------+------------+");
		System.out.println("| a | b | BitwiseAND | LogicalAND |");
		System.out.println("+---+---+------------+------------+");
		System.out.println("| "+a+" | "+b+" |   "+bitwiseAnd+"    |   "+logicalAnd+"    |");
		System.out.println("+---+---+------------+------------+");

		sc.close();

	}

}//class closed
