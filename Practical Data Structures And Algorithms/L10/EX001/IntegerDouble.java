public class IntegerDouble {
    private int s;
    private int d;

    public IntegerDouble(int s, int d) {
        this.s = s;
        this.d = d;
    }
    public void setS (int s) {
        this.s = s;
    }
    public int getS () {
        return this.s;
    }
    public void setD (int d) {
        this.d = d;
    }
    public int getD () {
        return this.d;
    }
    public String toString () {
        return this.s + " " + this.d;
    }
}