package chap01;

import java.util.Scanner;

public class quiz11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		
		while(num>0) {
			num /= 10;
			count++;
		}
		System.out.println("그 수는 " + count + "자리 입니다.");
	}
}
