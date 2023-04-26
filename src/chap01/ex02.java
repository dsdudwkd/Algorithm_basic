package chap01;

// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다

class ex02 {

	//a, b, c의 최댓값을 구하여 반환합니다.
	static int max3(int a, int b, int c) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max; //구한 최댓값을 호출한 곳으로 반환
	}
	
	public static void main(String[] args) {
		System.err.println("max3(3,2,1) = " + max3(3, 2, 1));
		System.err.println("max3(3,2,2) = " + max3(3, 2, 1));
		System.err.println("max3(3,1,2) = " + max3(3, 2, 1));
		System.err.println("max3(3,2,3) = " + max3(3, 2, 1));
		System.err.println("max3(2,1,3) = " + max3(3, 2, 1));
		System.err.println("max3(3,3,2) = " + max3(3, 2, 1));
		System.err.println("max3(3,3,3) = " + max3(3, 2, 1));
		System.err.println("max3(2,2,3) = " + max3(3, 2, 1));
		System.err.println("max3(2,3,1) = " + max3(3, 2, 1));
		System.err.println("max3(2,3,2) = " + max3(3, 2, 1));
		System.err.println("max3(1,3,2) = " + max3(3, 2, 1));
		System.err.println("max3(2,3,3) = " + max3(3, 2, 1));
		System.err.println("max3(1,2,3) = " + max3(3, 2, 1));
	}
}
