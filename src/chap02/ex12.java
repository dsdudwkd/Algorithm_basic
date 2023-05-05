package chap02;

//2행 4열의 2차원 배열

public class ex12 {
	public static void main(String[] args) {
		
		int[][] x = new int[2][4]; //2차원 배열 선언
		
		x[0][1] = 37; //x[0][1]에 37 대입
		x[0][3] = 54; //x[0][3]에 54 대입
		x[1][2] = 65; //x[1][2]에 65 대입
		
		for(int i=0; i<2; i++) { //각 요소의 값을 출력
			for(int j=0; j<4; j++)
				System.out.println("x[" + i + "][" + j +"] =" + x[i][j]);
		}
	}
}
