package Patterns_Using_OneLoop;

import java.util.*;

public class PrimeNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Rows: ");
		int row = sc.nextInt();
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= i; j++) {
				while (!isPrime(num)) {
					num++;
				}
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}

	static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count == 2;
	}
}
