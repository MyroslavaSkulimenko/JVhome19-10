import java.util.Scanner;

public class Telefon extends Electronics {


    public Telefon(String name, double price, double expenses) {
        super(name, price, expenses);
    }

    @Override
    public String toString() {
        return "Telefon - " +
                "name='" + name + '\'' +
                ", price=" + price +" Оформлена гарантия на год. Стоимость = "
        +( guaranteeDesign()-price)+System.lineSeparator()+"Сумма =  "+expenses
                ;
    }
    public int   contract() {
        if(isContract()){System.out.println("Спасибо! Ваш оператор - Телеком!");}
        else {
            System.out.println("Отказ!");
        }
        return 1;}
    public boolean   isContract() {
        Scanner sc = new Scanner(System.in);
        int res=0;
        for (int i = 0; i <3 ; i++) {
            System.out.println("Для оформления контракта введите - 1");
            res = sc.nextInt();
            if (res==1){return true; }break;
        }return false;

    }

    public void purchase() {
        printCheck();
     if  (contract()==1){
         guaranteeDesign();}
     else {
         System.out.println("Извините. Без контракта покупка невозможна!");
     }
    }
}
