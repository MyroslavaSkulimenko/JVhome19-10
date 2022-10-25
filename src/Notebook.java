public class Notebook extends Electronics {


    public Notebook(String name, double price) {
        super(name, price);

    }

    @Override
    public String toString() {
        return "Notebook - " +
                "name='" + name + '\'' +
                ", price=" + price
                ;
    }

    public void start() {
        check();
        System.out.println(guaranteeDesign());
    }
}
