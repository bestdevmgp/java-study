package externalClassEx;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = item;
    }
    
    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            int itemTotal = item.getPrice();
            System.out.println("상품명: " + item.getName() + ", 합계: " + itemTotal);
            total += itemTotal;
        }
        System.out.println("전체 가격 = " + total);
    }
}
