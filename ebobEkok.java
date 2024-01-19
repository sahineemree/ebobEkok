import java.util.*;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob = 1, ekok = 1;

        System.out.print("Birinci sayıyı giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        int sayi2 = input.nextInt();

        if (sayi2 > sayi1) {

            for (int i = 1; i <= sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {

                    ebob = i;
                    ekok = (sayi1 * sayi2) / ebob;
                }
            }
            System.out.println("Sayıların en büyük ortak böleni = " + ebob);
            System.out.println("Sayıların en küçük ortak katı = " + ekok);

        } else if (sayi2 < sayi1) {
            for (int i = 1; i <= sayi2; i++) {

                if (sayi1 % i == 0 && sayi2 % i == 0) {

                    ebob = i;
                    ekok = (sayi1 * sayi2) / ebob;
                }
            }
            System.out.println("Sayıların en büyük ortak böleni = " + ebob);
            System.out.println("Sayıların en küçük ortak katı = " + ekok);
        } else {

            System.out.println("Girilen eşit sayıların EBOB ve EKOK'ları kendilerine eşittir.");
            System.out.println("Sayıların en büyük ortak böleni = " + sayi1);
            System.out.println("Sayıların en küçük ortak katı = " + sayi1);
        }
    }
}
