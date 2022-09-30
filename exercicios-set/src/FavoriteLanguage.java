import java.util.Comparator;
import java.util.Objects;

public class FavoriteLanguage implements Comparable<FavoriteLanguage> {
    private String name, ide;
    private int creationYear;

    public FavoriteLanguage(String name, String ide, int creationYear) {
        setName(name);
        setIde(ide);
        setCreationYear(creationYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "Language = " + name + "\n" +
                "IDE = " + ide  + "\n" +
                "Creation Year = " + creationYear + "\n";
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || o.getClass() != this.getClass())
            return false;
        FavoriteLanguage favoriteLanguage = (FavoriteLanguage) o;
        return (favoriteLanguage.getName() == getName() && favoriteLanguage.getIde() == getIde() && favoriteLanguage.getCreationYear() == getCreationYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ide, creationYear);
    }

    @Override
    public int compareTo(FavoriteLanguage favoriteLanguage) {
        //compare names;
        int name = getName().compareTo(favoriteLanguage.getName());
        //check if names are different;
        if (name != 0)
            return name;
        //if names are the same, compare ides;
        int ide = getIde().compareTo(favoriteLanguage.getIde());
        if (ide != 0)
            return ide;
        //if names and ides are the same, compare year of creation;
        return Integer.compare(getCreationYear(),favoriteLanguage.getCreationYear());
    }
}

class CompareIde implements Comparator<FavoriteLanguage>{
    @Override
    public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2) {
        int ide = fl1.getIde().compareTo(fl2.getIde());
        if (ide != 0)
            return ide;

        int name = fl1.getName().compareTo(fl2.getName());
        if (name != 0)
            return name;

        return Integer.compare(fl1.getCreationYear(), fl2.getCreationYear());
    }
}

class CompareYear implements Comparator<FavoriteLanguage>{
    @Override
    public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2) {

        int year = Integer.compare(fl1.getCreationYear(), fl2.getCreationYear());
        if (year != 0)
            return year;

        int ide = fl1.getIde().compareTo(fl2.getIde());
        if (ide != 0)
            return ide;

        return fl1.getName().compareTo(fl2.getName());


    }
}
