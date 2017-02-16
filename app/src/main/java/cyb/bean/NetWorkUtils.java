package cyb.bean;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import cyb.retrofitlesson.InterfaceDate;
import okhttp3.Cookie;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by user on 2017/2/16.
 */

public class NetWorkUtils {
    private  static  Retrofit retrofit=null;
    private String COOKIES="cookies";
    private static final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();
    public  static Retrofit getRetrofit() {
        if (retrofit!=null){
            return retrofit;
        }else {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .cookieJar(new CookiesManager())
                    .build();
             return retrofit = new Retrofit.Builder().baseUrl(InterfaceDate.ROOT_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();
        }

    }








}
