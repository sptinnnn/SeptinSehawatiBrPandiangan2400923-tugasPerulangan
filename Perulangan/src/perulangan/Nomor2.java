package perulangan;

import java.util.Scanner;

/**
 *
 * @author simple
 */
public class Nomor2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        // Jika batasAwal lebih besar dari batasAkhir, tukar nilainya
        if (batasAwal > batasAkhir) {
            int sementara = batasAwal;
            batasAwal = batasAkhir;
            batasAkhir = sementara;
        }
        
        int jumlahGanjil = 0;
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {   // kondisi bilangan ganjil
                jumlahGanjil++;
            }
        }
        
        System.out.println("Banyaknya bilangan ganjil dari " 
                + batasAwal + " sampai " + batasAkhir 
                + " adalah: " + jumlahGanjil);
    }
}
