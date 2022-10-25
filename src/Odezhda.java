public class Odezhda extends Product{
    public Odezhda(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Odezhda{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public void start(){
        check();
    }
}
