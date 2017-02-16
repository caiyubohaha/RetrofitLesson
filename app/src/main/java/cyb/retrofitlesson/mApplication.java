package cyb.retrofitlesson;

import android.app.Application;
import android.content.Context;

/**
 * Created by user on 2017/2/16.
 */

public class mApplication extends Application{
    public  static Context instance;

    public static Context getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance= getApplicationContext();
        //initRetrofit();

    }
    /**初始化cookis**/
    private void initRetrofit() {
        /*OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .cookieJar(new CookiesManager())
                .build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(InterfaceDate.ROOT_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();*/
    }
}
