package program;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	
	int choice;
		System.out.println("Pick one : Hi \t2 . Hey \t3. hello\t");
		Scanner s =new Scanner (System.in);
		choice= s.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Youn said Hi");
		         break;
		case 2: System.out.println("You said Hey");
		         break;
		case 3: System.out.println("You said Hello"); 
		        break;
		default: System.out.println("Invalid Choice");
		
		}
     }
}