package chap02;

//1000 이하의 소수를 열거 (버전 3)

public class ex11 {
	public static void main(String[] args) {
		int counter= 0; //곱셉과 나눗셈의 횟수 (이 알고리즘이처리 비용을 얼마나 요구하는지 저장하는 변수)
		int ptr=0; //찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수 => prime[0] = 2;
		prime[ptr++] = 3; //3은 소수 => prime[1] = 3;
		
		for(int n=5; n<=1000; n+=2) { //대상은 홀수만
			boolean flag = false;
			for(int i=1; prime[i]*prime[i] <= n; i++) { //곱셈 한 번 
				counter += 2; //두 연산의 수행 횟수 계산(곱셈, 나눗셈)
				if(n%prime[i] == 0) { // 나눗셈 한 번, 나눠 떨어지면 소수x
					flag = true;
					break; //더 이상의 반복은 불필요
				}
			}
			if(!flag) { //마지막까지 나눠떨어지지 않음
				prime[ptr++] = n; //소수라고 배열에 저장
				counter++;
			}
		}
		
		for(int i=0; i<ptr; i++)
			System.out.println(prime[i]);
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수: "+ counter);
	}
}
