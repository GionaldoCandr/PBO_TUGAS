import java.util.ArrayList;
import java.util.List;
class Prescription {
    private List<Medicine> medicines;

    public Prescription() {
        this.medicines = new ArrayList<>(); 
    }

    public void tambahObat(String namaObat, String dosis) {
        Medicine obat = new Medicine(namaObat, dosis);
        medicines.add(obat);
        System.out.println("Obat " + namaObat + " ditambahkan ke dalam resep.");
    }
    
    public void hapusResep() {
        medicines.clear(); 
        System.out.println("Resep dihapus beserta seluruh obat di dalamnya.");
    }
}