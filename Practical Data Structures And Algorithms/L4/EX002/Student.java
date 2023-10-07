public class Student {
    private String name;
    private double mathematics;
    private double programming;
    private double DSA1;

    public Student (String name, double mathematics, double programming, double DSA1) {
        this.name = name;
        this.mathematics = mathematics;
        this.programming = programming;
        this.DSA1 = DSA1;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setMathematics (double mathematics) {
        this.mathematics = mathematics;
    }
    public double getMathematics () {
        return this.mathematics;
    }
    public void setProgramming (double programming) {
        this.programming = programming;
    }
    public double getProgramming () {
        return this.programming;
    }
    public void setDSA1 (double DSA1) {
        this.DSA1 = DSA1;
    }
    public double getDSA1 () {
        return this.DSA1;
    }
    public double getAverage () {
        return (mathematics+programming+DSA1)/3;
    }
    public String toString () {
        return "["+ this.name + "/" + this.getAverage()+"]";
    }
}