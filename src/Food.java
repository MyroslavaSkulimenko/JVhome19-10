import java.util.Scanner;

public class Food  extends Product {

    public Food(String name, double price,double expenses ) {
        super(name, price,expenses);
    }


    @Override
    public String toString() {
        return "Food - " +
                "name='" + name + '\'' +
                ", price=" + price+" "+"Стоимость с доставкой  = "+ expenses;

    }

    public void purchase() {
        printCheck();
       delivery();
    }
    public  double delivery(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Для доставки введите - 1");
        int n = (sc.nextInt()) ;
        if (n==1){
            double res=price*1.05;
            setExpenses(res);
            System.out.println("Стоимость с доставкой - "+expenses);
            return expenses;
        } else {
            setExpenses(price);
            System.out.println("Спасибо! Стоимость заказа - "+price);
            }
        return price;
        }
}
