package perulangan;

import java.util.Scanner;

/**
 *
 * @author simple
 */
public class Nomor3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (n >= 0): ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Input tidak valid! n harus >= 0");
        } else if (n == 0) {
            System.out.println("0! = 1");
        } else {
            
            int faktorial = 1;
            
            System.out.print(n + "! = ");
            
            for (int i = n; i >= 1; i--) {
                System.out.print(i);
                
                if (i > 1) {
                    System.out.print("*");
                }
                
                faktorial *= i;
            }
            
            System.out.println("=" + faktorial);
        }
    }
}
