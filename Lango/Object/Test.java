package Lango.Object;

public class Test {
    public String m1(){
        System.out.println("Test Class m1() method");
        return "Hello, m1 method";
   }
    public static void main(String[] args){
        Test s1= new Test();
        System.out.println(s1.m1());
        
    }
    
}
