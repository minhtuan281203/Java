public class StoneMonter extends Monter{
    public StoneMonter(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stone";
    }
}
