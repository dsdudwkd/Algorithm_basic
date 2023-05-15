package chap05;

import java.util.Scanner;

public class quiz03 {

	static int gcd(int x, int y) {
		while(y != 0) {
			int temp = x%y;
			x = y;
			y = temp;
		}
		return x;
	}

	static int gcdArray(int a[], int start, int n) {
		if(n == 1) {
			return a[start];
		} else if(n == 2) {
			return gcd(a[start], a[start+1]);
		}else {
			return gcd(a[start], gcdArray(a, start+1, n-1));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
		int num = scan.nextInt();
		int[] x = new int[num]; // 길이 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = scan.nextInt();
		}
		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}
}
