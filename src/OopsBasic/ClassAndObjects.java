package OopsBasic;

public class ClassAndObjects {

    public static void main(String[]p) {
        final int clgStrength;
        clgStrength=10;
        /*
    Local variable as final:
    1.It is the keyword which is used to restrict the user to reassign the values.
    2.Once it is assigned we cannot the change the values.
    3.If we declare the local variable as final,we can assign the value before we use that.but we cannot reassign the values.
    */
        /*
Object:
1.An object is a pysical thing that present in the wolrd.
2.Many objects can be created for a class.
3.New keyword is used to allocate memory for a new object.
4.It occupies memory.
5.ClassName variable= new ClassName(); like this we need to create the object.
 */
        //Object
        Student kishore= new Student(100,"kishore");
        System.out.println(kishore.rollNo+" "+ kishore.name);
        kishore.welcome();
        System.out.println ( kishore.t());
        Student kishore1= new Student(200,"logananth");
        Student logananth= new Student();
        System.out.println ( kishore1.t());
        kishore1.printRollNo();




//        for (int i = 0; i < 100000000; i++) {
//            OopsBasic.Student loga= new OopsBasic.Student(10,"loga");
//
//        }

    }
    /*
Class:
1.A class is a just a template.It is only logical .It is not a physical thing.
2.Instance variable:It is the state of the object.It is declared out the method declaration.Every object of the class has the copy  of instance.
3.A class is a group of objects of same properties.but the value of the properties are differ.
4.A class can contain method,constructor,nested classes,instance variable.
5.class does not occupy memory.
5.The first letter of the class starts with caps.
 */
}
class Student{
    //Instance variable
    int rollNo;
    String name;


   /*
   final method:
   1.If we decleare the method as final we cannot override it.But we can inherit it.
   final Class:
   1.If we decleare the Class as final we cannot extend it.
    */
  final   public   void printRollNo(){
        System.out.println(this.rollNo);

    }
          /*
    Local variable as final:
    1.It is the keyword which is used to restrict the user to reassign the values;
    2.Once it is assigned we cannot the change the values.
    3.If we declare the instance variable as final,we need to assign the value when we decleared as a final.
    */


    /*
    constructor:
    1. A  constructor is a special type of method.
    2. It starts with an class name.It doesn't have a any return type,because the class itself is a return type.
    3. It used to initialize the values the objects.
    4. When  we didn't create any constructor  in our class ,the default constructor  will be called.
    5. if we create the instance of the class ,atleast any one of the constructor  will be invoked.
    6. There are two types of constructor. default constructor and paramized constructor.
    7.Constructor  cannot be final,abstract.
     */
     /*
    this:
    1st Use;
    1.This is  an reference variable which refers to the current object in the class.
    2.If the instance variable and the local variable are different,no need to use this keyword.
  */

    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;

        getThis(this);
    }

    /*
     2nd Use;
    1.This is also used to invoke the current class method.
    2.Below the example ,thnx method is called in welcome method .so this keyword is used by compiler automatically to invoke the thnx method.
     */
    public   void welcome(){
        System.out.println("welcome");
        thnx();//this.thnx();
    }
    public    void thnx(){
        System.out.println("thnx");
    }
public  void getThis(Student thiss){
    System.out.println(this);

}
    /*
     3rd Use;
     1.It is also used invoke the current class constructor.
     2.It is used to reuse the constuctor or we can use the another constuctor in the same class.
     3.If we use This key word in the  constructor it must be written first .Other wise it will gives an error.
     */
    Student(){
        this(10,"raja");//here this acts as an constructor.It calls the below constructor.

    /*    OopsBasic.Student(int rollNo,String name,int f){
            this.rollNo=rollNo;
            this.name=name;
        }*/
    }
    /*
    4th Use;
    1.this is also use to return the current instance of the class.
    2.The return type should be class name.
     */
    public   Student  t(){
        return this;
    }

    //copy constructor
        Student(Student other){
        this.name=other.name;
        this.rollNo= other.rollNo;
        }


    //Method
    /*
    1.Method is a block of code. which is used to achieve the reusability of code.
    2.we can write once and use it many times.
    3.Method is made up of Access modifier ,return type,method name,arguement list.
    4.There are two types of method.
    In pre - defined method:
    1.These are methods which was already present in the java libraries.
    ex:Math.max function present in Math class,print function present in java.io.PrintStream
    In user - defined method:
    It is the method defined by user.

    MAIN METHOD:
    1.Main method is most important method in java.because it is going to excute  fisrt by jvm.
    2.With out main method it gives us error.
    3.String [] args : The main method accept some String data.The main method accepts some data  from  users input.
    4.Without String [] args as a parameter: It compiles succesfully but it gives us error. Becuase the jvm will always  search the main method with String array as a parameter.
    5.Static block are the block which are going to excuete first.Then static methods
     */
     /*
        Finalize method:
        1.It is the method of object class.
        2.It is called when the object was collected by garbage collector.
         */

     @Override
     protected void finalize() throws Throwable {
         super.finalize();
    }
}





