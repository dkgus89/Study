package interfaceex;

public abstract class Calculator implements Calc{	//추상클래스

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1-num2;
	} 
	
}
