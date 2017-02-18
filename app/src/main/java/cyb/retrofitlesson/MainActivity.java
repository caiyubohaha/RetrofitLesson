package cyb.retrofitlesson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hwangjr.rxbus.annotation.Subscribe;
import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import cyb.bean.FirstEvent;
import cyb.bean.Login;
import cyb.bean.Result;
import cyb.bean.UserInfo;
import cyb.comm.Constant;
import cyb.cookisutils.NetWorkUtils;
import cyb.servers.GetUserinfoServers;
import cyb.servers.LoginServers;
import cyb.utils.RxBus;
import cyb.utils.Util;
import retrofit2.Retrofit;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

import static com.greendao.UserInfoDaoUtils.insertOrReplaceUserinfo;

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
    String companyid = null;
    String userid = null;
    String password = null;
    @BindView(R.id.tv_Eventbus)
    TextView tvEventbus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // EventBus.getDefault().register(this);
        RxBus.getDefault().register(this);
        ButterKnife.bind(this);
        initEvent();

        final Retrofit retrofit = NetWorkUtils.getRetrofit();

        Observable<Result<Login>> call = (Observable<Result<Login>>) retrofit.create(LoginServers.class).Login("001",
                "Android001", "111111", "1",
                Util.getSign("customerid" + "001" + "userid" +
                        "Android001" + "password" + "111111"));
        call.flatMap(new Func1<Result<Login>, Observable<Result<UserInfo>>>() {
            @Override
            public Observable<Result<UserInfo>> call(Result<Login> loginResult) {
                Constant.SESSION_ID = loginResult.getData().getSessionId();
                Log.i("8888", "loginResult.getCode()=" + loginResult.getCode());
                if (loginResult.getCode() == 1) {
                    //Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    return retrofit.create(GetUserinfoServers.class).getUserInfo(Constant.SESSION_ID, "0",
                            Util.getSign("sessionId" + Constant.SESSION_ID + "id" + "0"));
                } else {
                    Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();

                }
                return null;
            }
        }).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Result<UserInfo>>() {
                    @Override
                    public void call(Result<UserInfo> userinfo) {
                        Constant.userInfo = userinfo.getData();
                        //存入数据库
                        insertOrReplaceUserinfo(userinfo.getData());
                        //启动登陆界面


                        Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
                        startActivity(intent);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });

    }

    private void initEvent() {
        Observable<Void> observable = RxView.clicks(btnLogin).share();
        Subscription subscription = observable.throttleFirst(2, TimeUnit.SECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                Toast.makeText(MainActivity.this, "正在登录", Toast.LENGTH_SHORT).show();
            }
        });

        Subscription subscription2 = observable.throttleFirst(2, TimeUnit.SECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                // Toast.makeText(MainActivity.this, "点击了登录2", Toast.LENGTH_SHORT).show();

               /* final Retrofit retrofit = NetWorkUtils.getRetrofit();

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
                            Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();

                        }
                        return null;
                    }
                }).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Result<UserInfo>>() {
                    @Override
                    public void call(Result<UserInfo> userinfo) {
                        Constant.userInfo = userinfo.getData();
                            //存入数据库
                        insertOrReplaceUserinfo(userinfo.getData());
                            //启动登陆界面
                        Toast.makeText(MainActivity.this, "获取用户信息成功", Toast.LENGTH_SHORT).show();
                        Log.i("8888","查询数据库".toString()) ;
                        List<UserInfo> list = UserInfoDaoUtils.querydataBy("蔡煜波");
                        if (list!=null&&list.size()!=0) {

                            //tvUserinomessage.setText(userinfo.toString());
                            Log.i("8888",list.get(0).toString()) ;
                        }
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });*/
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //EventBus.getDefault().unregister(this);
        RxBus.getDefault().unregister(this);
    }

    @Subscribe
    public void eat(FirstEvent s) {
        tvEventbus.setText(s.getText());
        Toast.makeText(this, this.getClass().getName()+"收到", Toast.LENGTH_SHORT).show();
    }
}
