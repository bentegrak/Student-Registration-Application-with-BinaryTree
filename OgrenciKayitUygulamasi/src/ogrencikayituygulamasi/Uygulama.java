
package ogrencikayituygulamasi;

import java.util.Scanner;


public class Uygulama {

    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int no,not;
        String ad;
        BTree ogr = new BTree();
        int secim=menu();
        
        while(secim!=0){
            switch(secim){
                case 1:
                    System.out.println("Eklenecek Ogrenci Bilgilerini Giriniz:");
                    System.out.print("Numara: ");
                    no=scanner.nextInt();
                    System.out.print("Adi: ");
                    ad=scanner.next();
                    System.out.print("Notu ");
                    not=scanner.nextInt();
                    ogr.root = ogr.insert(ogr.root, no, ad, not);
                    System.out.println(no+ " Numarali Ogrenci Eklendi. ");
                    break;
                case 2:
                    System.out.println("Silinecek Ogrenci Numarasini Giriniz:");
                    no=scanner.nextInt();
                    ogr.delete(no);
                    System.out.println(no+" Numarali Ogrenci Silindi.");
                    break;
                case 3:
                    System.out.println("Kayitli Ogrenci Bilgileri:");
                    ogr.inOrder(ogr.root);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Secim Yaptiniz.");
                    break;
            }
            secim=menu();
        }
        
       
        
    }
    private static int menu(){
        int secim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n1-Ekle");
        System.out.println("2-Sil");
        System.out.println("3-Yazdir");
        System.out.println("4-Cikis");
        System.out.println("Seciminiz:");
        
        secim=scanner.nextInt();
        return secim;        
    }
    
}
