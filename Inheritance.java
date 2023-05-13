class A{
	public void m1(){
		System.out.println("ok");
	}
	public void m2(){
		System.out.println("ok1");
	}
}
class B extends A{
	public void m3(){
		System.out.println("ok3");
	}
}
class Test{
	public static void main(String[] args){
		B n=new B();
		n.m2();
	}
}