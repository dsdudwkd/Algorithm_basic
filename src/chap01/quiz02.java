package chap01;

public class quiz02 {

	static int min3(int a, int b, int c) {
		
		int min = a;
		if(b < min) min=b;
		if(c < min) min=c;
		
		return min;
	}
	public static void main(String[] args) {
		
		System.out.println("최솟값은 " + min3(2, 4, 7) + "입니다.");
	}
}
