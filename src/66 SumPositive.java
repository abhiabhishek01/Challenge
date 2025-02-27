import java.util.Scanner;

class SumPositive {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Welcome to adding positive numbers.");
        int [] nums = ArrayUtility.inputArray();

        int sum = 0 ;
        for (int num : nums){
            if (num < 0){
                continue;
            }
            sum += num;
        }
          System.out.println("Your sum is "+sum);
    }
}
