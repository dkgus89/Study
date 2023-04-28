package operator;

public class OperationEx_0425 {

	public static void main(String[] args) {
		System.out.println(".......Ex1");
		
		int mathScore=90;
		int engScore=70;
		int korScore=95;
		
		int totalScore=mathScore+engScore+korScore;	// 총점 구하기
		System.out.println(totalScore);
		
		double avgScore=totalScore/3.0;		// 평균 구하기
		System.out.println(avgScore);
		
		
		System.out.println(".......Ex2");
		
		
		int gameScore=150;				// 게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore;	// gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);	// 151
		
		int lastScore2 = --gameScore;	// gameScore에 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);	// 150
		
		
		System.out.println(".......Ex3");
		
		
		int num1=10;
		int i=2;
		
		boolean value= ((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);	// 논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i값을 그대로!
		
		value= ((num1=num1+10)>10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);	// 논리 합에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i값 그대로!!
		
		
		System.out.println(".......복습");
		
		
		int num = 5;
		int i2 = 10;
		
		value = ((num=num*10)>45) || ((i2=i2-5)<10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i2);
		
		
		
		System.out.println(".......Ex4");
		
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
	}

}
