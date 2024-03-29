import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik=input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih=input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        double ort=(mat+fizik+tarih+kimya+turkce+muzik)/6;
        System.out.println("Ders Ortalamanız:" +ort );
        String str= ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);


    }}