class Productc{
	String pro_Name;
	double pro_Price;
	
	Productc(String name, double price){
		this.pro_Name= name;
		this.pro_Price= price;
	
}
public static void main(String[] args){
	Productc p1=new Productc("Iphone13", 55000.00);
	System.out.println(p1.pro_Name);
	System.out.println(p1.pro_Price);
}
}