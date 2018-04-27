package javalec.di_ex;

public class MyCalculator {

	Calculator calculator;
	private int first;
	private int second;
	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public MyCalculator() {
		// TODO Auto-generated constructor stub
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void sum() {
		calculator.addition(first, second);
	}

}
