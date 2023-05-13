class Person{
private String name;
//private int i;
//GETER 
public String getName(){
    return name;

}
//SETER...
public void setName( int newi, String newname){
    this.name=newname;
   // this.i=newi;
}
}


public class Main {
    public static void main(String[] args){
    Person myobj = new Person();
    myobj.setName(111,"karthik");
    System.out.println(myobj.getName());
    //System.out.println(myobj.setName());
    }

    
}
