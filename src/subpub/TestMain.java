package subpub;

import subpub.interface_.Anchor;
import subpub.interface_.Audience;
import subpub.interface_.Observer;
import subpub.interface_.Subscribe;

/**
 * Created by liqiushi on 2017/11/22.
 */
public class TestMain {
    public static void main(String[] args) {

        Subscribe subscribe = new Anchor("胖头鱼",false);
        Observer childAu = new Audience("小孩子",subscribe);
        Observer womanAu = new Audience("女孩子",subscribe);
        ((Audience)childAu).setInterested(true);
        ((Anchor)subscribe).setOnline();
       
    }

    
}
