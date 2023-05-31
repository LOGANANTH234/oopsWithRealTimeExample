package oopsProperties.Interface;

public class petrolEngine  implements engine{

    @Override
    public void stop() {
        System.out.println("petrolstop");

    }

    @Override
    public void start() {
        System.out.println("petrolstart");

    }
}
