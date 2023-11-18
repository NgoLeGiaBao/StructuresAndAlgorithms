public class IntegerTriple {
    private int w;
    private int s;
    private int d;

    public IntegerTriple (int w, int s, int d) {
        this.w = w;
        this.s = s;
        this.d = d;
    }
    public int getW () {
        return this.w;
    }
    public int getS () {
        return this.s;
    }
    public int getD () {
        return this.d;
    }
    public String toString () {
        return this.w + " " + this.s + " " + this.d;
    }
}