package chap01;

public class quiz17 {
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		npira(4);
	}
}
