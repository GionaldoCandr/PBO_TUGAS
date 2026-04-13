import java.util.Scanner; 
    
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        Student Student1 = new Student ();
        Student1.name = "Gio";
        Student1.studenId = "031";

        Student1.study();

    }
}


// CLASS
class Student{
    String name;
    String studenId;

    void study (){
        System.out.println(name + " studying "+ studenId );
    }
    void exam (){
        System.out.println(name + "examing");
    }


}


// CONSTRUCTUR

class StudentV2{
    public StudentV2(String nama, String nim){
        this.nama = nama;
        this.nim = nim;

    }

}