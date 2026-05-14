import java.util.ArrayList;
import java.util.List;

class Payment {
    private String idPayment;
    private String tanggalBayar;
    private double totalBayar;
    private String statusPembayaran;
    private List<PaymentDetail> details;

    public Payment(String idPayment, String tanggalBayar) {
        this.idPayment = idPayment;
        this.tanggalBayar = tanggalBayar;
        this.totalBayar = 0.0;
        this.statusPembayaran = "Belum Lunas";
        this.details = new ArrayList<>();
    }

    public void tambahDetail(String namaItem, double biaya) {
        PaymentDetail detail = new PaymentDetail(namaItem, biaya);
        details.add(detail);
        this.totalBayar += biaya; 
    }

    public void setStatusPembayaran(String status) {
        this.statusPembayaran = status;
    }

    public String getIdPayment() {
        return idPayment;
    }
    
    public double getTotalBayar() {
        return totalBayar;
    }
}