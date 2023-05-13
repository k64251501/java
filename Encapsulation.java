class Encapsulation{
	private int i;
	private String n;

	public int getI(){
		return i;
	}
	public void setI(int io,String p){
		this.i=io;
		this.n=p;
	}
	// Overriding toString()
	public String toString(){
		return i+" "+n;
	}
	public static void main(String []args){
		Encapsulation e=new Encapsulation();
		e.setI(89,"JAM");
		System.out.println(e);
	}
}