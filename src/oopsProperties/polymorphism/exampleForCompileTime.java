package oopsProperties.polymorphism;
class maths{
   public  void add (int a,int b){
        System.out.println(a+b);
    }
    public  void  add(int a,int b,int c){
        System.out.println(a+b+c);

    }
    public double  add(int a,float b){
        System.out.println(a+b);
return a+b;
    }
    public  void  add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);

    }

}

public class exampleForCompileTime {
    public static void main(String args[])
    {
        /*
        Compile Time polymorphism :
        1.It is achieved by method overloading.
        2.when there is an lot of methods in a same name with different type of arguments in the same class is called method overloading.
        3.The compiler decides what method to be called at the compile time according to the arguments.
        4.By changing the type of the arguments.By changing the number of arguments.
         */
        maths obj = new maths();
        obj.add(1,1);
    }
}
