
public class DortIslem {
	public int Plus(int number1, int number2) {
		return number1+number2;
	}
	public int Minus(int number1, int number2) {
		if(number1<number2) {
			return number2-number1;
		}
		else if(number1>number2){
			return number1-number2;
		}
		else {
			return 0;
		}
	}
	public int Divided(int number1,int number2) {
		if(number1<number2) {
			return number2/number1;
		}
		else if(number1>number2){
			return number1/number2;
		}
		else {
			return 1;
		}
	}
	public int Multiply(int number1,int number2) {
		return number1*number2;
	}
}
