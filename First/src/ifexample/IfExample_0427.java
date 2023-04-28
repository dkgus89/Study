package ifexample;

public class IfExample_0427 {

	public static void main(String[] args) {
		System.out.println("...................Ex1");
		
		int age = 7;
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println("...................복습");
		
		char gender = 'F';
		if(gender == 'F') {
			System.out.println("여성입니다");
		}else {
			System.out.println("남성입니다");
		}
		
		System.out.println("...................Ex2");
		
		age=99;
		int charge;
		
		if(age<8) {
			charge=1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age<14){
			charge=2000;
			System.out.println("초등학생입니다.");
		}else if(age<20) {
			charge=2500;
			System.out.println("중,고등학생입니다.");
		}else if(age>=60){
			charge=0;
			System.out.println("경로우대입니다.");
		}else{
			charge=3000;
			System.out.println("일반인입니다.");
			}
		System.out.println("입장료는 "+charge+"원입니다.");
		


	}

}
