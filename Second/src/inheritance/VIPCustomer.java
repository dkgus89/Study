package inheritance;

public class VIPCustomer extends Customer{	//VIPCustomer 클래스는 Customer클래스의 상속받음
	
	private int agentID;	//VIP 고객 담당 상담원 아이디
	double saleRatio;		//할인율
	
	public VIPCustomer() {	// 디폴트 생성자
		customerGrade = "VIP";	//고객등급 VIP
		bonusRatio = 0.05;		//보너스적립 5%
		saleRatio = 0.1;		//할인율 10;
	}
	
	public int calcPrice(int price) {	// 보너스포인트 적립, 지불가격 계산 메서드
		bonusPoint += price * bonusRatio;	//보너스포인트 계산
		return price-(int)(price*saleRatio);	//할인율 적용
	}
	
	public int getAgentID() {	//VIP고객에게만 필요한 메서드
		return agentID;
	}
	
	public String showCustomerInfo() {	//고객 정보를 반환하는 메서드
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}
}
