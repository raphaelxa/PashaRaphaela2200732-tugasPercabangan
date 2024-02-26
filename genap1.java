/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author pasha
 */

    
    import java.util.Scanner;

public class genap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bil pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bil kedua: ");
        int bilangan2 = scanner.nextInt();

        scanner.close();

        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            int hasilPenjumlahan = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        } else {
            int hasilPerkalian = bilangan1 * bilangan2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
        }
    }
}
