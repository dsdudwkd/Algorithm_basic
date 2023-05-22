package chap05;

//가지 뻗기
//각 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열
//규칙 1: 각 열에 퀸을 1개만 배치한다 

public class ex07 {
	static int[] pos = new int[8]; //배열 pos는 퀸의 배치를 나타냄
	
	//각 열의 퀸의 위치를 출력
	static void print() {
		for(int i=0; i<8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	//i열에 퀸을 놓는다
//set 메서드는 i열에 퀸을 1개만 배치하는 8가지 조합을 만드는 재귀 메서드
	static void set(int i) { //i는 퀸을 배치할 열
		for(int j=0; j<8; j++) { //j는 행
			pos[i] = j; //퀸을 j행에 배치
			if(i == 7) //모든 열에 배치
				print();
			else
				set(i+1); //다음 열에 퀸을 배치
		}
	}
	
	public static void main(String[] args) {
		set(0); //0 열에 퀸을 배치
	}
}