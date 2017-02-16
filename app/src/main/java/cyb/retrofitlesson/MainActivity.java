package cyb.retrofitlesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import cyb.bean.Constant;
import cyb.bean.Login;
import cyb.bean.NetWorkUtils;
import cyb.bean.Result;
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
                        if (loginResult.getCode()==1){
                            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                            return retrofit.create(GetUserinfoServers.class).getUserInfo(Constant.SESSION_ID,"0",
                                    Util.getSign("sessionId"+Constant.SESSION_ID+"id"+"0"));
                        }
                        return null;
                    }
                }).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Result<UserInfo>>() {
                    @Override
                    public void call(Result<UserInfo> userinfo) {

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
}
