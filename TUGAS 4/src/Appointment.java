class Appointment {
    private String idAppointment;
    private String tanggalPemeriksaan;
    private String keluhan;
    private String statusPemeriksaan;

    public Appointment(String idAppointment, String tanggalPemeriksaan, String keluhan, String statusPemeriksaan) {
        this.idAppointment = idAppointment;
        this.tanggalPemeriksaan = tanggalPemeriksaan;
        this.keluhan = keluhan;
        this.statusPemeriksaan = statusPemeriksaan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void setStatusPemeriksaan(String statusPemeriksaan) {
        this.statusPemeriksaan = statusPemeriksaan;
    }

    public String getIdAppointment() {
        return idAppointment;
    }
}