import java.util.Scanner;

class ExitOnExit {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while (true){
             System.out.print("Enter your command ");
             String comm = input.next();
             if (comm.equalsIgnoreCase("Exit")){
                 break;
             }
         }
         System.out.println("You have successfully exit.");
     }
}
