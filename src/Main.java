
public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(4, 1);
        Point p2 = new Point(16, 11);

        p1.printPoint();

        p1.center(p2);

        Point p3 = p1.center(p2);

        p3.printPoint();
    }

}

