package oopsProperties.Interface;

public class newCar {
 private    engine e= new petrolEngine();
    media  m = new cdplayer();

    public void startcar(){
        e.start();
    }
    public void startstop(){
        e.stop();
    }
    public void musicstart(){
        m.start();
    }
    public void musicstop(){
        m.stop();
    }
    public  void chngeEngine(){
        this.e=new dieselEngine();
    }
}
