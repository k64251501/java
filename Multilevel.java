class M{
	public void m(){
		System.out.println("p");
	}
	
}
class N extends M{
	public void m1(){
		System.out.println("l");
	}
}
class B extends N{
	public void m2(){
		System.out.println("k");
	}
}
class Test{
	public static void main(String[] args){
		B o=new B();
		o.m();
	}
}