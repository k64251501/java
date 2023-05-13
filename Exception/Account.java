class FundsException extends Exception{
    public FundsException(String Msg){
        super(Msg);
        
    }
}
public class Account {

    public void checkbal() throws FundsException{
      // throw new FundsException("checkbal");
        try{
            throw new FundsException("checkbal");
        }
        catch(Exception e){
        e.printStackTrace();
        }
        System.out.println("karthik");
        System.out.println("raj");
        


    }
    public static void main(String[] args)throws FundsException {
        new Account().checkbal();
        
    }
}