public class AsistenPraktikum extends Mahasiswa {
    private String mataKuliah;
    private double honor;

    // Constructor
    public AsistenPraktikum(String nama, int umur, String nim, double ipk, String mataKuliah, double honor) {
        super(nama, umur, nim, ipk); // Memanggil constructor Mahasiswa
        this.mataKuliah = mataKuliah;
        this.honor = honor;
    }

    // Getter & Setter
    public String getMataKuliah() { return mataKuliah; }
    public void setMataKuliah(String mataKuliah) { this.mataKuliah = mataKuliah; }

    public double getHonor() { return honor; }
    public void setHonor(double honor) { this.honor = honor; }

    // Method Overriding
    @Override
    public void tampilkanInfo() {
        // Cukup panggil super.tampilkanInfo(), maka info nama, umur, nim, dan ipk otomatis tercetak
        System.out.println("\n(Data di bawah adalah Asisten Praktikum)");
        super.tampilkanInfo(); 
        System.out.println("Mata Kuliah : " + this.mataKuliah);
        System.out.println("Honor/Bulan : Rp " + this.honor);
    }
}