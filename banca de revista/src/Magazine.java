public class Magazine {
    private int stock = 0;
    private double price;
    private String brand;

    public Magazine(String brand, int stock, double price){
        this.brand = brand;
        this.stock = stock;
        this.price = price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
}
