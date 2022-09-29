public class FavoriteLanguage {
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

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    
}
