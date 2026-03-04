/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author simple
 */
public class Perulangan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Input tidak valid! n harus >= 1");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
        
    }
    
}
