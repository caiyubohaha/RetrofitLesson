package cyb.retrofitlesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.greendao.UserInfoDaoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cyb.bean.UserInfo;
import cyb.comm.InterfaceDate;
import cyb.utils.GlideRoundTransform;

public class UserInfoActivity extends AppCompatActivity {

    @BindView(R.id.iv_heard)
    ImageView ivHeard;
    @BindView(R.id.tv_message)
    TextView tvMessage;
    @BindView(R.id.activity_user_info)
    RelativeLayout activityUserInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ButterKnife.bind(this);
        getuserinfo();
    }

    public void  getuserinfo() {
        Toast.makeText(this, "获取用户信息成功", Toast.LENGTH_SHORT).show();
        Log.i("8888","查询数据库".toString()) ;
        List<UserInfo> list = UserInfoDaoUtils.querydataBy("蔡煜波");
        if (list!=null&&list.size()!=0) {
            UserInfo userinfo = list.get(0);
            tvMessage.setText(list.get(0).toString());
            Log.i("8888",list.get(0).toString()) ;

            String imgurl = InterfaceDate.ROOT_URL+ userinfo.getHeadImgUrl();



            Glide.with(this).load(imgurl).centerCrop().placeholder(R.mipmap.ic_launcher).transform(new GlideRoundTransform(this,8)).crossFade().into(ivHeard);

        }
    }

}


