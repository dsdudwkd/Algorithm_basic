package chap01;

import java.util.Scanner;

// 1, 2, ..., n의 합을 구합니다(양수만 입력)

public class ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값: ");
			n = scan.nextInt();
		} while (n <= 0); //n이 0보다 클 때까지 반복 (n이 0 이하의 값이면 'n의 값: '이라고 다시 출력되어 입력하도록 요구)
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum += i;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
