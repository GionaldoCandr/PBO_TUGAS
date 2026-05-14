class Dokter extends Person {
    private String spesialisasi;

    public Dokter(String nama, String alamat, String nomorTelepon, String spesialisasi) {
        super(nama, alamat, nomorTelepon);
        this.spesialisasi = spesialisasi;
    }

    public void mendiagnosis(Pasien pasien, String keluhan, Appointment appointment) {
        appointment.setKeluhan(keluhan);
        appointment.setStatusPemeriksaan("Selesai Diperiksa");
        System.out.println("dr. " + this.nama + " mendiagnosis pasien " + pasien.getNama() + " dengan keluhan: " + keluhan);
    }

    public Prescription membuatResep(Appointment appointment) {
        System.out.println("dr. " + this.nama + " membuat resep untuk appointment ID: " + appointment.getIdAppointment());
        return new Prescription();
    }

    public String getNama() {
        return nama;
    }
}