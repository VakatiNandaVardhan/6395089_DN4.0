import java.util.*;

public class ProductSearch {
    public static List<String> search(List<String> products, String keyword) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> products = Arrays.asList(
            "Laptop",
            "Smartphone",
            "Tablet",
            "Headphones",
            "Smartwatch",
            "Bluetooth Speaker",
            "Wireless Mouse",
            "Gaming Keyboard"
        );
        List<String> found = search(products, "smart");
        for (String p : found) {
            System.out.println(p);
        }
    }
}
