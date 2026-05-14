public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI SISTEM MANAJEMEN RUMAH SAKIT ===\n");

        // Inisialisasi Objek Pasien dan Dokter
        Pasien pasien1 = new Pasien("Budi Santoso", "Jl. Mawar No. 10", "081234567890", "PSN-001");
        Dokter dokter1 = new Dokter("Siti Aminah", "Jl. Melati No. 5", "089876543210", "Penyakit Dalam");

        // Pasien membuat janji (Appointment)
        Appointment app1 = pasien1.buatJanji(dokter1, "15-05-2026", "APP-1001");
        System.out.println("Status Awal Appointment: " + app1.getIdAppointment() + "\n");

        // Dokter melakukan diagnosis berdasarkan Appointment
        dokter1.mendiagnosis(pasien1, "Nyeri lambung dan mual", app1);

        // Dokter membuat resep (Prescription) dan menambahkan Obat (Medicine)
        Prescription resep1 = dokter1.membuatResep(app1);
        resep1.tambahObat("Antasida Doen", "3 x 1 tablet");
        resep1.tambahObat("Paracetamol", "2 x 1 tablet (jika demam)");
        System.out.println();

        // Pembuatan Tagihan Pembayaran (Payment & PaymentDetail)
        Payment tagihan1 = new Payment("PAY-9901", "15-05-2026");
        tagihan1.tambahDetail("Biaya Konsultasi Dokter Spesialis", 200000.0);
        tagihan1.tambahDetail("Biaya Penebusan Obat", 75000.0);
        tagihan1.tambahDetail("Biaya Administrasi", 25000.0);
        
        System.out.println("Total Tagihan Terkumpul: Rp" + tagihan1.getTotalBayar() + "\n");

        // Memproses Pembayaran menggunakan PaymentService
        PaymentService paymentService = new PaymentService();
        paymentService.prosesPembayaran(tagihan1);
        System.out.println();

        // Simulasi penghapusan resep
        resep1.hapusResep();
    }
}