/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan27.hurufbesardankecil;
import java.util.Scanner;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Formatting kalimat menjadi huruf besar dan kecil
 * @author Rama
 */
public class IF110118007Latihan27HurufBesardanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kalimat = masuk.nextLine();
        String Kapital = kalimat.toUpperCase();
        String Kecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.printf("Huruf Besar\t: %s", Kapital);
        System.out.printf("%nHuruf Kecil\t: %s%n", Kecil);
    }
    
}
