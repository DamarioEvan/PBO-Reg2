package com.pboreg;

public class Main {

    public static void main(String[] args) {
        Bilangan objku = new Bilangan();
        System.out.println(objku.tampilkanA());
        System.out.println(objku.tampilkanB());
        System.out.println(objku.tampilkanC());

        objku.inputA(100);
        System.out.println("Nilai A setelah diinput = " +objku.tampilkanA());
        objku.inputB(200);
        System.out.println("Nilai B setelah diinput = " +objku.tampilkanB());
        objku.inputC(300);
        System.out.println("Nilai C setelah diinput = " +objku.tampilkanC());

        System.out.println("Hasil Pertambahan = " + objku.tambah());
        System.out.println("Hasil Pengurangan = " + objku.pengurangan());
        System.out.println("Hasil Perkalian = " + objku.perkalian());
        System.out.println("Hasil Pembagian = " + objku.pembagian());
    }
}
