public class Mahasiswa extends SivitasAkademika {
    private String nim;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, int umur, String nim, double ipk) {
        super(nama, umur);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter & Setter
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    // Method Overriding
    @Override
    public void tampilkanInfo() {
        System.out.println("--- INFO MAHASISWA ---");
        super.tampilkanInfo();
        System.out.println("NIM         : " + this.nim);
        System.out.println("IPK         : " + this.ipk);
    }
}