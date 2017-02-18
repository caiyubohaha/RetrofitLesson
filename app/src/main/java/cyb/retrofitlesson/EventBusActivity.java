package cyb.retrofitlesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import cyb.bean.FirstEvent;
import cyb.utils.RxBus;
import rx.functions.Action1;

public class EventBusActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.activity_event_bus)
    RelativeLayout activityEventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus);
        ButterKnife.bind(this);
        RxView.clicks(btn).throttleFirst(2, TimeUnit.SECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                //改变文字
                FirstEvent firstEvent = new FirstEvent("改变吧，大傻逼");
                //EventBus.getDefault().post(firstEvent);
                RxBus.getDefault().post(firstEvent);
            }
        });
    }
}
