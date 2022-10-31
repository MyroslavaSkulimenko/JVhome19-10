public class Notebook extends Electronics {


    public Notebook(String name, double price, double expenses) {
        super(name, price, expenses);
    }

    @Override
    public String toString() {
        return "Notebook - " +
                "name='" + name + '\'' +
                ", price=" + price+" Оформлена гарантия на год.Стоимость =  "
                +( guaranteeDesign()-price)+System.lineSeparator()+"Сумма =  "+expenses
                ;
    }

    public void purchase() {
        printCheck();
       // System.out.println(guaranteeDesign());
    }
}
