import java.util.Scanner;

class CalculatorSwitch {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter First number:");
         int firstNum = input.nextInt();
         System.out.print("Enter second number:");
         int secondNum = input.nextInt();

         System.out.print("Enter the operation");
         String  operation = input.next();

         int result =  switch (operation){
             case "+" -> firstNum+secondNum;
             case "-" -> firstNum-secondNum;
             case "*" -> firstNum*secondNum;
             case "/" -> firstNum/secondNum;
             default -> -1;

         };
         System.out.println("Your answer is: " +result);
     }
}
