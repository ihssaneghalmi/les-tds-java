package td2;

public class ex1 {
    public static void main(String[] args) {
        // Utilisation de la classe Point
        Point point = new Point(3, 5);
        point.deplace(2, -1);
        System.out.println("Coordonnées du point : (" + point.getX() + ", " + point.getY() + ")");

        // Utilisation de la classe dérivée PointA
        PointA pointA = new PointA(1, 1);
        pointA.deplace(3, 2);
        pointA.affiche();
    }
}
class PointA extends Point {
    public PointA(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
}
class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x,y;
}

