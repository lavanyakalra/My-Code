package program;
	import java.util.Scanner;
	 
	public class Employee {
		
     String name;
	 int year;
	 String address;
	 
	 public void getInput() {
	 
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter the name :: ");
	  name = in.next();
	  
	  System.out.print("Enter the year of joining :: ");
	  year = in.nextInt();
	  
	  System.out.print("Enter the address :: ");
	  address = in.next();
	 }
	 
	 public void display() {
		 
	  System.out.println("Employee name = " + name);
	  System.out.println("Employee id = " + year);
	  System.out.println("Employee salary = " + address);
	 }
	 
	 public static void main(String[] args) {
	 
	  Employee e[] = new Employee[5];
	  
	  for(int i=0; i<5; i++) {
	   
	   e[i] = new Employee();
	   e[i].getInput();
	  }
	  
	  System.out.println("**** Data Entered as below ****");
	  
	  for(int i=0; i<5; i++) {
	   
	   e[i].display();
	  }
	 }
	}

