public class hChuNhat implements hinhDang{
    private int length,width;
    public hChuNhat(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
