public class Builder {

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

        String getColor(){
            return this.color;

        }
        int getQuantity(){
            return  this.quantity;

        }
        String getName(){
            return this.name;

        }
        int getPrice(){
         return this.price;
        }


    }


