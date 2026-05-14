public class Prodi extends Fakultas{
    private String id_mhs;  
    private String nama_mhs;



    public Prodi(String namaFakultas, String namaProdi,String id_mhs, String nama_mhs){
        super(namaFakultas, namaProdi);
        this.id_mhs = id_mhs;
        this.nama_mhs = nama_mhs;
    }
    


    public String getid_mhs (){
        return id_mhs;
    }

    public void setid_mhs(String id_mhs){
        this.id_mhs = id_mhs;
    }


    public String getnama_mhs(){
        return nama_mhs;
    }

    public void setnama_mhs(String nama_mhs){
        this.nama_mhs = nama_mhs;
    }



    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("ID Mahasiswa : " + this.id_mhs);
        System.out.println("Nama Mahasiswa : " + this.nama_mhs);
    }



}
