public class Product {
    private int price;

    private String name;

    private String category;

    private int discount;

    private  String createdAt;

   private Product(Builder b){
        if(b.getPrice()>10){
            this.price=b.getPrice();
        }
        this.name=b.getName();
        this.discount=b.getDiscount();
        this.category=b.getCategory();
        this.createdAt=b.getCreatedAt();
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int price;

        private String name;

        private String category;

        private int discount;

        private  String createdAt;

        public Product Build(){
            return new Product(this);
        }

        Builder setPrice(int price){
            this.price=price;
            return this;
        }

         Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

         Builder setCategory(String category) {
            this.category = category;
            return  this;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public int getDiscount() {
            return discount;
        }

        public int getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }

        public String getName() {
            return name;
        }

        Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
