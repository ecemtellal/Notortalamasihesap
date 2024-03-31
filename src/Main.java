import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int totalPoint=0,lessonCount=6 ,passPoint=60, average;
       String userInfo;
       //tanımlamalar en üstte ve ing olursa eğer kod okunması için daha iyi
       //total point:Toplam Puan,lesson count:Ders Sayısı,pass point :geçiş notu
        //1 defa yazılıyor üstteki
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        /* sout altına sadece 1 satır totalPoint+=input.nextInt();
          bunun gibi bir girdi yapılabilir fazla olunca çıktıda
         girdi sayısı kadar sayı girmeni ister */
        totalPoint+=input.nextInt();
        //+= her seferinde puan ekle demek
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
        //user info: Kullanıcı Bilgisi,average :ortalama
        System.out.println(userInfo);
        //kodun okunması ve kullanışlı olması için alt kısımda rakam olmamasına dikkat et!
    }}