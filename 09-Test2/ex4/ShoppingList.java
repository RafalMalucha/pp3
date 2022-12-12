import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> list = new ArrayList<Product>();

    public void add(Product product){
        list.add(product);
    }

    public String toString(){
        String str = "";

        for (Product product : list) {
            str += product.getName() + ",";
        }

        return str.substring(0, str.length() - 1);
    }

    public int total(){
        int counter = 0;
        for (Product product : list) {
            counter += product.getQuantity();
        }
        return counter;
    }
}
