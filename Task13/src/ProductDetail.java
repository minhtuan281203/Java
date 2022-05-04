public class ProductDetail extends Product{
    private int id;
    public ProductDetail(){
        super();
        this.id =1;
    }
    public ProductDetail(int id){
        super();
        this.id=id;
    }
    public ProductDetail(int id, String name, float price, String description){
        super(name,price,description);
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "This is a page Product detail" + " info:" +this.id+ super.getName()+","+ super.getPrice();
    }
}
