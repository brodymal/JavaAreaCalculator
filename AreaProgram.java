import java.util.Scanner;

public class AreaProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;
		double area;

		do {
			System.out
					.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
			System.out.print("Enter the desired option[1-4]: ");
			option = keyboard.nextInt();
			
			if (option < 1 || option > 4) {
			  System.out.println("Error, number chosen out of bounds. ");
			} else {
			  switch (option) {
			    case 1:
				  // Case 1 finds area of a square using a = l^2. 
				  System.out.print("Area of a Square \nEnter the square's length: ");
				  double length = keyboard.nextDouble();
				  area = length * length;
				  System.out.println("The area of the square is: " + area);
				  break;
				case 2:
				  // Case 2 finds area of circle using a = r^2 * pi.
				  System.out.print("Area of a Circle \nEnter the circles radius: ");
				  double radius = keyboard.nextDouble();
				  area = Math.pow(radius, 2) * Math.PI;
				  System.out.println("The area of the circle is " + area);
				  break;
				case 3:
				  // Case 3 finds area of a triangle using a = bh/2.
				  System.out.print("Area of a Triangle \nEnter the triangles base: ");
				  double base = keyboard.nextDouble();
				  System.out.print("Area of a Triangle \nEnter the triangles height: ");
				  double height = keyboard.nextDouble();
				  area = base * height / 2.0;
				  System.out.println("The area of the triangle is " + area);
				  break;
			  }

			}
			

		} while (option != 4);
		keyboard.close();
	}
}
