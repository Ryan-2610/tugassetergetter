package settutama;
        
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            
            System.out.println("Data Mahasiswa");
            System.out.print("Masukan Nama Mahasiswa: ");
            String NICK = input.nextLine();
            System.out.print("Masukan NIM Mahasiswa: ");
            String NIM = input.nextLine();
            
            classutama cls = new classutama();
            cls.mahasiswa(NICK, NIM);
    }
}
