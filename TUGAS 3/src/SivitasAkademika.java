public class SivitasAkademika {
    private String nama;
    private int umur;

    // Constructor
    public SivitasAkademika(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getUmur() { return umur; }
    public void setUmur(int umur) { this.umur = umur; }

    // Method menampilkan info dasar
    public void tampilkanInfo() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("Umur        : " + this.umur + " tahun");
    }
}