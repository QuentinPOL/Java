package packageTest;

public class Dame extends Humain{
    // Attributs
    private String colorRobe;
    private boolean libreOrCaptive = false;

    // Constructeur sans boisson  (pas défaut)
    Dame(String name, String colorRobe, boolean libreOrCaptive) {
        super(name);

        this.colorRobe = colorRobe;
        this.libreOrCaptive = libreOrCaptive;
    }

    // Constructeur avec tout les attributs
    Dame(String name, String favoriteSoda, String colorRobe, boolean libreOrCaptive) {
        super(name, favoriteSoda);

        this.colorRobe = colorRobe;
        this.libreOrCaptive = libreOrCaptive;
    }

    // La dame se fait kidnapper
    void isKidnapped(Brigan brigand)
    {
        this.libreOrCaptive = true;
        System.out.println("Au secours ! (" + brigand.quelEstTonNom() + ") m'a kidnapper !");
    }

    // La dame se fait liberer
    void isLeberate(Cowboy cowboy)
    {
        this.libreOrCaptive = false;
        System.out.println("Merci pour m'avoir libérer (" + cowboy.quelEstTonNom() + ") !");
    }

    // Méthode pour changer la couleur de sa robe
    void setColorRobe(String colorRobe)
    {
        this.colorRobe = colorRobe;
        System.out.println("Regardez ma nouvelle robe (" + colorRobe + ") !");
    }

    // Redéfinition de quelEstTonNom()
    @Override
    String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }
}