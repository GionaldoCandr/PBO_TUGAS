import java.util.Scanner;

public class tugas{
    public static void main(String[] args) {
        System.out.println("==========TUGAS1=========");

        Scanner input = new Scanner(System.in);
            System.out.print("masukkan nama : ");
                String nama = input.nextLine();
            
            System.out.print("masukkan NIM : ");
                String NIM = input.nextLine();

            System.out.print("masukkan usia : ");
                int usia = input.nextInt();

            System.out.print("masukkan tinggi badan : ");
                double tb = input.nextDouble();


        System.out.print("==========OUTPUT=========");
            System.out.print("\n1. hasil dari hitungaan (usia * 2) + 10 / 5 - 3 = " + (usia * 2 + 10 / 5 - 3) );
            System.out.print("\n2. hasil untuk mengecek apakah usia >=18 true atau false = " + (usia >= 18));
            System.out.print("\n3. hasil untuk apakah usia >= 18 dan tinggi badan >= 160 true atau false = " + (usia >= 18 && tb >= 160));
            System.out.print("\n4. hasil dari : "
                             + "\n- konversi usia (int) menjadi Double(casting) = " + (double) usia
                             + "\n- koversi tinggi badan(double) menjadi int(casting) = " + (int) tb);
            
            System.out.print ("\n=========SELESAI============");


        input.close();
    }
}