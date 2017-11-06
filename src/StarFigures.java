/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: November 5th, 2017
*/

// 4. Your pseudocode algorithm for how to break down the figure
	/**
	I will lose points here but I genuinely for the life of me suck at writing
	pseudocode. This was also a poorly done program so I will redo it and send it
	to you but to hand something in as it is late. I did some extra because I
	thought using Scanner would be fun. Yolo.

	Pseudocode:
	 Prompt user to choose a figure to display
	 Input Option of 1, 2, 3, or 4
	 Output Three figures:
	 (one)
	  	draw a five asterisks in a horizontal line twice
			draw two asterisks with a space
			draw a centered asterisk
			draw two asterisks with a space between
		(two)
			draw a five asterisks in a horizontal line twice
			draw two asterisks with a space
			draw a centered asterisk
			draw two asterisks with a space between
			draw a five asterisks in a horizontal line twice.
		(three)
			draw a centered asterisk three times on separate lines
			draw a five asterisks in a horizontal line twice.
			draw two asterisks with a space
			draw a centered asterisk
			draw two asterisks with a space between
		(four)
			print out all three figures for all
		Program ends.

	**/

import java.util.Scanner;
public class StarFigures {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

				System.out.println();
				System.out.println("Which figure do you want to see?:");
				System.out.println("Figure 1");
				System.out.println("Figure 2");
				System.out.println("Figure 3");
				System.out.println("All 4");
				int option = scan.nextInt();

				if (option == 1){
					figureOne();
				}
				else if (option == 2){
					figureTwo();
				}
				else if (option == 3) {
					figureThree();
				}
				else
					figureAll();

	}
		public static void figureOne(){
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
			for (int i = 1; i<3; i++)
				System.out.print(" *");
			System.out.println();
			for(int i = 1; i<2; i++)
				System.out.print("  *");
			System.out.println();
			for (int i = 1; i<3; i++)
				System.out.print(" *");
			System.out.println();
		}
		public static void figureTwo(){
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
			for (int i = 1; i<3; i++)
				System.out.print(" *");
			System.out.println();
			for(int i = 1; i<2; i++)
				System.out.print("  *");
			System.out.println();
			for (int i = 1; i<3; i++)
				System.out.print(" *");
			System.out.println();
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
		}
		public static void figureThree(){
			for(int i = 1; i<4; i++)
				System.out.println("  *");
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
			for (int i = 1; i<=5; i++)
				System.out.print("*");
			System.out.println();
			for (int i = 1; i<3; i++)
				System.out.print(" *");
			System.out.println();
			for(int i = 1; i<2; i++)
				System.out.print("  *");
			System.out.println();
			for (int i = 1; i<3; i++)
				System.out.print(" *");
			System.out.println();
		}
		public static void figureAll(){
			figureOne();
			figureTwo();
			figureThree();

		}


}
