package oopsProperties.Interface;

public class dieselEngine implements engine{

    @Override
    public void stop() {
        System.out.println("dieselstop");
    }

    @Override
    public void start() {
        System.out.println("dieselstart");

    }
}
