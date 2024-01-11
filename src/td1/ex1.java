package td1;

public class ex1 {
    public static void main(String[] args) {
        // Création d'un point
        Point p = new Point('A', 1.0);

        // Affichage du point
        p.affiche();

        // Translation du point
        p.translate(2.0);

        // Affichage du point déplacé
        p.affiche();
    }
}
 class Point {

    private char nom;
    private double abscisse;

    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void affiche() {
        System.out.println("Nom : " + nom + ", abscisse : " + abscisse);
    }

    public void translate(double translation) {
        abscisse += translation;

    }
}
