//package Abtraction-Class;
 abstract class Animal{
    public abstract void AnimalSound();

    public void sleep(){
        System.out.println("get ready to fast");
    }

}
class Pig extends Animal{
  public void AnimalSound(){
    System.out.println("implemation: saying view");
  }
}

 class Main {
    public  static void main(String[] args){
        Animal a= new Pig();
        a.AnimalSound();
        a.sleep();

    }
}
