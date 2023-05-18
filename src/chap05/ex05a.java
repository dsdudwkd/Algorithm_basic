package chap05;

import java.util.Scanner;

public class ex05a {
	static void recur3(int n) {

		if(n>0) {
			recur3(n-1);
			recur3(n-2);
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요. : ");
		int x = scan.nextInt();

		recur3(x);
	}
}
