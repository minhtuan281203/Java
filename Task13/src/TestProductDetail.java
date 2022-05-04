public class TestProductDetail {
    public static void main(String[] args) {
        ProductDetail pd1 = new ProductDetail();
        System.out.println(pd1.toString());
        ProductDetail pd2 = new ProductDetail(1,"SamSung",5.0f,"good");
        System.out.println("i4 Pro:" + pd2.toString());
    }

}
