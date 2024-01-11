package td2;

public class ex2 {
    public static void main(String[] args) {
        // Utilisation de la classe PointNom
        PointNom pointNom = new PointNom(3, 5, 'A');
        pointNom.affCoordNom();

        // Déplacement du pointNom
        pointNom.deplace(2, -1);
        pointNom.affCoordNom();

        // Définition du nom uniquement
        pointNom.setNom('B');
        pointNom.affCoordNom();

        // Définition des coordonnées et du nom
        pointNom.setPointNom(1, 1, 'C');
        pointNom.affCoordNom();
    }
}
class PointNom extends Point {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }
    public void setPointNom(int x, int y, char nom) {
        super.deplace(x - this.getX(), y - this.getY());
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + this.getX() + " " + this.getY() + ", Nom : " + nom);
    }
}
class Pointee {
    private int x, y;

    public Pointee(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }


    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " "+y);
}
}

