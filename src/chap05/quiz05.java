package chap05;

import java.util.Scanner;

import chap04.ex01_IntStack;

public class quiz05 {
	
	static void recur3(int n) {
		ex01_IntStack s = new ex01_IntStack(n);
		
		while(true) {
			if(n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n-1;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요. : ");
		int x = scan.nextInt();
		
		recur3(x);
	}
}
