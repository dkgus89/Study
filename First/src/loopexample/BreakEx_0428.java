package loopexample;

public class BreakEx_0428 {
	public static void main(String[] args) {
		System.out.println("...................Ex1");
		
		int sum = 0;
		int num = 0;
		
		for(num=0; sum<100; num++) {	// 합한 값이 100보다 클 때 종료
			sum += num;
		}
		System.out.println("num:"+num);
		System.out.println("sum:"+sum);
		
		System.out.println("...................Ex2");
		
		sum=0;
		num=0;
		
		for(num=0; ; num++) {	// 조건식을 생략하는 대신 break문을 사용합니다.
			sum+=num;
			if(sum>=100)		// sum이 100보다 크거나 같을 때 (종료조건)
				break;			// 반복문 중단
		}
		System.out.println("num:"+num);
		System.out.println("sum:"+sum);
		
		System.out.println("...................복습");
		
		sum=0;
		int num2;
		for(num2=1; ; num2++) {
			sum+=num2;
			if(sum>=500) 
				break;
		}
		System.out.println(sum);
		System.out.println(num2);
		
	}

}
