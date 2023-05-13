public class Copy {
    private int i;
    private String name;

    public int getI(){
        return i;
    }
    public void setI(int io, String newname){
      this.i=io;
      this.name=newname;
    }
    public String toString(){
        return i+" "+name;
    }

    public static void main(String[] args){
       Copy s=new Copy();
       s.setI(0111,"karthik");
      // s.setI("karthik")
       System.out.println(s);
       System.out.println(s);
    }
    
    
    
}
