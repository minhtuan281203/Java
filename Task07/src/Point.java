public class Point {
    private int x = 0;
    private int y = 0;

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "("+ x + "," + y + ")";
    }

    public int[] getXY(){
        int arr = new arr[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    public void setXY(int x, int y){
        thi
    }
}
