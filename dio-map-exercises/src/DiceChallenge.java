import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
public class DiceChallenge {
    public static void main(String[] args) {
        Random dice = new Random();
        Map<String, Integer> storage = new LinkedHashMap<>();
        for (int i = 1; i<=100; i++){
            storage.put(i+"º throw",dice.nextInt(6)+1);
        }
        System.out.println(storage);
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        for (int value:storage.values()){
            if (value == 1)
                counter1 ++;
            else if (value == 2)
                counter2 ++;
            else if (value == 3)
                counter3 ++;
            else if (value == 4)
                counter4 ++;
            else if (value == 5)
                counter5 ++;
            else
                counter6 ++;
        }
        System.out.println("Number of times each side of the dice was stored:");
        System.out.println("Number 1 - " + counter1 + " times.");
        System.out.println("Number 2 - " + counter2 + " times.");
        System.out.println("Number 3 - " + counter3 + " times.");
        System.out.println("Number 4 - " + counter4 + " times.");
        System.out.println("Number 5 - " + counter5 + " times.");
        System.out.println("Number 6 - " + counter6 + " times.");
    }
}
