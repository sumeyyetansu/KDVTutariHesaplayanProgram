import java.util.Scanner;

public class main {
    public static void main(String[] arg){
        /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tutar giriniz:");
        double tutar = scanner.nextInt();
        double kdvTutari;
        double kdvliFiyat ;

        if(tutar > 0 && tutar < 1000 ){

            kdvTutari = tutar * 0.18 ;
            kdvliFiyat = kdvTutari + tutar ;
            System.out.println("Girdiğiniz tutar = " + tutar + "\nGirdiğiniz tutarın KDV'li fiyatı =" + kdvliFiyat + "\nGirdiğiniz tutarın KDV tutarı = " + kdvTutari);

        } else if (tutar > 1000) {

            kdvTutari = tutar * 0.08 ;
            kdvliFiyat = kdvTutari + tutar ;
            System.out.println("Girdiğiniz tutar = " + tutar + "\nGirdiğiniz tutarın KDV'li fiyatı =" + kdvliFiyat + "\nGirdiğiniz tutarın KDV tutarı = " + kdvTutari);

            
        }else {
            System.out.println("Lütfen geçerli bir tutar giriniz.");
        }
    }
}
