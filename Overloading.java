package com.pboreg;

import java.beans.EventHandler;

public class Overloading {
    static int kalkulasi (int x, int y){
        return x + y;
    }

    static double kalkulasi (double x, double y){
        return x - y;
    }

    static String kalkulasi (String x, String y){
        String hasil = x + " " + y;

        return hasil;
    }

    static String kalkulasi (String x, int y){
        String hasil = "Nama " + x + " Umur " + y + " Tahun";
        return hasil;
    }

    public static void main(String[] args){

        String nilai3 = kalkulasi("Damario", "Evan");
        int nilai1 = kalkulasi(8,5);
        double nilai2 = kalkulasi(4.3, 6.26);
        String nilai4 = kalkulasi("Evan", 18);
        System.out.println("Nilai Int = " + nilai1);
        System.out.println("Nilai double = " + nilai2);
        System.out.println("Nilai String = " + nilai3);
        System.out.println("Keterangan = " + nilai4);
    }
}
