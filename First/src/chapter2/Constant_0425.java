package chapter2;

public class Constant_0425 {

	public static void main(String[] args) {
		final int Max_num = 100;	// 선언과 동시에 초기화
		final int Min_num;
		
		Min_num=0;	// 사용하기 전에 초기화. 초기화하지 않으면 오류 발생
		
		System.out.println(Max_num);
		System.out.println(Min_num);
		
		// Max_num = 1000;	- 오류발생. 상수는 값을 변경할 수 없음.
	}

}
