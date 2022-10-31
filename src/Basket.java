public class Basket {
    protected int size;
    private int capacity;
    private Product[]products;
    public Basket(int capacity) {
        this.capacity = capacity;
        products = new Product[capacity];
        size = 0;
    }
    public boolean add(Product product) {
        if (size>=products.length){
            enlarge();
        }
        products[size]=product;
        size++;
        return true;
    }


    private void enlarge() {
        Product[] arr = new Product[products.length * 2];
        for (int i = 0; i < products.length; i++) {
            arr[i] = products[i];
        }
        products = arr;// подменили ссылку на новый массив
    }
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < products.length & i < size; i++) {
            products[i].purchase();
            res.append(products[i]).append(System.lineSeparator());

        }
       return res.append("____________").append(System.lineSeparator()).append("Total: ").append(size).toString();
    }


  /*  public String toString() {
        String res = "";
        for (int i = 0; i < products.length & i < size; i++) {
            products[i].purchase();
            res += products[i] + System.lineSeparator();

        }
        res += "____________" + System.lineSeparator() + "Total: " + size ;
        return res;

    }*/

    public Product get(int index) {
        if (index < size) {
            return products[index];
        } else {
            return null;
        }
    }
    public double sumBasket(){
        double sum=0;
        for (int i = 0; i <size; i++) {
            sum+=get(i).expenses;
        }
        return sum;
    }
}
