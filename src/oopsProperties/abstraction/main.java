package oopsProperties.abstraction;

 abstract  class bank {
     final int a;
     bank (int a){
         this.a=a;
     }
    /*
    Abstraction:
    1.It is the process of hiding the implementation and only showing the functionality to the users.
    2.Example:When we sent a text ,we don't know the internal process.
    Abstraction class:
    1.When a class is decleared with abstract keyword then it known as Abstract class.
    2.It may have both Abstract and non-Abstract method.
    3.It can have static method and final method.
    4.A constuctor cannot be Abstract.
    5.We cannot create object for Abstract class.
    6.The abstract provides set of rules ,the class which extends this must follow th rules.
     */
     public abstract void rateOfInterset();
     public  static void method(){
         System.out.println("iam static final and non abstarct method in abstract class");
     }
}

class Tmb extends bank{

     public  void rateOfInterset(){
         System.out.println(10);
     }
     Tmb(int a){
         super(a);
     }

}
class sbi extends bank{
    sbi(int a) {
        super(a);
    }

    public  void rateOfInterset(){
        System.out.println(20);
    }

}
     public class main {
    public static void main(String[] args) {
  bank b = new Tmb(100);
        System.out.println(b.a);
  bank.method();
  b.rateOfInterset();

    }
}