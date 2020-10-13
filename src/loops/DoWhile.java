package loops;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		System.out.println ("Enter a number ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close ();
		
		System.out.println( "Show all the numbers from 0 to " +num + "\n"); 
		
		do {
			System.out.println(num);
			num -- ; 
		}
		while (num >= 0); 
	}
}
