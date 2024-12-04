package packageTest;

public class Paire {
    // Attributs
    private float x;
    private float y;

    Paire(float x, float y) // .1
    {
        this.x = x;
        this.y = y;
    }

    Paire() // .2
    {
        this.x = 0;
        this.y = 0;
    }

    Paire(Paire p) // .3
    {
        this.x = p.x;
        this.y = p.y;
    }

    void affiche() // .2
    {
        System.out.println("x = " + x + ", y = " + y);
    }

    // Recup la valeur de x
    float getX()
    {
        return this.x;
    }

    // Recup la valeur de y
    float getY()
    {
        return this.y;
    }

    // Changer la valeur de x
    void setX(int x)
    {
        this.x = x;
    }

    // Changer la valeur de y
    void setY(int y)
    {
        this.y = y;
    }
}
