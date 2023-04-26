package chap01;

import java.util.Scanner;

public class quiz14 {
	public static void main(String[] args) {
		System.out.println("사각형을 출력합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("단 수: ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
