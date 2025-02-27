import java.util.Scanner;

class PasswordChecker {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to set your  password\n");
         String password;
         do {
             System.out.print("Please enter your password: ");
             password = input.next();
         }while ( isValid(password));
         System.out.println("Thanks for entering your valid  password");

     }


     public static boolean isValid(String password){
         return password.length() < 6;
     }
}
