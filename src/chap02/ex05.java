package chap02;

import java.util.Random;
import java.util.Scanner;

//배열 요소의 최댓값을 나타냅니다.(값을 난수로 생성)

public class ex05 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++) {
			height[i] = 100+rand.nextInt(90); //rand.nextInt(n)의 범위는 정수 0부터 n-1까지의 랜덤값 반환
			System.out.println("height[" + i + "]: " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
	}
}
