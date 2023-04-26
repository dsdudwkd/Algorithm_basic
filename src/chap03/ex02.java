package chap03;

// 실습 3-1의 while문을 for문으로 구현
// 배열 a의 앞쪽 n갱 요소에서 key와 같은 요소를 선형 검색

public class ex02 {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) 
			if(a[i] == key) 
				return i; //검색 성공(인덱스 반환)
		return -1;
	}
}
