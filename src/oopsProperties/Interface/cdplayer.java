package oopsProperties.Interface;

public class cdplayer implements  media{

    @Override
    public void stop() {
        System.out.println("cdplayerstop");
    }

    @Override
    public void start() {
        System.out.println("cdplayerstart");

    }


}
