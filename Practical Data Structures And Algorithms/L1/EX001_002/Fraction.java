import java.util.NoSuchElementException;
public class Fraction {
    private int numer;
    private int denom;

    public Fraction () {
        this.numer = 0;
        this.denom = 1;
    }
    public Fraction (int x, int y) throws NoSuchElementException {
        if (y == 0) {
            throw new NoSuchElementException ("Denom can't equal 0");
        } else {
            this.numer = x;
            this.denom = y;
        }
    }
    public Fraction (Fraction f) {
        this.numer = f.getX();
        this.denom = f.getY();
    }
    public int getX() {
        return this.numer;
    }
    public int getY() {
        return this.denom;
    }
    public void setX (int x) {
        this.numer = x;
    }
    public void setY (int y) {
        this.denom = y;
    }
    public String toString () {
        return this.numer + "/" + this.denom;
    }
    public boolean equals (Object f) {
        if (f instanceof Fraction) {
            Fraction frac = (Fraction)f;
            if (this.getX() == frac.getX() && this.getY()== frac.getY()) {
                return true;
            }
            return false;
        }
        return false;
    }
}