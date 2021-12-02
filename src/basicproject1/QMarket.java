package basicproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class QMarket {
	static ArrayList<String> gunler = new ArrayList<>();
	static ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
	static ArrayList<String> ortalamaUstu = new ArrayList<>();
	static ArrayList<String> ortalamaAlti = new ArrayList<>();
	static double ortalama;
	public static void main(String[] args) {

		/*
		 * Bir bakkal�n 7 g�nl�k t�m kazan�lar�n� g�nl�k olarak g�steren bir program
		 * yaz�n�z. Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir
		 * method yaz�n�z. Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n�
		 * g�steren bir method yaz�n�z. Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda
		 * kazand���n� g�steren bir method yaz�n�z.
		 *
		 * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler) 2. Ad�m :
		 * G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun.
		 * (gunlukKazanclar) 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k
		 * kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle. 4. Ad�m :
		 * getOrtalamaKazanc() adl� method ile ortalama kazanc� al�n. 5. Ad�m :
		 * getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun. for d�ng�s� ile
		 * t�m g�nleri ortalama kazan� ile kar��la�t�r ortalama kazan�tan y�ksekse o
		 * g�nleri return yap. 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl�
		 * method olu�turun. for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
		 * ortalama kazan�tan a�a��ysa o g�nleri return yap.
		 */

		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsamba");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		Scanner scan=new Scanner(System.in);
		int i=0;
        while (i!=gunler.size()) {
            System.out.print(gunler.get(i)+" g�n�n�n kazanc�n� girin :");
            gunlukKazanclar.add(scan.nextInt());
            i++;
        }
		getOrtalamaKazanc(gunlukKazanclar);
		System.out.println("Ortalamanin ustunde kazanc saglanan gunler: "+getOrtalamaninUstundeKazancG�nleri(ortalama));
		System.out.println("Ortalamanin altinda kazanc saglanan gunler: "+getOrtalamaninAltindaKazancG�nleri(ortalama));
		scan.close();
	}

	private static double getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar) {
		double toplamKazanc = 0;

		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			toplamKazanc += gunlukKazanclar.get(i);
		}
		ortalama = toplamKazanc / 7;

		return toplamKazanc;
	}

	private static ArrayList<String> getOrtalamaninAltindaKazancG�nleri(double ortalama) {

		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (ortalama > gunlukKazanclar.get(i)) {
				ortalamaAlti.add(gunler.get(i));
			}
		}
		return ortalamaAlti;

	}

	private static ArrayList<String> getOrtalamaninUstundeKazancG�nleri(double ortalama) {

		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (ortalama <= gunlukKazanclar.get(i)) {
				ortalamaUstu.add(gunler.get(i));
			}
		}
		return ortalamaUstu;

	}

}
