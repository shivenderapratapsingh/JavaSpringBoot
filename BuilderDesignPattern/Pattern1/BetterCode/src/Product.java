public class Product {
    int price;
    int quantity;
    String name;
    String color;
    Product(Builder b){
        if(b.getPrice()>0){
           this.price=b.getPrice();
        }
    }
    //we need to do validation before the object is created that's why we need to do these things
}
