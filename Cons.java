class Cl {
    int i;
    String s;
    double b;

    Cl(int u, String d, double g) {
        this.i = u;
        this.s = d;
        this.b = g;
    }
    public String toString(){
        return i+""+s+""+b;
    }

    public static void main(String[] args) {
        Cl r = new Cl(123, "op", 304.34);
        System.out.println(r);
    }
}