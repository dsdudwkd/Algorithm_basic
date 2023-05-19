package chap03;

//클래스 ex07의 내부에서 comparator를 정의하는 방법은 다음과 같다

import java.util.Comparator;

public class ex07 {
	
	//필드, 메서드 등
	
	public static final Comparator<T> COMPARATOR = new Comp();
	
	private static class Comp<T> implements Comparator<T>{
		public int compare(T d1, T d2) {
			//d1이 d2보다 크면 양의 값 반환
			//d1이 d2보다 작으면 음의 값 반환
			//d1이 d2와 같으면 0 반환
			return 0;
		}		
	}
}
