package conditionals;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		System.out.println ("Please enter a number: ") ; 
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		sc.close();
		
		if (num1 % 2 == 0) {
			 
			System.out.println(" Your number is "+ num1 +" and it's even"); }
		else {
		
			System.out.println("Your number is "+ num1 +" and it's odd.");
		}
		
	}
}
