package chap01;

import java.util.Scanner;

public class quiz10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a의 값: ");
		int a = scan.nextInt();
		int b;
		
		do {
			System.out.print("b의 값: ");
			b = scan.nextInt();
			if(b <= a) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (b <= a); 
		
		
		System.out.println("b-a는 " + (b-a) +"입니다.");
	}
}
