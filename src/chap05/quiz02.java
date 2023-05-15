package chap05;

import java.util.Scanner;

public class quiz02 {
	
	static int gcd(int x, int y) {
		while(y != 0) {
			int temp = x%y;
			x = y;
			y = temp;
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : "); int x = scan.nextInt();
		System.out.print("정수를 입력하세요. : "); int y = scan.nextInt();
		
		System.out.println("두 수의 최대공약수는 " + gcd(x,y) + "입니다.");
	}
}
