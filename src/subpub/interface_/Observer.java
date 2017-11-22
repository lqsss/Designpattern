package subpub.interface_;

/**
 * Created by liqiushi on 2017/11/22.
 */
public interface Observer {
    public void update(Subscribe sub);
    public boolean isInterested();
}
