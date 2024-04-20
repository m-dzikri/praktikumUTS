package com.pbo.uts3;

import java.util.Scanner;

public class Uts3 {
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) { //deklarasi method
        int reversedNumber = 0; //menyimpan bilangan bulat yang telah dibalik
        while (number != 0) {
            int digit = number % 10; //mengambil digit terakhir number
            reversedNumber = reversedNumber * 10 + digit; //membalikkan number
            number /= 10; //membuang digit tereakhir
        }
        return reversedNumber;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number); //panggil method reverse
    }

    public static void main(String[] args) { //deklarasi method main
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah bilangan palindrom.");
        } else {
            System.out.println(number + " bukan bilangan palindrom.");
        }
    }
}
