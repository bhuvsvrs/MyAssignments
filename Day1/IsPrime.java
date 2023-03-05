package week1.Day1;

public class IsPrime {
	public static void main(String[] args) {
		int Input = 5;
		System.out.println("Check whether given number is prime or not");
			for (int i = 2; i < Input-1; i++) {
			if (Input%i != 0) {
			System.out.println("The given number " +Input+ " is a prime number");
			break;
				}
			else
			{
				System.out.println("The given number " +Input+ " is not a prime number");
				break;
			}
		}

	}

}
