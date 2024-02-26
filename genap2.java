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

public class genap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Nilai UAS: ");
        double uas = scanner.nextDouble();

        System.out.print("Nilai Tugas: ");
        double tugas = scanner.nextDouble();

        scanner.close();

        double na = (0.35 * uts) + (0.45 * uas) + (0.20 * tugas);

        if (na >= 80 && na <= 100) {
            System.out.println("A (Sangat Baik)");
        } else if (na >= 70 && na < 80) {
            System.out.println("B (Baik)");
        } else if (na >= 50 && na < 70) {
            System.out.println("C (Cukup)");
        } else {
            System.out.println("E (Kurang)");
        }
    }
}
