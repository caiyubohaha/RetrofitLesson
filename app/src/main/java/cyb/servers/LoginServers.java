package cyb.servers;

import cyb.bean.Login;
import cyb.bean.Result;
import cyb.comm.InterfaceDate;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by user on 2017/2/16.
 */

public interface LoginServers {
    @POST(InterfaceDate.LOGIN)                //@Post@Get                     如果出现类似{name},就是占位符号。下面用@Path（）代替
    Observable<Result<Login>> Login(
            @Query("customerid") String customerid ,
            @Query("userid") String userid ,
            @Query("password") String password,
            @Query("Language") String Language,
            @Query("sign")  String sign);
    //@Query@Path的区别：@Query是改变请求体的键值对，@Path改变请求网址的占位符
}
