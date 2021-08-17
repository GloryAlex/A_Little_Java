public abstract class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract int distanceToO();

    boolean closerToO(Point p) {
        return distanceToO() <= p.distanceToO();
    }

    public static void main(String[] args) {
        System.out.println(new CartesianPt(3, 4).closerToO(new CartesianPt(12, 5)));

    }
}

class CartesianPt extends Point {
    public CartesianPt(int x, int y) {
        super(x, y);
    }

    //    int x;
//    int y;
//
//    public CartesianPt(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
    @Override
    int distanceToO() {
        return (int) Math.sqrt(x * x + y * y);
    }
}

class ManhattanPt extends Point {
    public ManhattanPt(int x, int y) {
        super(x, y);
    }
    @Override
    int distanceToO() {
        return x + y;
    }
}
