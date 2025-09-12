package Patterns_Using_OneLoop;

import java.util.Scanner;

public class SqaureBox {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num * num; i++) {
			count++;
			System.out.print(" *");
			if (count == num) {
				System.out.println();
				count = 0;
			}
			
		}
		sc.close();
	}
}
