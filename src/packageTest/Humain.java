package packageTest;

public class Humain {
    // Attributs (privés)
    private String name;
    private String favoriteSoda = "Eau";

    // Constructeur
    Humain(String name) {
        this.name = name;
    }

    // Constructeur
    Humain(String name, String favoriteSoda) {
        this.name = name;
        this.favoriteSoda = favoriteSoda;
    }

    // Méthhode pour parler
    void parle(String texte)
    {
        System.out.println("(" + name + ") - " + texte);
    }

    // Méthhode pour présenter
    void presenter()
    {
        System.out.println("Bonjour ! Je m'appelle " + "(" + name + ") - Ma boisson favorite est : " + favoriteSoda);
    }

    // Méthhode pour boire
    void boire()
    {
        System.out.println("Ah ! un bon verre de " + "(" + favoriteSoda + ")" + " ! GLOUPS !");
    }

    // Méthhode pour avoir le nom
    String quelEstTonNom()
    {
        return this.name;
    }

    // Méthhode pour avoir la boisson favorite
    String quelEstTaBoissonFavorite()
    {
        return this.favoriteSoda;
    }

    String getName()
    {
        return this.name;
    }
}
