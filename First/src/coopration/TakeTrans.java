package coopration;

public class TakeTrans {

	public static void main(String[] args) {

		Student studentJames=new Student("James", 5000);
		Student studentTomes=new Student("Tomes", 10000);	// 학생 두명 생성
		
		Bus bus100= new Bus(100);		// 노선번호가 100번인 버스 생성
		studentJames.takeBus(bus100);	// james가 100번 버스를 탐
		studentJames.showInfo();		// james의 정보 출력
		bus100.showInfo();				// 버스 정보 출력
		
		Subway subwayGreen=new Subway("2호선");	// 노선번호가 2호선인 지하철 생성
		studentTomes.takeSubway(subwayGreen);	// tomas가 2호선 지하철을 탐
		studentTomes.showInfo();				// tomas의 정보 출력
		subwayGreen.showInfo(); 				// 지하철 정보 출력
		
	}

}
