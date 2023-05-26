package java8features;
public interface Test{
    public abstract int k(int a, int b);

}
class u{
    static Test k=(int a, int b)->{return a+b;};
    public static void main(String[] args) {
        System.out.println(k.k(3, 5));
        
    }
}