 public class Account{
private double min_bal;
private String acc_Name;

public void set_Minbal(double bal){
	this.min_bal= bal;
	
}
public double get_Minbal(){
	return min_bal;
}
public void set_Acc_Name(String name){
	this.acc_Name = name;
}
public String get_AccName(){
	return acc_Name;
}
	
	public static void main(String[] args){
		Account s1=new Account();
	s1.set_Minbal(5000);
		System.out.println(s1.get_Minbal());
	}
}