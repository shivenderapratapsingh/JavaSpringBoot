public class Product {
    int price;
    int quantity;
    String name;
    String color;
    void  setPrice(int price){
        this.price=price;
    }
    void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void setName(String Name ){
        this.name=name;
    }

    void getColor(){
        System.out.println("Its color is:"+color);
    }
    void getQuantity(){
        System.out.println("Its Quantity is:"+quantity);
    }
    void Name(){
        System.out.println("Its name is"+name);
    }
    void price(){
        System.out.println("Its price is:"+price);
    }

    public static void main(String[] args) {
        Product soap=new Product();
        soap.setColor("red");
        soap.getColor();
        Product brush=new Product();
        brush.setColor("blue");
        brush.getColor();
        Product chair=new Product();
        chair.setColor("Brown");
        chair.getColor();

    }


}
