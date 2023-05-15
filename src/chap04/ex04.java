package chap04;

//int형 큐의 사용 예

import java.util.Scanner;
import chap01.ex03;

public class ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ex03_IntQueue s = new ex03_IntQueue(64); //최대 64개를 인큐할 수 있는 큐
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			System.out.print("(1)인큐  (2)디큐  (3)피크  (4)덤프  (5)임의데이터검색  (0)종료: ");
			
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			
			case 1: //인큐
				System.out.print("데이터: ");
				x = scan.nextInt();
				try {
					s.enque(x);
				} catch (ex03_IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2: //디큐
				try {
					x = s.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				} catch (ex03_IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 3: //피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (ex03_IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;
				
			case 4: //덤프
				s.dump();

				break;
				
			case 5: //검색
				try {
					x = scan.nextInt();
					s.search(x);
					System.out.println("검색한 데이터는 큐 안에서 " + s.search(x) + "에 있습니다.");
				} catch (ex03_IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
			}
		}
		
	}
}
