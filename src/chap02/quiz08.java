package chap02;

import java.util.Scanner;

public class quiz08 {
	//각 달의 일수
		static int[][] mdays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //윤년
		};
		
		//서기 year년은 윤년인가? (윤년:1 / 평년:0)
		//윤년은 4로 나눠 떨어지면서 100으로는 나눠 떨어지지 않거나 400으로 나눠 떨어지는 해
		static int isLeap(int year) {
			return (year%4 == 0 && year%100 != 0 || year%400 == 0)? 1: 0;
		}
		
		//서기 y년 m월 d일의 그 해 경과 일 수를 구함
		static int dayOfYear(int y, int m, int d) {
			while(--m != 0) { //현재 월보다 이전 달들의 일 수를 모두 더해주기 위한 반복문, m이 0이 되면 mdays 배열에서 인덱스를 찾을 수 없으므로
				d+=mdays[isLeap(y)][m-1];
			}
			return d;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int retry; //다시 한 번?
			
			System.out.println("그 해 경과 일 수를 구합니다.");
			
			do { 
				System.out.print("년: "); int year = scan.nextInt(); //년
				System.out.print("월: "); int month = scan.nextInt(); //월
				System.out.print("일: "); int day = scan.nextInt(); //일
				
				System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
				
				System.out.print("한번 더 할까요? (1.예/0.아니오): ");
				retry = scan.nextInt();
			}while(retry == 1);
		}
}
