package chap01;

import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = 1;
		System.out.print("n의 값: ");
		double n = scan.nextInt();
		
		int sum = (int)((start+n)*(n/2));

		System.out.println("1부터 " +  (int)n + "까지의 합은 " + sum);
	}
}
