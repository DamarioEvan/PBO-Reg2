package com.pboreg;

class Classku {
    //Atribute
    public int x = 5; //atribut ini boleh diakses secara langsung dr luar classku
    int y = 15; // atribut ini dapat diakses secara langsung dr luas classku karna 1 package
    private int z = 20;// atribut ini tidak dapat diakses secara lgsg dr luar

    //method
    public int tampilkan2(){
        return this.z;
    }
}
