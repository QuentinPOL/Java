package packageTest;

public class Point {
    // Attributs
    int abscisse;
    int ordonnee;
    static int nombre = 0; // Compteur global pour les points
    int numero; // Numéro unique pour chaque point

    // Constructeur par défaut
    Point() {
        abscisse = 0;
        ordonnee = 0;
        nombre++; // Incrémente le nombre total de points
        numero = nombre; // Attribue le numéro unique
    }

    // Constructeur avec coordonnées
    Point(int u, int v) {
        abscisse = u;
        ordonnee = v;
        nombre++; // Incrémente le nombre total de points
        numero = nombre; // Attribue le numéro unique
    }

    // méthode permettant de changer les coordonnées d’un point
    void set(int u , int v)
    {
        abscisse = u ;
        ordonnee = v ;
    }

    // méthode permettant de translater un point
    void translate( int u , int v )
    {
        abscisse = abscisse + u ;
        ordonnee = ordonnee + v ;
    }

    public void affiche()
    {
        System.out.println("Point numéro : " + numero +
                " | abscisse : " + abscisse +
                " | ordonnee : " + ordonnee +
                " | Nombre total de points : " + nombre);
    }

    public boolean origine()
    {
        if (this.ordonnee==0 && this.abscisse==0) {
            return true; // 2.
        }
        return false;
    }

    public boolean egale(Point pOther)
    {
        if (pOther.ordonnee == this.ordonnee && pOther.abscisse == this.abscisse) {
            return true; // 2.
        }
        return false;
    }

    Point symetrie() // .4
    {
        return new Point(-this.abscisse, -this.ordonnee);
    }
}
