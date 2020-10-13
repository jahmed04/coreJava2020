package conditionals;

import java.util.Scanner;

public class TruthTable {
	public static void main(String[] args) {
		
		System.out.println ("Please enter two number: ") ; 
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		if (( num1 >= 0 && num1 <= 10) && (num2 >= 0 && num2 <= 10)) {
			 
			System.out.println(" Your numbers are below 0-10 range." ); 
			}
		
		else {
		
			System.out.println("Your numbers are above 0-10 range");
		}
		
	}
}
