package Lango.Object;
class Test2{
    public String m1(){
         System.out.println("Test Class m1() method");
         return "Hello, m1 method";
    }
    public String toString(){
        return "Rajinikanth";
    }
    public static void main(String[] args) {
         Test2 a=new Test2();
         System.out.println(a.m1());
         System.out.println(a.toString());
         System.out.println(a);
    }
}