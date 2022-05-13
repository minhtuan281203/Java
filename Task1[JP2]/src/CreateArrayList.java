import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        List<String> mxhInter = new ArrayList<>();
        mxhInter.add("Google");
        mxhInter.add("Facebook");
        mxhInter.add("Tiktok");
        mxhInter.add("Instagram");
        mxhInter.add("Zalo");
        System.out.println(mxhInter);
        mxhInter.add(3,"Yahoo");
        System.out.println(mxhInter);
    }
}
