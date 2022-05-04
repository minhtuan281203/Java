public class Product {
    private String name, description;
    private float price;
    public Product(){
        this.price=2.0f;
    }
    public Product(String name, float price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{ name:"+ name + ", price:"+price +",des:"+ description;
    }
}
