import java.lang.reflect.Array;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

//    public int getXY(int n) {
//        int[] xy;
//        xy = new int[2];
//        xy[1] = this.x;
//        xy[2] = this.y;
//        return xy[n];
//    }

    public void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

    public Point center(Point other) {

        Point p = new Point((x + other.x) / 2, (y + other.y) / 2);

        return p;
    }

}
