package chap01;

public class quiz09 {
	static int sumof(int a, int b) {
		int sum = 0;
		if(a<=b) {
			for(int i=a; i<=b; i++) {
				sum += i;
			}
		}
		else if(a>b) {
			for(int i=b; i<=a; i++) {
				sum+= i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("sumof(3,5)의 합은 = " + sumof(3,5));
		System.out.println("sumof(6,4)의 합은 = " + sumof(6,4));
		System.out.println("sumof(7,7)의 합은 = " + sumof(7,7));
		
		int[] myArray = {1, 2, 3, 4, 5};
		for (int num : myArray) {
		    System.out.println(num);
		}
	}
}
