package classes;

public class ClassEx4 {

    class ProductOrder {
        String item;
        int price;
        int quantity;

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public ProductOrder(String item, int price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }
    }
}
