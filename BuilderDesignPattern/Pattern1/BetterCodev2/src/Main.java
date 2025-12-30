public class Main {
    public static void main(String[] args) {
//        Builder b=new Builder();
//        b.setPrice(100);
//        b.setName("Books");
//        b.setCategory("Sci-Fi");
//        Product Books=new Product(b); they can't able to pass the irrelevant things here
        Product p=Product.getBuilder()
                .setPrice(100)
                .setDiscount(10)
                .setCategory("Sci-fi")
                .setCreatedAt("12")
                .Build();
    }
}
//we first of all made our product constructor private so that user can access this or can;t able to make mistake of passing
//a null to overcome this problem we make it private and try pass it on our own then we create get Builder method
//which give us the object of builder class now stay with me here comers thing but till now we not make a object of Produce which
//  we don;t want to make because we need to make object after the validation of the value.so every time we pass value or set we retunr the builder object
// or can be said the current object so that after all the value passed we can called Build method which require the object of Builder Class
//Before creating the object of product class we did the validation than assign the value .

//Problem which we faced earlier here solved
//->We can solve Problem by passing value in HashMap But still it create Problem of Key suppose
//User enter the wrong value so we need to make sure that user don't make mistake
//->Then we came up with Builder class method it is kind of good but still there is problem
//we our passing  Product Books=new Product(b); builder object in Product constructor but by mistake user enter null it create huge problem
//to overcome this problem we handle this problem on our own which i mentioned earlier.