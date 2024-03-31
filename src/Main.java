import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       int totalPoint=0,lessonCount=6 ,passPoint=60, average;
       String userInfo;
       //tanımlamalar en üstte ve ing olursa eğer kod okunması için daha iyi
       //total point:Toplam Puan,lesson count:Ders Sayısı,pass point :geçiş notu
       //user info: Kullanıcı Bilgisi,average :ortalama demek

        Scanner input=new Scanner(System.in);
        // Scanner input=new Scanner(System.in); sadece 1 defa yazılıyor

        System.out.println("Matematik notunuzu giriniz:");
        /* sout altına totalPoint+=input.nextInt();
          bunun gibi bir sadece 1 satır girdi yapılabilir, fazla olunca çıktıda
         girdi sayısı kadar sayı girmeni ister */

        totalPoint+=input.nextInt();
        //+= her seferinde üzerine puan ekliyor
        System.out.println("Fizik notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        totalPoint+=input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        totalPoint+=input.nextInt();

        average=(totalPoint)/lessonCount;
        System.out.println("Ders Ortalamanız:" + average);

        userInfo= average > passPoint ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        //ternary operatör kullanımı üstteki gibi

        System.out.println(userInfo);
        //kodun okunması ve kullanışlı olması için alt kısımda rakam olmamasına dikkat et!
    }}