public class test {
    public static void main(String[] args) {
        Product p1 = new Product("product1", 3);
        Product p2 = new Product("product2", 5);

        ShoppingList s1 = new ShoppingList();
        s1.add(p1);
        s1.add(p2);
        System.out.println(s1.toString());
        System.out.println(s1.total());
    }
}
