package packageTest;

public class Brigan extends Humain{
    // Attributs (par défaut)
    private String look = "Méchant";
    private int nbDamesEnlever = 0;
    private float recompenseOfferte = (float)100.0;
    private boolean inJail = false;

    // Constructeur sans boisson  (pas défaut)
    Brigan(String name, String look, float recompenseOfferte) {
        super(name);
        this.look = look;
        this.recompenseOfferte = recompenseOfferte;
    }

    // Constructeur avec tout les attributs
    Brigan(String name, String favoriteSoda, String look, float recompenseOfferte) {
        super(name, favoriteSoda);
        this.look = look;
        this.recompenseOfferte = recompenseOfferte;
    }

    // Méthode pour kidnapper une dame
    void kidnapperDame(Dame dame)
    {
        System.out.println("Ah ah ! (" + dame.getName() + "), tu es mienne désormais !");
        dame.isKidnapped(this);
    }

    // Méthode d'emprisonnement par un cowboy
    void isJailed(Cowboy cowboy)
    {
        System.out.println("Damned, je suis fait ! (" + cowboy.getName() + ") tu m’as eu !");
        System.out.println("La récompense offerte est de " + this.getRecompenseOfferte() + "$ !");
    }

    // Connaître la récompense lors de la capture par un cowboy
    float getRecompenseOfferte()
    {
        return this.recompenseOfferte;
    }
}
