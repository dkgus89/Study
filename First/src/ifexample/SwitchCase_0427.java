package ifexample;

public class SwitchCase_0427 {

	public static void main(String[] args) {
		System.out.println("...................Ex1");
		
		int ranking=2;
		char medelColor;
		
		switch(ranking) {
		case 1 : medelColor = 'G';
				break;
		case 2 : medelColor = 'S';
				break;
		case 3 : medelColor = 'B';
				break;
		default:
				 medelColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medelColor + "입니다.");
		
		System.out.println("...................Ex2");
		
		String medel = "Silver";
		
		switch (medel) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;			
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}

}
