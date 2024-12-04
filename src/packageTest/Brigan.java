package packageTest;

public class Brigan extends Humain{
    // Attributs (par défaut)
    private String look = "Méchant";
    private int nbDamesEnlever = 0;
    private float recompenseOfferte = (float)100.0;
    private boolean inJail = false;

    // Constructeur sans boisson  (pas défaut)
    Brigan(String name) {
        super(name);


    }

    // Constructeur avec tout les attributs
    Brigan(String name, String favoriteSoda) {
        super(name, favoriteSoda);


    }
}
