package jobhunter;

import java.util.Scanner;

public class BiggestNo {
	public static void main(String[] args) {
		int x, y, z;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the x value: ");
		x = in.nextInt();

		System.out.println("Enter the y value: ");
		y = in.nextInt();

		System.out.println("Enter the z  value: ");
		z = in.nextInt();

		if (x > y && x > z)
			System.out.println("x value is largest.");
		else if (y > x && y > z)
			System.out.println("y value is largest.");
		else if (z > x && z > y)
			System.out.println("z value is largest.");
		else
			System.out.println("Entered numbers are not distinct.");

	}
}
