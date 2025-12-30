public class Main {
    public static void main(String[] args) {
        Builder b=new Builder();
        b.setName("Books");
        b.setColor("Blue");
        b.setPrice(-2);
        b.setQuantity(23);
        Product p=new Product(b);
        System.out.println(b.getPrice());


    }
}
