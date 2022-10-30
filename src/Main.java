public class Main {
    public static void main(String[] args) {
        /*Допустим, у нас есть магазин. В нашем магазине есть товары трёх категорий: продукты, электроника(мобильные телефоны и ноутбуки), одежда. У каждого товара есть цена и наименование . Каждый товар можно купить (покупателю выставляется счет).
при покупки продуктов выставляется дополнительная цена за срочность доставки.
при покупке электроники, покупателю оформляют гарантию (т.е. при покупке должен выполнятся метод “Оформить гарантию”)
телефоны продаются только с контрактом оператора (т.е. при покупке должен выполнятся метод “Оформить контракт”)
Необходимо создать соответствующую структуру классов метод покупки товара*/

        Telefon t1 = new Telefon("Nokia", 120,0);
       // t1.start();
        Notebook n1 = new Notebook("ZTE", 700,0);
       // n1.start();
        Food banana = new Food("banana", 1.25,0);
      //  banana.start();
        Odezhda o1=new Odezhda("Coat",112,0);
      //  o1.start();
        Product f1=new Food("kivi",0.87,0);
        Product[]arr={n1,t1,o1,f1,banana};
        for (Product p:arr){
            System.out.println(p.name+p.price);
        }
        double sum=0;
        Basket basket1=new Basket(10);
        basket1.add(new Food("kivi",1.20,0));
        basket1.add(new Food("fresh",1.80,0));
        basket1.add(new Food("aple",2.20,0));
        basket1.add(new Telefon("nokia",780,0));
        basket1.add(new Telefon("nokia2233",800,0));
        basket1.add(new Notebook("Nout1",1000,0));
        basket1.add(new Odezhda("Coat",230,0));
        System.out.println(basket1.toString());
        System.out.println("сумма заказа = "+basket1.sumBasket());
    }

}