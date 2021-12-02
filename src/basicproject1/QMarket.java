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
		 * Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program
		 * yazýnýz. Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir
		 * method yazýnýz. Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný
		 * gösteren bir method yazýnýz. Ayrýca bakkalýn hangi günler ortalamanýn altýnda
		 * kazandýðýný gösteren bir method yazýnýz.
		 *
		 * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler) 2. Adým :
		 * Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun.
		 * (gunlukKazanclar) 3. Adým : While döngüsü ile kullanýcýdan 7 günlük
		 * kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle. 4. Adým :
		 * getOrtalamaKazanc() adlý method ile ortalama kazancý alýn. 5. Adým :
		 * getOrtalamaninUstundeKazancGünleri() adlý method oluþturun. for döngüsü ile
		 * tüm günleri ortalama kazanç ile karþýlaþtýr ortalama kazançtan yüksekse o
		 * günleri return yap. 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý
		 * method oluþturun. for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
		 * ortalama kazançtan aþaðýysa o günleri return yap.
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
            System.out.print(gunler.get(i)+" gününün kazancýný girin :");
            gunlukKazanclar.add(scan.nextInt());
            i++;
        }
		getOrtalamaKazanc(gunlukKazanclar);
		System.out.println("Ortalamanin ustunde kazanc saglanan gunler: "+getOrtalamaninUstundeKazancGünleri(ortalama));
		System.out.println("Ortalamanin altinda kazanc saglanan gunler: "+getOrtalamaninAltindaKazancGünleri(ortalama));
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

	private static ArrayList<String> getOrtalamaninAltindaKazancGünleri(double ortalama) {

		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (ortalama > gunlukKazanclar.get(i)) {
				ortalamaAlti.add(gunler.get(i));
			}
		}
		return ortalamaAlti;

	}

	private static ArrayList<String> getOrtalamaninUstundeKazancGünleri(double ortalama) {

		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (ortalama <= gunlukKazanclar.get(i)) {
				ortalamaUstu.add(gunler.get(i));
			}
		}
		return ortalamaUstu;

	}

}
