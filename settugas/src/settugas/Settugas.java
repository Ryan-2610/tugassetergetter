
package settugas;

import java.util.Scanner;


class user{
    protected String username;
    protected String password;
    
    void register(String username, String password){
        this.username = username;
        this.password = password;
            
            System.out.println("User: "+ this.username);
            System.out.println("Password: "+ this.password);
            System.out.println("User created by User :)");
    }
    
        
    }


class admin extends user{
    private final String role = "admin";

    @Override
    void register(String username2, String password2){
        
        this.username = username2;
        this.password = password2;
        System.out.println("Username Admin: "+username2);
        System.out.println("Password Admin: "+password2);
        System.out.println("User created by "+role);   
    }
}



public class Settugas {

    public static void main(String[] args) {
        
 Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username: ");
       String username = input.nextLine();
        System.out.print("Masukan Password: ");
       String password = input.nextLine();       
        user user1 = new user();
        user1.register(username, password);



        System.out.print("\nMasukan Username Admin: ");
        String username2 = input.nextLine();
        System.out.print("Masukan Password Admin: ");
        String password2 = input.nextLine();

    user user2 = new admin();
    user2.register(username2, password2);


        
    }

}