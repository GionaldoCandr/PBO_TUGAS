class Pasien extends Person {
    private String nomorPasien;

    public Pasien(String nama, String alamat, String nomorTelepon, String nomorPasien) {
        super(nama, alamat, nomorTelepon);
        this.nomorPasien = nomorPasien;
    }

    public Appointment buatJanji(Dokter dokter, String tanggal, String idAppointment) {
        System.out.println("Pasien " + this.nama + " membuat janji dengan dr. " + dokter.getNama());
        return new Appointment(idAppointment, tanggal, "Belum ada keluhan", "Menunggu");
    }

    public String getNama() {
        return nama;
    }
}