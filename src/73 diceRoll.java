class dice {

    int roll() {
       double random = Math.random() * 6 ;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        dice dice = new dice();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
