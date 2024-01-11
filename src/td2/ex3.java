package td2;

public class ex3 {
    public static void main(String[] args) {

    }

}
class PointB extends PointA{
    public PointB(int x, int y) {
        super(x, y);

    }
}

class PointC {

}

class Pointb{

    public Pointb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    private int x, y;
    public int testvar;
}

