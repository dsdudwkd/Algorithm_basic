package chap03;

import java.util.Arrays;
import java.util.Scanner;

//문자열의 배열(Java의 키워드)에서 검색

public class ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Java에서 사용하는 키워드
		String[] x = {
			"abstract", "assert", "boolean", "break", "byte",
			"case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else", 
			"enum", "extends", "final", "finally", "float",
			"for", "goto", "if", "implements", "import",
			"instanceof", "int", "interface", "long", "native", 
			"new", "package", "private", "protected", "public", 
			"return", "short", "static", "strictfp", "super",
			"switch", "synchronized", "this", "throw", "throws", 
			"transient", "try", "void", "volatile", "while"
		};
		
		System.out.print("원하는 키워드를 입력하세요.: "); //키 값을 입력
		String ky = scan.next();
		
		
		/*
		 * binarySearch 메서드가 전달 받는 자료형은 Object이다. 
		 * Object는 모든 클래스의 최상위 클래스라 어떤 형태의 클래스도 받을 수 있다
		 */
		int idx = Arrays.binarySearch(x, ky); //배열 x에서 값이 ky인 요소를 검색
		
		if(idx < 0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
	}
}
