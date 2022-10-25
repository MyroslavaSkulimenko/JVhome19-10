import java.util.Scanner;

public class Food  extends Product {

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Food - " +
                "name='" + name + '\'' +
                ", price=" + price
                ;
    }

    public void start() {
        check();
       delivery();
    }
    public  void delivery(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Для доставки введите - 1");
        int n = (sc.nextInt()) ;
        if (n==1){
            double res=price*1.05;
            System.out.println("Стоимость с доставкой - "+res);
        } else {
            System.out.println("Спасибо! Стоимость заказа - "+price);
            }
        }
}
