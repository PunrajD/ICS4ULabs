import java.util.Random;

public class Loop6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int die1, die2;
        do {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            System.out.println("Roll: " + die1 + " " + die2);
        } while (die1 != die2);
    }
}