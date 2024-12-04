package packageTest;

public class Brigan extends Humain{
    // Attributs (par défaut)
    private String look = "Méchant";
    private int nbDamesEnlever = 0;
    private float recompenseOfferte;
    private boolean inJail = false;

    // Constructeur sans boisson  (pas défaut)
    Brigan(String name, String look) {
        super(name, "Tord-Boyaux"); // Boisson par défaut
        this.look = look;
        this.recompenseOfferte = (float)100.0; // défaut prix
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
        System.out.println("Ah ah ! (" + dame.quelEstTonNom() + "), tu es mienne désormais !");
        dame.isKidnapped(this);
    }

    // Méthode d'emprisonnement par un cowboy
    void isJailed(Cowboy cowboy)
    {
        System.out.println("Damned, je suis fait ! (" + cowboy.quelEstTonNom() + ") tu m’as eu !");
        System.out.println("La récompense offerte est de " + this.getRecompenseOfferte() + "$ !");
    }

    // Connaître la récompense lors de la capture par un cowboy
    float getRecompenseOfferte()
    {
        return this.recompenseOfferte;
    }

    // Méthode pour changer la récompense
    void setRecompense(float nouvelleRecompense) {
        this.recompenseOfferte = nouvelleRecompense;
    }

    // Redéfinition de quelEstTonNom()
    @Override
    String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + look;
    }

    // Redéfinition de la méthode presenter
    @Override
    void presenter() {
        super.presenter(); // Appel de la méthode de la classe Humain
        parle("J'ai l'air " + look + " et j'ai déjà kidnappé " + this.nbDamesEnlever + " dames !");
        parle("Ma tête est mise à prix " + this.getRecompenseOfferte() + " $ !");
    }
}
