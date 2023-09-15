public class Fraction {
    private int numer;
    private int denom;

    public Fraction () {
        this.numer = 0;
        this.denom = 1;
    }
    public Fraction (int x, int y) {
        this.numer = x;
        this.denom = y;
    }
    public Fraction (Fraction f) {
        this.numer = f.getNumer();
        this.denom = f.getDenom();
    }
    public int getNumer () {
        return this.numer;
    }
    public void setNumber (int numer) {
        this.numer = numer;
    }
    public int getDenom () {
        return this.denom;
    }
    public void setDenom (int denom) {
        this.denom = denom;
    }
    public String toString () {
        return this.numer + "/" + this.denom;
    }
    public boolean equals (Object f) {
        if (f instanceof Fraction) {
            Fraction fraction = (Fraction)f;
            if (this.numer == fraction.getNumer() && this.denom == fraction.getDenom()) {
                return true;
            }
            return false;
        }
        return false;
    }
}