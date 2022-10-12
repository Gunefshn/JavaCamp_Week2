package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customer = new CustomerManager();
		CustomerManager customer2 = new CustomerManager();
		int[] numbers ={1,2,3};
		int[] numbers2 = new int [] {4,5,6};
		numbers2 = numbers;
		numbers[0]=123;
		System.out.println(numbers[0]);
		//Diziler referansla çalışır bu yüzden ekran çıktısı 123 olur.
		
		int a = 10;
		int b = 5;
		b = a ;
		a= 123;
		System.out.println(b);
		// ekran çıktısı 10 olur.
		
	}

}
