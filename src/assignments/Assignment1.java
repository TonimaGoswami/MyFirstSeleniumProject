package assignments;

import java.util.Scanner;

public class Assignment1 {
	private static String name;
	

	@SuppressWarnings("resource")
	public static  void printName(){
		Scanner user_input = new Scanner( System.in );
		System.out.print("Enter your name : ");
		name = user_input.next();
		
	}
	
	@SuppressWarnings("resource")
	public static void printMonth(){
		Scanner user_input = new Scanner( System.in );
		System.out.print("Insert a number between 1 and 12 : ");
		int month = user_input.nextInt();
		switch (month){
		case 1:
			System.out.println("January");
		break;
		
		case 2:
			System.out.println("February");
		break;
		
		case 3:
			System.out.println("March");
		break;
		
		case 4:
			System.out.println("April");
		break;
		
		case 5:
			System.out.println("May");
		break;
		
		case 6:
			System.out.println("June");
		break;
		
		case 7:
			System.out.println("July");
		break;
		
		case 8:
			System.out.println("August");
		break;
		
		case 9:
			System.out.println("September");
		break;
		
		case 10:
			System.out.println("October");
		break;
		
		case 11:
			System.out.println("November");
		break;
		
		case 12:
			System.out.println("December");
		break;
		default:
			System.out.println("Please, enter valid number.");
		
		}
		
	}
	

	public static void main(String[] args) {
		printName();
		System.out.println("You have entered your name as " + name);
		printMonth();
	}

}
