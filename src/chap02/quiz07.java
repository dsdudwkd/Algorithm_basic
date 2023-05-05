package chap02;

import java.util.Scanner;

public class quiz07 {
	static int Conversion(int x, int r, char[] c) {
		int digit = 0;
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while(x != 0){
			if(x/r != 0) {
				System.out.println(r + "|" + " \t" + x + " ∙∙∙ " + x%r);
				System.out.println(" +--------");
			} else
				System.out.println(" \t" + x + " ∙∙∙ " + x%r);
			
			c[digit++] = str.charAt(x%r);
			x/=r;
		}
		return digit;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int change;
		int result;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		System.out.print("변환하는 음이 아닌 정수: ");
		num = scan.nextInt();
		System.out.print("어떤 진수로 변환할까요? (2~36): ");
		change = scan.nextInt();
		
		result = Conversion(num, change, cno);
		
		System.out.print(change + "진수로 ");
		for(int i=result-1; i>=0; i--)
			System.out.print(cno[i]);
		System.out.println("입니다.");
		
	}
}
