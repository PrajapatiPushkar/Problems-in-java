package src.tostringandmath;

public class DiceRoll {
    int roll() {
        double random = Math.random() * 6;
         return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        DiceRoll diceRoll = new DiceRoll();
        for (int i = 0; i < 10; i++) {
            System.out.println(diceRoll.roll());
        }

    }
}
