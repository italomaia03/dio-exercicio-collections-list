import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // put favorite languages in a set and show them in the order of insertion;
        Set<FavoriteLanguage>favoriteLanguages = new LinkedHashSet<>();
        favoriteLanguages.add(new FavoriteLanguage("java","intellij community", 1991));
        favoriteLanguages.add(new FavoriteLanguage("python","jupyter notebook", 1989));
        favoriteLanguages.add(new FavoriteLanguage("javascript","visual studio code", 1995));

        System.out.println(favoriteLanguages);

        // show the items ordered by name;
        Set<FavoriteLanguage> favoriteLanguages1 = new TreeSet<>(favoriteLanguages);
        System.out.println("\n--\tNames ordered\t--");
        for(FavoriteLanguage language : favoriteLanguages1){
            System.out.println(language.getName() + " - " + language.getIde() + " - " + language.getCreationYear());
        }

        // show the items ordered by IDE;
        Set<FavoriteLanguage> favoriteLanguages2 = new TreeSet<>(new CompareIde());
        favoriteLanguages2.addAll(favoriteLanguages);
        System.out.println("\n--\tIDEs ordered\t--");
        for(FavoriteLanguage language : favoriteLanguages2){
            System.out.println(language.getIde() + " - " + language.getName() + " - " + language.getCreationYear());
        }

        // show the items ordered by creation year;
        Set<FavoriteLanguage> favoriteLanguages3 = new TreeSet<>(new CompareYear());
        favoriteLanguages3.addAll(favoriteLanguages);
        System.out.println("\n--\tYears ordered\t--");
        for(FavoriteLanguage language : favoriteLanguages3){
            System.out.println(language.getCreationYear() + " - " + language.getName() + " - " + language.getIde());
        }

    }
}
