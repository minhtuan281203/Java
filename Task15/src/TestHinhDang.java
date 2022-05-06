public class TestHinhDang {
    public static void main(String[] args) {
        hinhDang s1 = new hChuNhat(1,2);
        System.out.println(s1);
        System.out.println("ARea:"+ s1.getArea());
        System.out.println("\n----------------------------\n");
        hinhDang s2 = new hTamGiac(2,6);
        System.out.println(s2);
        System.out.println("Area:"+ s2.getArea());
    }

}
