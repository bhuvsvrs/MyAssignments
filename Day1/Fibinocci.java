package week1.Day1;

public class Fibinocci {

	public static void main(String[] args) {
		//Print Fibbinocci series from 0 to 56
		System.out.println("Print the Fibbinocci series from 0 to 56");
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i <=8; i++) {
			sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
			
		}

	}

}
