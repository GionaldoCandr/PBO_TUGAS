public class Fakultas  {
    private String namaFakultas;
    private String namaProdi;


    public Fakultas(String namaFakultas, String namaProdi) {
        this.namaFakultas = namaFakultas;
        this.namaProdi = namaProdi;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    public String getnamaProdi() {
        return namaProdi;
    }

    public void setnamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }


    public void tampilkanInfo() {
        System.out.println("Fakultas: " + getNamaFakultas());
        System.out.println("Program Studi: " + getnamaProdi());
    }


}
