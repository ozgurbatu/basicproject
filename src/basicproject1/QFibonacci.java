package basicproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan alýnan bir tamsayýya kadar FIBONACCI dizisi oluþturun.
		 * 1-1-2-3-5-8-13-21-34....
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen FIBONACCI dizisi icin bir tam sayi giriniz");
		int sayi = scan.nextInt();

		List<Integer> fibonacci = new ArrayList<>();

		fibonacci.add(1);
		fibonacci.add(1);

		int sayi1 = 0;

		while (sayi1 < sayi) {

			sayi1 = (fibonacci.get(fibonacci.size() - 2)) + (fibonacci.get(fibonacci.size() - 1));
			fibonacci.add(sayi1);

		}
		fibonacci.remove(fibonacci.size() - 1);
		System.out.println(fibonacci);

		scan.close();

	}
}
