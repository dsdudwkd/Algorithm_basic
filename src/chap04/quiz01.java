package chap04;

import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ex01_IntStack s = new ex01_IntStack(6);
		
		while(true) {
			
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)검색  (5)스택 검사  (6)덤프 (9)삭제 (0)종료: " );
			
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			
			int x;

			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				x = scan.nextInt();
				try {
					s.push(x);
				} catch (ex01_IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("현재 pop한 데이터는 " + x + "입니다.");
				} catch (ex01_IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("현재 peek한 데이터는 " + x +"입니다.");
				} catch (ex01_IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4:
				x = scan.nextInt();
				try {
					x = s.indexOf(x);
					System.out.println(x + "는(은) 인덱스 " + x + "번에 있습니다.");
					if(x == -1) System.out.println("현재 데이터에 존재하지 않습니다.");
				} catch (ex01_IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}

				break;

			case 5:
				if(s.size() == 0) {
					s.isEmpty();
					System.out.println("스택이 비어 있습니다.");
				}else if(s.size() == s.capacity()) {
					s.isFull();
					System.out.println("스택이 가득 차있습니다.");
				}
				break;
				
			case 6:
				try {
					System.out.println("현재 데이터: ");
					s.dump();
				} catch (ex01_IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 9:
				try {
					s.clear();
					System.out.println("데이터가 전부 삭제되었습니다.");
				} catch (ex01_IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			default:
				break;
			}
			
		}

		
	}
}

