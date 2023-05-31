package oopsProperties.Interface;

public class main {
    public static void main(String[] args) {
        /*
        Interface:
        1.It has only abstarct methods .
        2.It is used to achieve abstraction  and multiple inheritance.
        3.from java 8 we can have methods with body.
        4.from java 9,we can hava private methods.but with body.
        5.All the fields are public ,static and final.
         */
        newCar obj = new newCar();
        obj.musicstart();
        obj.musicstop();
        obj.startstop();
        obj.startcar();
        obj.chngeEngine();
        obj.startstop();
        car c = new car();

    }
}
