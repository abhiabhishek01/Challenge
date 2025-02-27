import java.util.Scanner;

class MultiplicationTableUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculated multiplication table using for loop\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        for(int i = 1 ; i <= 10 ;i++) {
            System.out.println(num+ " X " +i+ " = "+ (i*num));
        }
    }
}
