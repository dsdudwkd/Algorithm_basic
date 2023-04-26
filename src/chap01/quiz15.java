package chap01;

public class quiz15 {
	
	static void triangleB(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		triangleB(4); //왼쪽 아래가 직각인 이등변 삼각형
		System.out.println("--------");
		triangleLU(4); //왼쪽 위가 직각인 이등변 삼각형
		System.out.println("--------");
		triangleRU(4); //오른쪽 위가 직각인 이등변 삼각형
		System.out.println("--------");
		triangleRB(4); //오르쪽 아래가 직각인 이등변 삼각형
	}
}
