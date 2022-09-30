import java.text.DecimalFormat;
import java.util.*;

public class Population {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###,###");
        //Create a map with States as key and population as value;
        Map<String, Integer> population = new HashMap<>();
        population.put("PE", 9616621);
        population.put("AL", 3351543);
        population.put("CE", 9187103);
        population.put("RN", 3534265);

        System.out.println(population);
        // Change RN population for 3.534.165;
        population.put("RN", 3534165);
        System.out.println(population);

        //Verify if PB is present in the dictionary. If not, add 'PB - 4.039.277';
        System.out.println("Is PB State present in the dictionary? " + population.containsKey("PB"));
        population.put("PB", 4039277);
        System.out.println(population);

        //Show the population of PE;
        System.out.println("Population of PE: " + df.format(population.get("PE")) + " inhabitants.");

        //Show all the States and their respective population by the order they are informed;
        Map<String, Integer> population1 = new LinkedHashMap<>();
        population1.put("PE", 9616621);
        population1.put("AL", 3351543);
        population1.put("CE", 9187103);
        population1.put("RN", 3534265);
        population1.put("PB", 4039277);
        System.out.println("--\tDictionary ordered by insertion\t--");
        System.out.println(population1);

        //Show the States in alphabetical order;
        Map<String, Integer> population2 = new TreeMap<>(population1);
        System.out.println("--\tDictionary alphabetically ordered\t--");
        System.out.println(population2);

        //Show the state less populated;
        int minorPopulation = Collections.min(population.values());
        Set<Map.Entry<String, Integer>> entries = population.entrySet();
        String lessPopulatedState = "";
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(minorPopulation))
                lessPopulatedState = entry.getKey();
        }

        System.out.println("--\tLess populated State\t--");
        System.out.println(lessPopulatedState + " - " + df.format(population.get(lessPopulatedState)) + " inhabitants.");

        //Show the State most populated;
        String mostPopulatedState = "";
        int majorPopulation = Collections.max(population.values());
        for (Map.Entry<String, Integer> entry:entries) {
            if (entry.getValue().equals(majorPopulation))
                mostPopulatedState = entry.getKey();
        }
        System.out.println("--\tMost populated State\t--");
        System.out.println(mostPopulatedState + " - " + df.format(population.get(mostPopulatedState)) + " inhabitants.");

        //Show the sum of all the States' populations;
        int sum = 0;
        for (Map.Entry<String, Integer> entry:entries)
            sum += entry.getValue();

        System.out.println("--\tPopulations sum\t--");
        System.out.println(df.format(sum));

        //Calculate and show the mean value of the populations;
        System.out.println("--\tPopulations mean value\t--");
        System.out.println((df.format(sum/entries.size())));

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getValue()<4000000)
                iterator.remove();
        }
        System.out.println("--\t Removal of States with less than 4.000.000 inhabitants\t--");
        System.out.println(population);

        //Remove all the elements of the dictionary;
        System.out.println("--\tRemoval of all the elements of the dictionary...\t--");
        population.clear();


        //Verify if the dictionary is empty;
        System.out.println("Is the dictionary empty? " + population.isEmpty());
    }
}
