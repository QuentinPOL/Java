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
    void kidnapperDame(Cowboy _cowboy)
    {
        this.libreOrCaptive = true;
        System.out.println("Au secours ! (" + _cowboy.getName() + ") m'a kidnapper !");
    }

    // La dame se fait liberer
    void libererDame(Cowboy _cowboy)
    {
        this.libreOrCaptive = false;
        System.out.println("Merci pour m'avoir libérer (" + _cowboy.getName() + ") !");
    }

    void setColorRobe(String colorRobe) {
        this.colorRobe = colorRobe;
       System.out.println("Regardez ma nouvelle robe (" + colorRobe + ") !");
    }

}