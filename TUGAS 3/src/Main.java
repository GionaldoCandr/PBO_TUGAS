public class Main {
    public static void main(String[] args) {
        System.out.println("==== SISTEM SIVITAS AKADEMIKA ====\n");

        // 1. Membuat objek Dosen
        Dosen dosen1 = new Dosen("Dr. Budi Santoso", 45, "0011223344");
        dosen1.tampilkanInfo();
        System.out.println();

        // 2. Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Andi Pratama", 20, "10522001", 3.75);
        mhs1.tampilkanInfo();
        System.out.println();

        // 3. Membuat objek Asisten Praktikum
        AsistenPraktikum asprak1 = new AsistenPraktikum("Siti Aminah", 21, "10522045", 3.90, "Pemrograman Berorientasi Objek", 1500000.0);
        asprak1.tampilkanInfo();
    }
}