package cyb.servers;

import cyb.bean.Result;
import cyb.bean.UserInfo;
import cyb.comm.InterfaceDate;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by user on 2017/2/16.
 */

public interface GetUserinfoServers {
    @GET(InterfaceDate.API_GETUSERINFO)
    Observable<Result<UserInfo>> getUserInfo(@Query("sessionId") String sessionId,
                                             @Query("id") String id,
                                             @Query("sign") String sign
                                             );
}
