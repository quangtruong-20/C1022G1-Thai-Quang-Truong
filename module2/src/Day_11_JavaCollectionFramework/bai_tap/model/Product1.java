package Day_11_JavaCollectionFramework.bai_tap.model;

public class Product1 implements Comparable<Product1> {
    private String name;
    private int id ;
    private int price;

    public Product1() {
    }

    public Product1(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product1 o) {
        return this.price - o.price;
    }
}
