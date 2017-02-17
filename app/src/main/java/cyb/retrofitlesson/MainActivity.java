package cyb.retrofitlesson;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.greendao.UserInfoDao;
import com.jakewharton.rxbinding.view.RxView;

import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import cyb.GreenDaoManager;
import cyb.bean.Login;
import cyb.bean.Result;
import cyb.bean.UserInfo;
import cyb.comm.Constant;
import cyb.cookisutils.NetWorkUtils;
import cyb.servers.GetUserinfoServers;
import cyb.servers.LoginServers;
import cyb.utils.Util;
import retrofit2.Retrofit;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_company_id)
    EditText etCompanyId;
    @BindView(R.id.et_account)
    EditText etAccount;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;
    @BindView(R.id.btn_login)
    Button btnLogin;
    ListView lv;
    String companyid=null;
    String userid=null;
    String password=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initEvent();

    }

    private void initEvent() {
        Observable<Void> observable =  RxView.clicks(btnLogin).share();
        Subscription subscription= observable.throttleFirst(2, TimeUnit.SECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                Toast.makeText(MainActivity.this, "正在登录", Toast.LENGTH_SHORT).show();
            }
        });

        Subscription subscription2=observable.throttleFirst(2, TimeUnit.SECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                // Toast.makeText(MainActivity.this, "点击了登录2", Toast.LENGTH_SHORT).show();

                final Retrofit retrofit = NetWorkUtils.getRetrofit();

                Observable<Result<Login>> call= (Observable<Result<Login>>) retrofit.create(LoginServers.class).Login(etCompanyId.getText().toString(),
                        etAccount.getText().toString(),etPassword.getText().toString(),"1",
                        Util.getSign("customerid"+etCompanyId.getText().toString()+"userid"+
                                etAccount.getText().toString()+"password"+etPassword.getText().toString()));
                call.flatMap(new Func1<Result<Login>, Observable<Result<UserInfo>>>() {
                    @Override
                    public Observable<Result<UserInfo>> call(Result<Login> loginResult) {
                        Constant.SESSION_ID=loginResult.getData().getSessionId();
                        Log.i("8888","loginResult.getCode()="+loginResult.getCode());
                        if (loginResult.getCode()==1){
                            //Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                            return retrofit.create(GetUserinfoServers.class).getUserInfo(Constant.SESSION_ID,"0",
                                    Util.getSign("sessionId"+Constant.SESSION_ID+"id"+"0"));
                        }else{
                            //Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();

                        }
                        return null;
                    }
                }).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Result<UserInfo>>() {
                    @Override
                    public void call(Result<UserInfo> userinfo) {
                        Constant.userInfo = userinfo.getData();
                            //存入数据库
                        saveUserinfoToDB(userinfo);
                            //启动登陆界面
                        Intent intent = new Intent(MainActivity.this, Application.class);
                        startActivity(intent);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });
            }
        });
    }

    /**保存到数据库**/
    private void saveUserinfoToDB(Result<UserInfo> userinfo) {

    }




    private UserInfoDao getUserInfoDao(){
       return GreenDaoManager.getInstance().getmDaoSession().getUserInfoDao();
    }

    private void insertUserinfo(UserInfo userInfo){
        getUserInfoDao().insert(userInfo);
    }

    public void deleteAllUserinfo(){
        getUserInfoDao().deleteAll();
    }
    public void deleteUseriInfo(UserInfo userInfo){
        getUserInfoDao().delete(userInfo);
    }
    public void saveListUserinfo(final List<UserInfo> list){
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

    public List<UserInfo> queryN(String where,String...params){
        return getUserInfoDao().queryRaw(where,params);
    }
    private void querydataBy() {////查询条件
       /* Query<User> nQuery = getUserInfoDao().queryBuilder()
//                .where(UserDao.Properties.Name.eq("user1"))//.where(UserDao.Properties.Id.notEq(999))
                *//*.orderAsc(UserInfoDao.Properties.State)*//*//.limit(5)//orderDesc
                .build();
        List<User> users = nQuery.list();
        Log.i("tag", "当前数量：" + users.size());
        for (int i = 0; i < users.size(); i++) {
            Log.i("tag", "结果：" + users.get(i).getId() + "," + users.get(i).getName() + "," + users.get(i).getAge() + "," + users.get(i).getIsBoy() + ";");
        }*/


    }

}
