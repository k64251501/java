class Parent{
	public void m1(){
		System.out.println("'Parent class-m1() method'");
		
}	
}
class Child extends Parent{
	public void m2(){
	System.out.println("'Parent class- m2() method'");	
	
}
}

public class Testc{
	
public static void main(String[] args){
	  Child t1=new Child();
	 // System.out.println(t1);
	 t1.m1();
	 t1.m2();
}
}