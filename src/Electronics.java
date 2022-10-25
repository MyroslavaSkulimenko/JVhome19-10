public class Electronics extends Product{


    public Electronics(String name, double price) {
        super(name, price);

    }

    @Override
    public String toString() {
        return "Electronics - " + super.toString();
    }
    public double guaranteeDesign(){
        System.out.println("Оформлена гарантия на год.");
        double garant = price *1.1;
        System.out.println("Суммарная стоимость: "+garant);
        return garant;
    }
}
