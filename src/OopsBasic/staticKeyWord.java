package OopsBasic;

public class staticKeyWord {
    static {
        int a=1;
        int b=1;
    }
    public static void main(String[] args) {

        /*
    static:
    1.static is mainly used for memory management.
    2.we can apply static keyword in variable,method and nested classes.
     */
        Students loga= new Students();
        System.out.println(Students.clgName);
        Students.chnge("bitians");
        System.out.println(Students.clgName);

    }

}
class Students{
    int roll;
    int name;
    static  String clgName="BIT";
 /*
1. static in variable:
 1.if the value of the instance vairable is same for all the objects.we can decleare it as static.because when we create and the initialize the object ,it will take memory at every time we created.but if we declare as static it will occupy memory only once.
 2.we can use it without creating the object .By using class name we can use it.
  */
    static void chnge(String name){
        clgName=name;
    }


/*
2.static method:
1.if we decleare a method as static without craeting a object we can use it by class name.
2.static methods can be overloaded but cannot be overridden.
in static method:
1.we cannot call the non static method in static method.but we can call the static method from non static method.
2.we cannot use this or super keyword in static method.

 */
}