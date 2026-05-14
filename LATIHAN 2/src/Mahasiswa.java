class Mahasiswa{

    String nama;
    String matkul;
    int level;

    public Mahasiswa(String nama,String matkul , int level){
        this.nama = nama;
        this.matkul = matkul;
        this.level = level;
    }

    void tampil(){
        System.out.println("Dia : " + nama + " Sedang mengambil "+ matkul );
    }

}