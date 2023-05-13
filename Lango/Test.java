package Lango;
class Test {
    public void m1(){
        System.out.println("m1-method zero arguments");
    }
    public int m1(int a){
 System.out.println("m1-method integer arguemts");
 return 10;
    }
    public void m1(String s){
        System.out.println("m1-method String argument");
    }
    public static void main(String[] args){
   Test a1=new Test();
   a1.m1();
   a1.m1(10);
   a1.m1("karthik");
         
        }
    
}
