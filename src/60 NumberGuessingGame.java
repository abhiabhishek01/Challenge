import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("welcome to Number guessing game:\n ");
        do {
            System.out.print("Please Guess the number between 0 to 10: ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("your guess is correct "+guess);
    }
}
