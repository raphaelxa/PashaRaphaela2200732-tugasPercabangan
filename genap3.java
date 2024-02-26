package latihan2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pasha
 */

import java.util.Scanner;

public class genap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();

        scanner.close();

        int jumlahMobil = (int) Math.ceil((double) jumlahPeserta / 7);

        System.out.println("Mobil yang diperlukan adalah " + jumlahMobil);
    }
}
