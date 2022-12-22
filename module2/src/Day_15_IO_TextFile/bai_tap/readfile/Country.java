package Day_15_IO_TextFile.bai_tap.readfile;

public class Country {
    private int id;
    private String shortName;
    private String name;

    public Country() {
    }

    public Country(int id, String shortName, String name) {
        this.id = id;
        this.shortName = shortName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
