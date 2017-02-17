package cyb;

import com.greendao.DaoMaster;
import com.greendao.DaoSession;

import cyb.retrofitlesson.mApplication;

/**
 * Created by user on 2017/2/17.
 */

public class GreenDaoManager {
    private static GreenDaoManager mInstence;//单例模式
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    private GreenDaoManager(){
        if (mInstence==null){
            DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(mApplication.getInstance(),"user-db",null);
            mDaoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
            mDaoSession = mDaoMaster.newSession();
        }
    }

    public static synchronized GreenDaoManager getInstance(){
        if (mInstence==null){
             mInstence = new GreenDaoManager();
        }
        return mInstence;
    }

    public DaoMaster getmDaoMaster() {
        return mDaoMaster;
    }

    public DaoSession getmDaoSession() {
        return mDaoSession;
    }
}
