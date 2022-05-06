public class WaterMonter extends  Monter{
    public WaterMonter(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water";
    }
}
