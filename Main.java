import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int password;
        boolean isPasswordsuccess=false;
        Scanner input=new Scanner(System.in);
        while (!isPasswordsuccess){
            System.out.println("Şifreyi Giriniz : ");
            password= input.nextInt();
            if (password==123){
                System.out.println("Doğru");
                isPasswordsuccess=true;
            }else {
                System.out.println("Yanlış");
            }
        }
    }
}