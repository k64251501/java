package Lango;
//package Langk;

 class Main {
    public void m1(){
        System.out.println("m1-method intisal argements");
    }
    public int m1(int a){
         System.out.println("m1() integer arguments");
         return 10;
    }
    public void m1(String s){
       System.out.println("ready to on move String");
    }
    public static void main(String[] args){
   Main s1obj=new Main();
   s1obj.m1();
   s1obj.m1(10);
   s1obj.m1("hello");

       }
    
}
