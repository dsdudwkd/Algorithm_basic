package chap05;

import java.util.Scanner;

public class quiz06 {
	//no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
		static void move(int no, char x, char y) {
			if(no>1)
				//기둥 번호의 합이 6이라 시작 기둥, 목표 기둥이 어느 기둥이라도 중간 기둥은 6-x-y로 구할 수 있음
				move(no-1, x, (char) (198-x-y));
			
			System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
			
			if(no>1)
				move(no-1,(char) (198-x-y), y); 
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("하노이의 탑");
			System.out.print("원반 개수: ");
			int n = scan.nextInt();
			
			move(n, 'A', 'C'); //1번 기둥의 n개의 원반을 3번 기둥으로 옮김 
			
			
		}
}