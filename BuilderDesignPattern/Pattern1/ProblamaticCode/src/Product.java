public class Product {
    String  name;
    String Brand;
    int discount;
    int price;
    int createdAt;
    Product(String name,String Brand,int discount,int price,int createdAt){
        this.price=price;
        this.name=name;
        this.createdAt=createdAt;
        this.discount=discount;
        this.Brand=Brand;
    }

}
