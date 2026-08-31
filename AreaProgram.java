import java.util.Scanner;

public class AreaProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;

		do {
			System.out
					.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
			System.out.print("Enter the desired option[1-4]: ");
			option = keyboard.nextInt();
			
			if (option < 1 || option > 4) {
				System.out.println("Error, number chosen out of bounds. ");
			} else 
				switch (option) {
					case 1:
						// Case 1 is the implementation for finding the area of a square.
						System.out.print("Area of a Square \nEnter the square's length: ");
						double length = keyboard.nextDouble();
						double area = length * length;
						System.out.println("The area of the square is: " + area);
						break;
				}
			

		} while (option != 4);
		keyboard.close();
	}
}
