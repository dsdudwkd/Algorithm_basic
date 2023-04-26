package chap01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 최댓값을 구합니다.

class ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값: " + a); 
		System.out.println("b의 값: " + b); 
		System.out.println("c의 값: " + c);
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
