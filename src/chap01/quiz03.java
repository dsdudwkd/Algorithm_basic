package chap01;

public class quiz03 {

	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		if(b < min) min=b;
		if(c < min) min=c;
		if(d < min) min=d;
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println("최솟값은 " + min4(1, 1, -2, -5) + "입니다.");
		System.out.println("최솟값은 " + min4(2, 4, 5, 1) + "입니다.");
		System.out.println("최솟값은 " + min4(1, 2, 4, 3) + "입니다.");
		System.out.println("최솟값은 " + min4(-3, -10, -29, -2) + "입니다.");
	}
}
