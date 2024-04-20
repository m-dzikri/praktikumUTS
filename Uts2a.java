package com.pbo.uts2a;

public class Uts2a {
    public static void main(String[] args) {
        int rows = 6; //untuk menentukan jumlah baris
        for (int i = 1; i <= rows; i++) { //menghitung jumlah baris
            for (int j = 1; j <= i; j++) { //menghitung jumlah kolom
                System.out.print(j + " "); //print nilai variabel j + spasi
            }
            System.out.println(); //print baris baru 
        }
    }
}
