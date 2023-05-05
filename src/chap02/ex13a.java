package chap02;

//배열의 모든 요소의 합을 구하여 출력함(확장 for문)

public class ex13a {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i=0; i<a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
		double sum = 0; //합계
		
		//배열 a의 처음부터 끝까지 모든 요소를 한 개씩 스캔한다. 루프 본문에서는 현재 주목하고 있는 요소를 i라고 표현한다
		for(double i : a) //괄호 안의 콜론(:)은 ~의 안에 있는 이라는 뜻
			sum += i;

// 향상된 for문을 기본 for문으로 바꾼 것
//		for(int i=0; i<a.length; i++)
//			sum += a[i];
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}
}
