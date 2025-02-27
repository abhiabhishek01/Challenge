import java.util.Scanner;

class guessingGame {

    int random ;

     guessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

//    /**
//     *
//     * @param GuessNumber the number that player guessed
//     * @return
//     * - Negative if the guessed number is smaller
//     * - 0 if the guessed number is correct
//     * - Positive if the guessed number is higher.
//     */

    int guess(int GuessNumber){
            return GuessNumber - random;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        guessingGame game = new guessingGame();
        System.out.println("Welcome to guessing game , Guess the number between 1 to 100");
        int guess;
        int result;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("Congrats, your guess number is correct ");
            } else if (result < 0){
                System.out.println("Please guess higher: ");
            } else  {
                System.out.println("Please guess lower: ");
            }
        } while (result != 0);
    }
}
