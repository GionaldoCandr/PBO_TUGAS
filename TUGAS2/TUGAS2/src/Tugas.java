import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        // 1. Deklarasi Array
        int[] nilaiMahasiswa = new int[jumlah];

        // 2. Perulangan untuk Input Nilai
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int tempNilai = input.nextInt();

            // 3. Perbandingan (Validation)
            if (tempNilai < 0 || tempNilai > 100) {
                System.out.println("Nilai tidak valid! Masukkan antara 0-100.");
                i--; // Mengulang input untuk indeks yang sama
            } else {
                nilaiMahasiswa[i] = tempNilai;
            }
        }

        // --- KERJAKAN LOGIKA DI BAWAH INI ---
        // 4. Hitung Rata-rata, Tertinggi, Terendah

        System.out.println("----HASIL ANALISIS----");
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int jumlahDiatasRata = 0;
        for (int i = 0 ; i < jumlah ; i++){
            if ( nilaiMahasiswa[i] >= 76 && nilaiMahasiswa[i] <= 100){
                System.out.println("Mahasiswa ke-" + (i + 1) + " Lulus");
                jumlahLulus += 1;
            }else if ( nilaiMahasiswa[i] >= 0 && nilaiMahasiswa[i] <= 75){
                System.out.println("Mahasiswa ke-" + (i + 1) + " Tidak Lulus");
                jumlahTidakLulus += 1;
            }else {
                System.out.println("data tidak valid");
            }
        }

        System.out.println("----------------------");
        if (jumlah > 0) {
            int totalNilai = 0;
            for (int i = 0; i < jumlah; i++) {
                totalNilai += nilaiMahasiswa[i];
            }
            double rataRata = (double) totalNilai / jumlah;
            int tertinggi = nilaiMahasiswa[0];
            int terendah = nilaiMahasiswa[0];
            for (int i = 1; i < jumlah; i++) {
                if (nilaiMahasiswa[i] > tertinggi) {
                    tertinggi = nilaiMahasiswa[i];
                }
                if (nilaiMahasiswa[i] < terendah) {
                    terendah = nilaiMahasiswa[i];
                }
                if (nilaiMahasiswa[i] > rataRata) {
                    jumlahDiatasRata += 1;
                }
            }
            
        
                    
            // 5. Tampilkan Hasil dan Status Kelulusan
            
            

            System.out.println("Rata-rata: " + rataRata);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            System.out.println("Mahasiswa diatas rata-rata: " + jumlahDiatasRata);
            System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
            System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
        
            
        }





            input.close();
    }
}