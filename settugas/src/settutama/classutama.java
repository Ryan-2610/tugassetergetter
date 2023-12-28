
package settutama;

public class classutama {
    protected String NICK;
    protected String NIM;
    
     
    void mahasiswa(String NICK, String NIM){
        this.NICK = NICK;
        this.NIM = NIM;
        
        System.out.println("\nData Mahasiswa");
        System.out.println("Nama Mahasiswa: "+this.NICK);
        System.out.println("NIM Mahasiswa : "+this.NIM);
        
    }
}
