package packageTest;

public class Histoire {

    /*
    // Debut Question 1
    // Méthode 1 : Calcul de la somme des N premiers entiers pairs
    public static int sommeEntiersPairs(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i * 2; // Entiers pairs successifs : 2, 4, 6, ...
        }
        return somme;
    }

    // Méthode 2 : Remplit un tableau avec les coefficients de la décomposition d’un entier N
    public static int[] decompositionEnPuissancesDe10(int n) {
        String nombre = String.valueOf(n); // Conversion de N en chaîne pour manipuler chaque chiffre
        int[] coefficients = new int[nombre.length()]; // Tableau pour stocker les coefficients

        for (int i = 0; i < nombre.length(); i++) {
            coefficients[i] = Character.getNumericValue(nombre.charAt(nombre.length() - 1 - i)); // A voir
        }

        return coefficients;
    }
    // Fin Question 1
    */

    /*
    // Début question 2
    // Méthode pour calculer le factoriel de n
    public static long factorielleRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le factoriel n'est pas défini pour les nombres négatifs."); // A voir
        }
        if (n == 0 || n == 1) {
            return 1; // Cas de base
        }
        return n * factorielleRecursive(n - 1); // Appel récursif
    }
    // Fin question 2
    */

    public static void main(String[] args) {
        /* Debut Question 1
        // Test de la méthode 1 : Somme des N premiers entiers pairs
        int n = 5;
        System.out.println("Somme des " + n + " premiers entiers pairs : " + sommeEntiersPairs(n));

        // Test de la méthode 2 : Décomposition en puissances de 10
        int nombre = 1234;
        int[] coefficients = decompositionEnPuissancesDe10(nombre);

        System.out.print("Décomposition de " + nombre + " en puissances de 10 : ");
        for (int i = coefficients.length - 1; i >= 0; i--) {
            System.out.print(coefficients[i] + " ");
        }
        // Fin Question 1
        */

        /*
        // Début question 2
        // Test de la méthode factorielle
        int nombre = 5; // Exemple : 5!
        System.out.println("Le factoriel de " + nombre + " est : " + factorielleRecursive(nombre));
        // Fin question 2
        */

        /*
        // Début Exo 1
        Exo1 p = new Exo1();
        Exo1 q = new Exo1();
        p.affiche();
        q.affiche();
        p.f();
        p.affiche();
        q.affiche();

        p = q;

        p.f();
        p.affiche();
        q.affiche();
        // Fin Exo 1
         */

        /*
        // Début Exo 2
        Exo2 obj = new Exo2();
        obj.affiche();
        obj.f(obj);
        obj.affiche();
        // Fin Exo 2
         */

        /*
        // Début Exo 3
        Exo3 p = new Exo3();
        p.f(12);
        // Fin Exo 3
         */

        /*
        // Début Exo 5
        // 1.
        Paire newPaire = new Paire((float)5.4, (float)4.5);
        newPaire.affiche();
        // Fin Exo 5
         */

        // Début Exo 7
        // On désire réaliser un programme Java permettant d’écrire facilement des histoires de Western. Dans nos
        // histoires, nous aurons des brigands, des cowboys, des shérifs, des barmen et des dames en détresses

        // Début 1.1
        Humain humainTest = new Humain("Quentin");
        humainTest.presenter();
        humainTest.boire();
        // Fin 1.1

        // Début 1.2

        // Fin 1.2

        // Fin Exo 7
    }
}