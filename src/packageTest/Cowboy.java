package packageTest;

public class Cowboy extends Humain {
    // Attributs
    private int popularite = 0; // Par défaut
    private String adjectif = "vaillant"; // Par défaut

    // Constructeur sans boisson  (pas défaut)
    Cowboy(String name, int popularite, String adjectif) {
        super(name);

        this.popularite = popularite;
        this.adjectif = adjectif;
    }

    // Constructeur avec tout les attributs
    Cowboy(String name, String favoriteSoda, int popularite, String adjectif) {
        super(name, favoriteSoda);

        this.popularite = popularite;
        this.adjectif = adjectif;
    }

    // Méthode pour tirer sur un brigand
    void shootOnBrigan(Brigan brigan)
    {
        System.out.println("Le " + this.adjectif + " " + this.getName() + " tire sur " + brigan.getName() + ". PAN !");
        System.out.println("Prend ça, crapule !");
    }

    void libererDame(Dame dame)
    {
        System.out.println("Le cowboy" + this.getName() + ", flatte la dame : " + dame.getName() + " !");
        System.out.println("Il la libére donc !");
        dame.isLeberate(this);
        popularite++;
    }
}
