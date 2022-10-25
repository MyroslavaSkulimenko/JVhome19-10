import java.util.Scanner;

public class Telefon extends Electronics {


    public Telefon(String name, double price) {
        super(name, price);

    }

    @Override
    public String toString() {
        return "Telefon - " +
                "name='" + name + '\'' +
                ", price=" + price
                ;
    }

    public int   contract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для оформления контракта введите - 1");
        int res = (sc.nextInt());
        if (res == 1) {
            System.out.println("Спасибо! Ваш оператор - Телеком!");

        } else {
            System.out.println("Оформление контракта - обязятельное условие для покупки!");
            for (int i = 0; res != 1 && i < 2; i++) {
                System.out.println("Для оформления контракта введите - 1");
                res = (sc.nextInt());
            }
            if (res != 1) {
                System.out.println("Отказ!"); }
        }
       return res;
    }

    public void start() {
        check();
     if  (contract()==1){
         guaranteeDesign();}
     else {
         System.out.println("Извините. Без контракта покупка невозможна!");
     }
    }
}
