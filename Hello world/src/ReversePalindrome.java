import java.util.Scanner;

public class ReversePalindrome {

				public static void main(String[] args) {
					Scanner in = new Scanner(System.in);
					System.out.print("Enter an integer: ");
					int number = in.nextInt();
					System.out.println("The sum of all digits is : " + sumDigits(number));
					int number1 = in.nextInt();
					System.out.println("The reversed number is : " + reverse(number1));
					int number2 = in.nextInt();
					System.out.println("It is a palindrome : " + isPalindrome(number));
					in.close();

				}

				public static int sumDigits(int number) {
					int sum = 0;
					if (number <= 0)
						System.out.println("Integer you've entered is nonpositive.");
					else {
						while (number != 0) {
							sum += number % 10;
							number /= 10;
						}
					}
					return sum;
				}

				public static boolean isPalindrome(int number) {
					int rev = 0, rmd;
					while (number > 0) {
						rmd = number % 10;
						rev = rev * 10 + rmd;
						number = number / 10;
					}

					if (rev == number)
						return true;
					else
						return false;
				}

				public static int reverse(int number) {
					int reverse = 0;
					while (number != 0) {
						reverse = reverse * 10;
						reverse = reverse + number % 10;
						number = number / 10;
					}

					return reverse;
				}

			

	}


