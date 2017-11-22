package subpub.interface_;

/**
 * Created by liqiushi on 2017/11/22.
 */
public class Anchor implements Subscribe{


    private String anName;

    public boolean isOnline() {
        return online;
    }

    public void setOnline() {
        this.online = true;
        myNotify();
    }

    private boolean online;
    public Anchor(String anName,boolean online) {
        this.anName = anName;
        this.online = online;
    }

    public String getAnName() {
        return anName;
    }

    public void setAnName(String anName) {
        this.anName = anName;
    }
    @Override
    public void append(Observer observer){
        observers.add(observer);
    }
    @Override
    public void remove(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void myNotify() {
        for (Observer observer:observers) {
            if(observer.isInterested()){
                observer.update(this);
            }
        }
    }
}
