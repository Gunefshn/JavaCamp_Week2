package methods;

public class Main {

	public static void main(String[] args) {
		SayıBulma();
		
	}
	
	public static void SayıBulma() {
		int [] sayilar = new int [] {1,2,3,45,6};
		int arananSayi = 6 ;
		boolean varMi = false;
		
		for (int sayi: sayilar) {
			if(sayi == arananSayi) {
				varMi = true;
				break;
			}
		}
		if(varMi == true) {
			System.out.println("Sayı var");
			Message(mesaj);
		}
		else {
			System.out.println("sayi yok");
		}
	}
	public static void Message(String mesaj) {
		System.out.println(mesaj);
	}

}
