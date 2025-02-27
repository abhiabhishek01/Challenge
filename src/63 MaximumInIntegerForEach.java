
class MaximumInIntegerForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to finding maximum in a integer\n");
        int [] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if (max < num) {
                max = num ;
            }
        }
        System.out.println("Your max number is " +max);
    }
}
