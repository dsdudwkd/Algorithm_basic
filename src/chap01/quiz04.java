package chap01;

import java.util.Scanner;

public class quiz04 {
	static int medium(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		
		System.out.println("medium(3,2,1) = " + medium(3,2,1)); //a>b>c
		System.out.println("medium(3,2,2) = " + medium(3,2,2)); //a>b=c
		System.out.println("medium(3,1,2) = " + medium(3,1,2)); //a>c>b
		System.out.println("medium(3,2,3) = " + medium(3,2,3)); //a=c>b
		System.out.println("medium(2,1,3) = " + medium(2,1,3)); //c>a>b
		System.out.println("medium(3,3,2) = " + medium(3,3,2)); //a=b>c
		System.out.println("medium(3,3,3) = " + medium(3,3,3)); //a=b=c
		System.out.println("medium(2,2,3) = " + medium(2,2,3)); //a=b<c
		System.out.println("medium(2,3,1) = " + medium(2,3,1)); //b>a>c
		System.out.println("medium(2,3,2) = " + medium(2,3,2)); //b>a=c
		System.out.println("medium(1,3,2) = " + medium(1,3,2)); //b>c>a
		System.out.println("medium(2,3,3) = " + medium(2,3,3)); //b=c>a
		System.out.println("medium(1,2,3) = " + medium(1,2,3)); //a<b<c
	}
}
