package packageTest;

public class Barman extends Humain {
    // Atttributs
    private String nomBar;


    // Constructeur avec uniquement le nom
    Barman(String name) {
        super(name, "Vin"); // Boisson par défaut
        this.nomBar = "Chez nom du barman" + super.quelEstTonNom();
    }

    // Constructeur avec le nom du barman et le nom du bar
    Barman(String name, String favoriteSoda, String nomBar) {
        super(name, favoriteSoda);
        this.nomBar = nomBar;
    }

    // Redéfinition de la méthode presenter
    @Override
    void presenter() {
        super.presenter();
        parle("Je suis le barman du bar " + nomBar + " !");
    }

    // Redéfinition de la méthode parle pour ajouter Coco
    @Override
    void parle(String texte) {
        super.parle(texte + " Coco.");
    }

    // Méthode pour servir un humain
    void servir(Humain client) {
        parle("Voici un verre de " + client.quelEstTaBoissonFavorite() + " pour toi, " + client.quelEstTonNom() + " !");
    }
}
