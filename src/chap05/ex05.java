package chap05;

import java.util.Scanner;

//꼬리 재귀를 제거했습니다.

import chap04.ex01_IntStack;

public class ex05 {
	static void recur(int n) {

		ex01_IntStack s = new ex01_IntStack(n);

		while(true) {
			if(n>0) {
				s.push(n); //n의 값을 푸시
				n = n-1;
				continue;
			}

			if(s.isEmpty() != true) { //스택이 비어 있지 않다면
				n = s.pop(); //저장하고 있던 스택의 값을 팝
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;  
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요. : ");
		int x = scan.nextInt();
		
		recur(x);
	}
}
