package input;

import java.util.Iterator;
import java.util.Scanner;

public class lsjvnsvbkj {

	static int int1;

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//
//		String nextLine = scanner.nextLine();
//
//		String[] split = nextLine.split(" ");
//
//		String string = split[2];
//		int1 = Integer.parseInt(string);
//		int b = int1 + 1;
//		System.out.println("i have " + b + " books");

		
		Scanner scanner = new Scanner(System.in);
		
		String nextLine = scanner.nextLine();
	//	System.out.println(nextLine);
		
		String[] split = nextLine.split(" ");
		
		System.out.println(split[0]);
		
		String string = split[0];
		
		int int2 = Integer.parseInt(string);
		int b = int2 + 2;
		
		System.out.println("i have  "   +b+   "  books" );
		
		
		
		
		
		

	}

}
