import java.util.Scanner;

class PrimeOrNotLoop {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.println("Welcome to check number is prime or not\n");
         System.out.print("Enter your number: ");
         int num = input.nextByte();
         boolean prime = isPrime(num);
         System.out.println("Your number is " + (isPrime(num) ? "Prime" : "not prime"));

     }

     public static boolean isPrime(int num ) {
         for (int i = 2 ; i < num ; i++){
             if (num % i == 0) {
                 return false;
             }
         }
         return true;
     }
}
