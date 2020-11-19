package com.pboreg;

interface TugasMahasiswa{
    void Kuliah();
    void BelajarMandiri();
    void MengembangkanDiri();
}

class Mahasiswa implements TugasMahasiswa{
    public Mahasiswa(){
        System.out.println("Tugas Mahasiswa adalah:");
    }

    @Override
    public void Kuliah() {
        System.out.println("1. Kuliah tepat waktu");
    }

    @Override
    public void BelajarMandiri() {
        System.out.println("2. Belajar Mandiri, rajin membaca");
    }

    @Override
    public void MengembangkanDiri() {
        System.out.println("3. Memgembangkan diri melalui pelatihan dan komunitas");
    }
}

public class Interface_class {
    public static void main(String[] args) {
        Mahasiswa Anto = new Mahasiswa();

        Anto.Kuliah();
        Anto.BelajarMandiri();
        Anto.MengembangkanDiri();
    }
}