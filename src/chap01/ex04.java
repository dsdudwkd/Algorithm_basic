package chap01;

import java.util.Scanner;

// 정숫값의 부호를 판단하여 출력하는 프로그램
// 이 프로그램을 통해 프로그램 흐름의 분기에 대해 알아보자

public class ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.: ");
		int num = scan.nextInt();
		
		if(num > 0)
			System.out.println("이 수는 양수입니다.");
		else if (num < 0)
			System.out.println("이 수는 음수입니다.");
		else
			System.out.println("이 수는 0 입니다.");
	}
}
