package chap02;

import java.util.Scanner;

public class quiz09 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //윤년
	};

	static int isLeap(int year) {
		return (year%4 == 0 && year%100 != 0 || year%400 == 0)? 1 : 0;
	}

	static int leftDayOfYear(int y, int m, int d) {
		while(--m != 0) {
				d += mdays[isLeap(y)][m-1];
		}
		return 365+isLeap(y)-d;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int retry; //다시 한 번?

		System.out.println("그 해 남은 일 수를 구합니다.");

		do { 
			System.out.print("년: "); int year = scan.nextInt(); //년
			System.out.print("월: "); int month = scan.nextInt(); //월
			System.out.print("일: "); int day = scan.nextInt(); //일

			System.out.printf("그 해 %d일 남았습니다.\n", leftDayOfYear(year, month, day));

			System.out.print("한번 더 할까요? (1.예/0.아니오): ");
			retry = scan.nextInt();
		}while(retry == 1);
	}
}
