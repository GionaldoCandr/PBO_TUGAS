public class Dosen extends SivitasAkademika {
    private String nidn;

    // Constructor
    public Dosen(String nama, int umur, String nidn) {
        super(nama, umur); // Memanggil constructor superclass
        this.nidn = nidn;
    }

    // Getter & Setter
    public String getNidn() { return nidn; }
    public void setNidn(String nidn) { this.nidn = nidn; }

    // Method Overriding
    @Override
    public void tampilkanInfo() {
        System.out.println("--- INFO DOSEN ---");
        super.tampilkanInfo(); // Memanggil tampilkanInfo() dari parent
        System.out.println("NIDN        : " + this.nidn);
    }
}