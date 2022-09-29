import java.util.*;

public class Rainbow {

    public static void main(String[] args) {

        // create a set with the rainbow colors and:
        Set<String> rainbow = new HashSet<>(Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet"));

        // show all the colors of a rainbow one beneath the other;
        for (String color:rainbow)
            System.out.println(color);

        // show the quantity of colors the rainbow has;

        System.out.println("Number of rainbow colors: "+rainbow.size());

        // show the colors in alphabetical order;
        Set<String> rainbow1 = new TreeSet<>(Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet"));
        System.out.println("\nRainbow colors in alphabetical order:\n"+rainbow1);

        // show the rainbow colors in the reverse order they are informed;

        Set<String> rainbow2 = new LinkedHashSet<>(Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet"));
        List<String> reverseRainbow = new ArrayList<>(rainbow2);
        Collections.reverse(reverseRainbow);
        System.out.println("\nColors in the reverse order informed:\n" + reverseRainbow);

        // show all the colors starting with the letter 'v';
        for (String color : rainbow){
            if (color.charAt(0) == 'v')
                System.out.println("\nColors that start with the letter 'v': "+color);
        }

        // remove all the colors that do not start with the letter 'v';

        Iterator<String> iterator = rainbow.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.charAt(0)!='v')
                iterator.remove();
        }
        System.out.println("Set only with 'v' colors:\n"+rainbow);

        // clean the set;

        rainbow.clear();

        //verify if the set is empty;
        System.out.println(rainbow.isEmpty());


    }
}
