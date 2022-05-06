public class TestMonter {
    public static void main(String[] args) {
        Monter m1 = new FireMonter("fm1");
        Monter m2 = new WaterMonter("wm1");
        Monter m3= new StoneMonter("sm1");
        System.out.println(m1.toString());
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        Monter m4 = new Monter("uuu2"){
            @Override
            public String attack() {
                return null;
            }
        };
        System.out.println(m4.attack());
    }

}
