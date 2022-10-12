package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava güzel";
		message.substring(0,2);
		String newMessage = city();
		//System.out.println(newMessage);
		int sayi = plus(13,15);
		//System.out.println(sayi);
		int total = plus2(5,6,6,4,8,9);
		System.out.println(total);
	}
	public static void add() {
		
	}
	public static void delete() {
		
	}
	public static void update() {
		
	}
	public static int plus(int number1,int number2) {
		return number1+number2;
	}
	public static int plus2(int... numbers) {
		int total = 0;
		for(int number: numbers) {
			total+=number;
		}
		return total;
	}
	
	public static String city() {
		return "Ankara";
	}
}
