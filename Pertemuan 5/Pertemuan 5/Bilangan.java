package com.pboreg;

class Bilangan {
    private int a = 10;
    private int b = 20;
    private int c = 30;

    public int tampilkanA() {
        return this.a;
    }
    public int tampilkanB(){
        return this.b;
    }
    public int tampilkanC(){
        return this.c;
    }
    public void inputA(int nilai) {
        this.a = nilai;
    }
    public void inputB(int nilai) {
        this.b = nilai;
    }public void inputC(int nilai) {
        this.c = nilai;
    }
    public int tambah() {
        int hasil = this.a + this.b + this.c;
        return hasil;
    }
    public int pengurangan() {
        int hasil = this.b - this.a;
        return hasil;
    }
    public int perkalian() {
        int hasil = this.a * this.b * this.c;
        return hasil;
    }
    public double pembagian() {
        double hasil = (double) this.a / (double) this.c;
        return hasil;
    }
}
