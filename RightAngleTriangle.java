package Patterns_Using_OneLoop;

import java.util.*;

public class RightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		String st = "";
		for (int i = 1; i <= num; i++) {
			st = st + " *";
			System.out.println(st);
		}
		sc.close();
	}

}
