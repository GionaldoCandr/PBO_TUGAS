class PaymentService {
    
    public void prosesPembayaran(Payment payment) {
        System.out.println("Memproses pembayaran ID: " + payment.getIdPayment() + " dengan total: Rp" + payment.getTotalBayar());
        payment.setStatusPembayaran("Lunas");
        System.out.println("Status pembayaran berhasil diubah menjadi Lunas.");
    }
}