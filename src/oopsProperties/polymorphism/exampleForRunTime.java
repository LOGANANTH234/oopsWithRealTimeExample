package oopsProperties.polymorphism;


    class Bank{
        float getRateOfInterest(){
            return 0;
        }
    }
    class SBI extends Bank{
        float getRateOfInterest(){return 8.4f;}
    }
    class ICICI extends Bank{
        float getRateOfInterest(){return 7.3f;}
    }
    class AXIS extends Bank{
        float getRateOfInterest(){return 9.7f;}
    }
public class exampleForRunTime {
        public static void main(String args[]){
            Bank b;
            b=new SBI();
            System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
            b=new ICICI();
            System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
            b=new AXIS();
            System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());

            A obj = new C();
            obj.print();
        }
    }
class A{
        public  void  print(){
            System.out.println("a");
        }
}

class B extends  A{
        @Override
    public  void  print(){
        System.out.println("b");
    }
}
class C extends  B{



}