package com.greendao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

import cyb.GreenDaoManager;
import cyb.bean.UserInfo;

/**
 * Created by user on 2017/2/18.
 */

public class UserInfoDaoUtils {
    public static  UserInfoDao getUserInfoDao(){
        return GreenDaoManager.getInstance().getmDaoSession().getUserInfoDao();
    }

    public static void insertOrReplaceUserinfo(UserInfo userInfo){
        getUserInfoDao().insertOrReplace(userInfo);
    }

    public static void deleteAllUserinfo(){
        getUserInfoDao().deleteAll();
    }
    public static void deleteUseriInfo(UserInfo userInfo){
        getUserInfoDao().delete(userInfo);
    }
    public static void saveListUserinfo(final List<UserInfo> list){
        if (list==null||list.isEmpty()){
            return;
        }
        getUserInfoDao().getSession().runInTx(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<list.size();i++){
                    getUserInfoDao().insertOrReplace(list.get(i));
                }
            }
        });
    }

    public static List<UserInfo> queryN(String where,String...params){
        return getUserInfoDao().queryRaw(where,params);
    }
    public static List<UserInfo> querydataBy(String name) {////查询条件
       /* Query<User> nQuery = getUserInfoDao().queryBuilder()
//                .where(UserDao.Properties.Name.eq("user1"))//.where(UserDao.Properties.Id.notEq(999))
                *//*.orderAsc(UserInfoDao.Properties.State)*//*//.limit(5)//orderDesc
                .build();
        List<User> users = nQuery.list();
        Log.i("tag", "当前数量：" + users.size());
        for (int i = 0; i < users.size(); i++) {
            Log.i("tag", "结果：" + users.get(i).getId() + "," + users.get(i).getName() + "," + users.get(i).getAge() + "," + users.get(i).getIsBoy() + ";");
        }*//*.w(UserInfoDao.Properties.DisplayName.eq("蔡煜波"))*/
        QueryBuilder<UserInfo> query = getUserInfoDao().queryBuilder().where(UserInfoDao.Properties.DisplayName.eq(name));
        return query.list();

    }

}
