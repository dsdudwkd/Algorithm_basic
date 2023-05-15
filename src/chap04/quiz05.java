package chap04;

import chap04.ex03_IntQueue.EmptyIntQueueException;
import chap04.ex03_IntQueue.OverflowIntQueueException;

public class quiz05 {
	private int max; //큐의 용량 (배열 que에 저장할 수 있는 최대 요소의 개수)
	private int front; //첫 번째 요소 커서 - 인큐하는 데이터 가운데 첫 번째 요소의 인덱스를 저장
	private int rear; //마지막 요소 커서 - 인큐한 데이터 중 맨 나중에 넣은 요소의 +1 인덱스를 저장하는 필드

	//front와 rear의 값이 같을 경우 큐가 비어 있는지, 가득 찼는지 구별할 수 없는 상황을 피하기 위해 이 변수 필요
	private int num; // 현재 데이터 수 - 큐가 비어 있을 땐 num=0, 가득 차있을 땐 num=max;
	private int[] que; //큐 본체

	//실행 시 예외: 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}

	//실행 시 예외: 큐가 가득 차있음
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}

	//생성자 - 큐 본체용 배열을 생성하는 등의 준비 작업 수행
	public quiz05(int capacity) {
		num = front = rear = 0; //큐 생성 시 비어 있기 때문에 모두 0
		max = capacity; //매개 변수 capacity로 전달 받은 큐의 용량을 max에 복사

		try {
			que = new int[max]; //큐 본체용 배열 생성
		} catch (OutOfMemoryError e) { //생성할 수 없음
			max = 0;
		}
	}

	//큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max)
			throw new OverflowIntQueueException(); //큐가 가득 참
		que[rear++] = x;
		num++;
		if(rear == max) //rear 값을 1만큼 증가했을 때 큐의 최대 용량인 max와 같을 경우
			rear = 0; //rear를 배열의 처음인 0으로 변경

		return x;
	}

	//큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException(); //큐가 비어 있음
		int x = que[front++];
		num--;
		if(front == max) //front 값을 1만큼 증가했을 때 큐의 최대 용량인 max와 같을 경우
			front = 0; //front를 배열의 처음인 0으로 변경

		return x;
	}

	//큐에서 데이터를 피크(디큐에서 꺼낼 프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException(); //큐가 비어 있으면 예외 던짐
		return que[front]; //값을 조사만 할 뿐 데이터는 꺼내지 않으므로 front, rear, num의 값은 변화x
	}

	//큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			//프런트 → 리어 쪽으로 선형 검색 수행
			int idx = (i + front) % max; //i: 0, 1, 2, 3, 4, 5, 6 & idx: 7, 8, 9, 10, 11, 0, 1 이런식으로 바뀜
			if(que[idx] == x) //검색 성공 
				return idx;
		}
		return -1; //검색 실패
	}

	//임의의 데이터 검색
	public int search(int x) throws EmptyIntQueueException {
		if(num<=0)
			throw new EmptyIntQueueException();
		else {
			for(int i=0; i<num; i++) {
				int n = (i+front)%max;
				if(que[n] == x)
					return i+1;
			}
		}
		return 0;
	}
	//큐를 비움 - 모든 데이터 삭제
	public void clear() {
		num = front = rear = 0;
	}

	//큐의 용량을 반환 - 최대 용량 확인
	public int capacity() {
		return max;
	}

	//큐에 쌓여있는 데이터 수를 반환
	public int size() {
		return num;
	}

	//큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	//큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}

	//큐 안의 모든 데이터를 프런트 → 리어 순으로 출력
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[(i+front)%max] + " ");
			System.out.println();
		}
	}
}
