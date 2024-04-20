package com.pbo.uts4;

class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    // Konstruktor tanpa parameter
    public Balok() {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }

    // Konstruktor dengan parameter
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Metode untuk mengambil luas balok
    public int getLuas() {
        return 2 * ((this.panjang * this.lebar) + (this.panjang * this.tinggi)
                + (this.lebar * this.tinggi));
    }

    // Metode untuk mengambil keliling balok
    public int getKeliling() {
        return 4 * (this.panjang + this.lebar + this.tinggi);
    }
    
    // Metode untuk mengambil volume balok
    public int getVolume() {
        return this.panjang * this.lebar * this.tinggi;
    }
    
    // Metode untuk mengambil panjang balok
    public int getPanjang() {
        return this.panjang;
    }

    // Metode untuk mengambil lebar balok
    public int getLebar() {
        return this.lebar;
    }

    // Metode untuk mengambil tinggi balok
    public int getTinggi() {
        return this.tinggi;
    }

    // Metode untuk mengatur panjang balok
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // Metode untuk mengatur lebar balok
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Metode untuk mengatur tinggi balok
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}

public class Uts4 {
    public static void main(String[] args) {
        // Membuat objek balok1 dengan panjang = 1, lebar = 1, dan tinggi = 1
        Balok balok1 = new Balok();

        // Membuat objek balok2 dengan panjang = 30, lebar = 40, dan tinggi = 50
        Balok balok2 = new Balok(30, 40, 50);
        
        // Membuat objek balok3 dengan panjang = 25, lebar = 35, dan tinggi = 45
        Balok balok3 = new Balok(25, 35, 45);

        // Menampilkan panjang, lebar, tinggi, luas, keliling, dan volume balok pertama
        System.out.println("Balok dengan panjang : " + balok1.getPanjang()
                + ", lebar : " + balok1.getLebar()+ " dan tinggi : " + balok1.getTinggi()
                + ". Luasnya : " + balok1.getLuas() + ", sedangkan kelilingnya : " + balok1.getKeliling()
                + " dan volumenya : " + balok1.getVolume());
        
        // Menampilkan panjang, lebar, tinggi, luas, keliling, dan volume balok kedua
        System.out.println("Balok dengan panjang : " + balok2.getPanjang()
                + ", lebar : " + balok2.getLebar() + " dan tinggi : " + balok2.getTinggi()
                + ". Luasnya : " + balok2.getLuas() + ", sedangkan kelilingnya : " + balok2.getKeliling()
                + " dan volumenya : " + balok2.getVolume());
        
        // Menampilkan panjang, lebar, tinggi, luas, keliling, dan volume balok ketiga
        System.out.println("Balok dengan panjang : " + balok3.getPanjang()
                + ", lebar : " + balok3.getLebar() + " dan tinggi : " + balok3.getTinggi()
                + ". Luasnya : " + balok3.getLuas() + ", sedangkan kelilingnya : " + balok3.getKeliling()
                + " dan volumenya : " + balok3.getVolume());
    }
}
