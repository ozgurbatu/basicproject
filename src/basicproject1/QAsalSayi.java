package basicproject1;

public class QAsalSayi {

	public static void main(String[] args) {
		/*
		 * 100 den kucuk asal sayilari yazdiran bir program yaziniz
		 */
		for (int sayi = 2; sayi <= 100; sayi++) {
			int kontrol = 0;
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) { // sayi asal degilse bu if'in icine girecek ve  
					kontrol = 1; // kontrol bir artacak ardindan bu loop'tan cikis yapacak 
					break;		// sayi artiktan sonra kontrol yine 0'a esit yapiyoruz
				}
			}

			if (kontrol == 0) {
				System.out.print(sayi + " ");

			}
		}

	}

}
