import java.util.Scanner; 
    
public class Tester {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);


        Prodi mhs_no_1 = new Prodi("FSIK", "ilmu komputer", "031", "Gionaldo");
        mhs_no_1.tampilkanInfo();

        Prodi mhs_no_2 = new Prodi("FSIK", "ilmu komputer", "030", "robi");
        mhs_no_2.tampilkanInfo();

        
    }
}

