package chap01;

	/*
	 * 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있는데, 실습 1C-1의 med3메서드에 비해 효율이 떨어진다. 그 이유는?
	 */

public class quiz05 {
	static int med3(int a, int b, int c){
		if((b>=a && c<=a) || (b <=a && c>=a))
			return a;
		else if((a>b && c<b) || (a<b && c>b))
			return b;
		return c;
	}
}
