package chap03;

//자연스러운 정렬을 하려면 다음과 같은 방법으로 클래스를 정의한다

public class A implements Comparable<A>{ //Comparable<A> 인터페이스 구현
	
	//필드, 메서드 등

	@Override
	public int compareTo(A c){ //compareTo 메서드 구현
		// this가 c보다 크면 양의 값 반환
		// this가 c보다 작으면 음의 값 반환
		// this가 c와 같으면 0 반환
		return 0;
	}

	@Override
	public boolean equals(Object obj) { //equals 메서드 구현
		//this가 c와 같으면 true 반환
		//this가 c와 다르면 false 반환
		
		return super.equals(obj);
	}
	
	

	
}
