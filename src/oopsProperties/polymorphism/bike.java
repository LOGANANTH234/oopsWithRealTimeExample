package oopsProperties.polymorphism;


public class bike {
    int speed=10;

   void run (){
        System.out.println("run bike");
    }
}
 class honda extends bike{
     int speed=20;
@Override
   public void run (){
        System.out.println("run honda");
    }
}
 class main {
    public static void main(String[] args) {
        /*
        RUN TIME POLYMORPHISM:
        1.It is achieved by method overriding.
        2.If the subclass has  the method same as in the parent class is called overriding.
        3.The overriden method will be called by refrence variable of parent class.but what method sholud be called depends up on the object.
        4.Method overriding is not applicable for instance variable.It depends up on the refrence variable type.
        5.If we make a method as final.WEcannot override.
         */
        bike obj = new bike();
        //1. If the Parent class refrence variable refers to the child class object. it is known as upcasting.
        bike obj2= new honda(); // upcasting
        obj2.run();
    }
}
