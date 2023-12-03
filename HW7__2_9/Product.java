/**
 * Бані, компмех, завдання 2.9, лаба 4
 * @author oleksandrbani
 * @version 1.0
 */
package HWs;

public class Product {
    private int id;
    private String name;
    private String upc;
    private String manufacturer;
    private double price;
    private int storageLife;
    private int quantity;
    // Конструктори
    public Product(int id, String name, String upc, String manufacturer, double price, int storageLife, int quantity) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storageLife = storageLife;
        this.quantity = quantity;
    }
 
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getUpc() {
        return upc;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStorageLife(int storageLife) {
        this.storageLife = storageLife;
    }

    public int getStorageLife() {
        return storageLife;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    // toString()
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", upc='" + upc + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", storageLife=" + storageLife +
                ", quantity=" + quantity +
                '}';
    }
}
