package cyb.utils;

import com.hwangjr.rxbus.Bus;

/**
 * Created by user on 2017/2/18.
 */

public  class RxBus {
    private static Bus sBus;
    public static final synchronized Bus getDefault(){
        if(sBus==null){
            sBus = new Bus();
        }
        return sBus;
    }
}
