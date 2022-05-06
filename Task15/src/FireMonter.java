public class FireMonter extends Monter{
    public FireMonter(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire";
    }
}
