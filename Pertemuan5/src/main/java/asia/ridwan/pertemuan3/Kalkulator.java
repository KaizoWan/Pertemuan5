/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asia.ridwan.pertemuan3;

import java.util.Scanner;

/**
 *
 * @author Ridwan
 */
public class Kalkulator {

    public static void main(String[] args) {
// Deklarasi variabel
        int angka1, angka2;
        char operator;
// Input data dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextInt();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextInt();
// Menghitung hasil
        int hasil;
        switch (operator) {
            case '+' -> hasil = angka1 + angka2;
            case '-' -> hasil = angka1 - angka2;
            case '*' -> hasil = angka1 * angka2;
            case '/' -> {
                if (angka2 == 0) {
                    System.out.println("Pembagian dengan 0 tidak diizinkan!");
                    return;
                }
                hasil = angka1 / angka2;
            }
            default -> {
                System.out.println("Operator tidak valid!");
                return;
            }
        }
// Menampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
}