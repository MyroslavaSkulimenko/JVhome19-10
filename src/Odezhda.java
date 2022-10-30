public class Odezhda extends Product{
    public Odezhda(String name, double price, double expenses) {
        super(name, price, expenses);
    }

    @Override
    public String toString() {
        return "Odezhda - " +
                "name='" + name + '\'' +
                ", price=" + price;
    }
    public void start(){
        check();
        setExpenses(price);
    }
}
