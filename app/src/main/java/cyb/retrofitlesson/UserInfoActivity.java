package cyb.retrofitlesson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.greendao.UserInfoDaoUtils;
import com.jakewharton.rxbinding.view.RxView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import cyb.bean.FirstEvent;
import cyb.bean.UserInfo;
import cyb.comm.InterfaceDate;
import cyb.utils.GlideRoundTransform;
import rx.functions.Action1;

public class UserInfoActivity extends AppCompatActivity {

    @BindView(R.id.iv_heard)
    ImageView ivHeard;
    @BindView(R.id.tv_message)
    TextView tvMessage;
    @BindView(R.id.activity_user_info)
    RelativeLayout activityUserInfo;
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.tv_Eventbus)
    TextView tvEventbus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        EventBus.getDefault().register(this);
        ButterKnife.bind(this);
        getuserinfo();
        initEvent();


    }
    /****/
    private void initEvent() {
        RxView.clicks(btn).throttleFirst(2, TimeUnit.SECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                Intent intent = new Intent(UserInfoActivity.this,EventBusActivity.class);
                startActivity(intent);
            }
        });
    }

    public void getuserinfo() {
        Toast.makeText(this, "获取用户信息成功", Toast.LENGTH_SHORT).show();
        Log.i("8888", "查询数据库".toString());
        List<UserInfo> list = UserInfoDaoUtils.querydataBy("蔡煜波");
        if (list != null && list.size() != 0) {
            UserInfo userinfo = list.get(0);
            tvMessage.setText(list.get(0).toString());
            Log.i("8888", list.get(0).toString());

            String imgurl = InterfaceDate.ROOT_URL + userinfo.getHeadImgUrl();


            Glide.with(this).load(imgurl).centerCrop().placeholder(R.mipmap.ic_launcher).transform(new GlideRoundTransform(this, 8)).crossFade().into(ivHeard);

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    /*public void onEventMainThread(FirstEvent event){
        Toast.makeText(this, "收到消息"+ event.getText(), Toast.LENGTH_SHORT).show();
        tvEventbus.setText(event.getText());
    }*/

    @Subscribe
    public void onEventMainThread(FirstEvent event){
        Toast.makeText(this, "UserInfoActivity收到消息"+event.getText(), Toast.LENGTH_SHORT).show();
        tvEventbus.setText(event.getText());
    }

}


