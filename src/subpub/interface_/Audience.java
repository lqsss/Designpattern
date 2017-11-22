package subpub.interface_;

/**
 * Created by liqiushi on 2017/11/22.
 */
public class Audience implements Observer {
    private String auName;
    Subscribe sub ;
    private boolean interested;
    public void setInterested(boolean interested) {
        this.interested = interested;
    }


    public Audience(String auName,Subscribe sub) {
        this.auName = auName;
        this.sub =sub;
        sub.append(this);
    }

    @Override
    public void update(Subscribe sub) {
        System.out.println("亲爱的" + this.auName + ":" + ((Anchor) sub).getAnName() + "主播上线了！");
    }

    @Override
    public boolean isInterested() {
        return interested;
    }
}
