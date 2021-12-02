package basicproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi = new ArrayList<>();
	static List<Double> urunFiyatlari = new ArrayList<>();
	static double toplamOdenecekTutar;
	double urunTutari;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
		 * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
		 * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
		 * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
		 * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
		 * goster.
		 *
		 */

		urunListesi.add("1-->elma");
		urunListesi.add("2-->armut");
		urunListesi.add("3-->portakal");
		urunListesi.add("4-->mandalina");
		urunListesi.add("5-->muz");
		urunListesi.add("6-->greyfurt");

		urunFiyatlari.add(4.0);
		urunFiyatlari.add(5.0);
		urunFiyatlari.add(5.0);
		urunFiyatlari.add(4.75);
		urunFiyatlari.add(9.90);
		urunFiyatlari.add(4.0);

		System.out.println("******************MANAVIMIZA HOÞGELDÝNÝZ*******************");
		for (int i = 0; i < urunListesi.size(); i++) {
			System.out.println(urunListesi.get(i) + " kg fiyati = " + urunFiyatlari.get(i));
		}
		System.out.println();
		musteriSecimi();

	}

	private static void musteriSecimi() {
		System.out.println("lütfen almak istediðiniz urunun kodunu giriniz: ");
		int urun = scan.nextInt();

		System.out.println("lütfen almak istediðiniz urunden kac kilo almak istediginizi giriniz: ");
		double kg = scan.nextDouble();

		double urunTutari = (kg * urunFiyatlari.get(urun - 1));
		toplamOdenecekTutar += urunTutari;

		tercih();

	}

	private static void tercih() {
		System.out.println("baþka urun almak ister misiniz: \n(istiyorsanýz 1 e  istemiyorsaniz 2 ye basýn)");
		int tercih = scan.nextInt();

		if (tercih == 1) {
			musteriSecimi();

		} else {
			System.out.println("Toplam odenecek tutar : " + toplamOdenecekTutar);
		}

	}

}
