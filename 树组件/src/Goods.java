public class Goods {
    String name;
    double price;

    Goods(String n, double p) {
        name = n;
        price = p;
    }

    public String toSpring() {
        return name;
    }
}
