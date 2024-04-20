package com.pbo.uts1;

import java.util.Scanner; //baca input dari pengguna

public class Uts1 { //definisi kelas utama
    public static void main(String[] args) { //definisi method main
        Scanner scanner = new Scanner(System.in); //buat objek scanner

        System.out.print("Masukkan tiga digit integer: ");
        int number = scanner.nextInt(); //baca input sebagai bilangan bulat

        if (isPalindrome(number)) { //memanggil method
            System.out.println(number + " adalah palindrom.");
        } else {
            System.out.println(number + " bukan palindrom.");
        }

        scanner.close(); //menutup objek scanner
    }

    // Method untuk mengecek apakah suatu bilangan adalah palindrom
    public static boolean isPalindrome(int num) {
        int originalNum = num; //menyimpan salinan bilangan asli
        int reversedNum = 0; //menyimpan bilangan terbalik

        // Melakukan pembalikan digit
        while (num != 0) {
            int digit = num % 10; //mengambil digit paling kanan
            reversedNum = reversedNum * 10 + digit; //memperbarui variabel
            num /= 10; //menghapus digit paling kanan
        }

        // Memeriksa apakah bilangan asli sama dengan bilangan terbaliknya
        return originalNum == reversedNum;
    }
}
