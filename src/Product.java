public abstract class Product {
    protected String name;
    protected double price;
    protected double expenses;

    public Product(String name, double price, double expenses) {
        this.name = name;
        this.price = price;
        this.expenses = expenses = 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public String toString() {
        return "Chack - " +
                "name='" + name + '\'' +
                ", price=" + price
                ;
    }

    public String getCheck() {
        return "Check : " + toString();// так правильнее
    }

    public void printCheck() {
        System.out.println(getCheck());
    }//каждый метод за свой кусочек

    public abstract void purchase();



}
