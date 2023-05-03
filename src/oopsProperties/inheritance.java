package oopsProperties;

public class inheritance {
    public static void main(String[] args) {
        //Inheritance
        /*
        1.Inheritance in java is a mechanism in which a object acquires all the properties and behivaour of its parent object.
        2.It represents a is-a relationship.which is known as parent-child relationship.
        3.If we create a constructor in parent class we aslo need to create constructor in child class.

         why inheritance:
         1.To achieve the code re-usability.
         2.For method overriding.

         extends:
         1.Extends keyword refers to we are going to create a new class that derives from  the existing class.
         2.Extends means to increase the functionlaity.

         A class which is inherited is called parent class. And which was created by inherting the parent class is called child class.
         Three type of inheritance: Single ,multi level,hierarchical.
         */

Loga obj = new Kishore(1,10,"loga");


        System.out.println(obj.roll+ " "+ obj.registerNumber);

    }
}
class Loga{
    int roll=10;
    int registerNumber=10;


    public Loga(int roll) {
        this.roll = roll;
    }

    public Loga(int roll, int registerNumber) {
        this.roll = roll;
        this.registerNumber = registerNumber;
    }

    public  void print(){
        System.out.println(this.registerNumber+" "+this.roll);
    }
        }
class Kishore extends Loga{
    String name="kishore";

    public Kishore(int roll,int registerNumber,String name) {
        super(roll,registerNumber);

    }


    public  void print(){
        System.out.println(this.registerNumber+" "+this.roll);
    }
}
