/**
 * Бані, компмех, завдання 2.9, лаба 4
 * @author oleksandrbani
 * @version 1.0
 */


package HWs;

import java.util.ArrayList;
import java.util.List;

public class HW7__2_9 {

    private List<Product> products;

    public HW7__2_9() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // а)Список товарів за заданим найменуванням
    public List<Product> getProductsByName(String name) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    // b)Список товарів за заданим найменуванням, ціна яких не перевищує задану
    public List<Product> getProductsByNameAndPrice(String name, double maxPrice) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    // c)Список товарів, термін зберігання яких більше заданого
    public List<Product> getProductsByStorageLife(int minStorageLife) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getStorageLife() > minStorageLife) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    // Метод для виведення списку продуктів
    public void printProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}



