package packageTest;

public class Exo2 {
    int a = 0 ;
    public static void f(Exo2 o) {
        o.a++;
        o.affiche();
    }
    public void affiche() {
        System.out.println(a);
    }
}
