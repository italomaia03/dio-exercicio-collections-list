import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Detective {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Character> answers = new ArrayList<>();

        System.out.println("\tAnswer the following questions with Y - Yes, or N - No");
        System.out.println("\t\tDid you call the victim?");
        answers.add(input.next().toUpperCase().charAt(0));
        System.out.println("\t\tHave you been to the crime scene?");
        answers.add(input.next().toUpperCase().charAt(0));
        System.out.println("\t\tDo you live close to the victim?");
        answers.add(input.next().toUpperCase().charAt(0));
        System.out.println("\t\tDid you own any quantity of money to the victim?");
        answers.add(input.next().toUpperCase().charAt(0));
        System.out.println("\t\tHave you ever worked with the victim?");
        answers.add(input.next().toUpperCase().charAt(0));

        System.out.println("\n"+answers);
        Iterator<Character> iterator = answers.iterator();
        
        int verdict = 0;
        while (iterator.hasNext()){
            Character next = iterator.next();
            if (next.equals('Y'))
                verdict ++;
        }
        if (verdict == 2)
            System.out.println("Suspect");
        else if (verdict == 3 || verdict == 4)
            System.out.println("Accomplice");
        else if (verdict == 5)
            System.out.println("Murderer");
        else if (verdict == 0)
            System.out.println("Innocent");


    }
}