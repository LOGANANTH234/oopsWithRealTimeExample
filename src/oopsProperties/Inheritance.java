package oopsProperties;

public class Inheritance {
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

       Bear obj = new Bear(4,32,16,1,100);

        System.out.println(obj.legs+" "+ obj.nail+" "+ obj.teeth+" "+ obj.tail);

        System.out.println(obj instanceof Bear);
    }
}

class Animals {
  int legs;
  int teeth;
  int nail;

    public Animals(int legs, int teeth, int nail) {
        this.legs = legs;
        this.teeth = teeth;
        this.nail = nail;
    }



    public void Walk(){
        System.out.println("animals eat");
    }

    public void breath(){
        System.out.println("animals breathe");
    }
}
class Lion extends Animals {

    int tail;

    public Lion(int legs, int teeth, int nail, int tail) {
        super(legs, teeth, nail);
        this.tail = tail;
    }

    public void eatsNonVeg(){
        System.out.println("eats nonVeg");
    }

}
class Bear extends Lion {
    public Bear(int legs, int teeth, int nail, int tail, int hands) {
        super(legs, teeth, nail, tail);
        this.hands = hands;
    }

    int hands;
    public void eatsVeg(){
        System.out.println("eats veg");
    }


}