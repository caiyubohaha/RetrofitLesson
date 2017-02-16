package cyb.bean;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

import java.util.List;

import cyb.retrofitlesson.InterfaceDate;
import cyb.retrofitlesson.mApplication;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * Created by user on 2017/2/16.
 */

public class CookiesManager implements CookieJar {
    private final PersistentCookieStore cookieStore = new PersistentCookieStore(mApplication.getInstance());

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        if (cookies != null && cookies.size() > 0) {
            for (Cookie item : cookies) {
                cookieStore.add(url, item);
            }
        }
        setWebCookis(cookies);
    }



    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        List<Cookie> cookies = cookieStore.get(url);
        return cookies;
    }
    /**保存到**/
    private void setWebCookis(List<Cookie> cookies) {
        CookieSyncManager
                .createInstance(mApplication.getInstance());
        CookieManager cookieManager = CookieManager
                .getInstance();
        cookieManager.setAcceptCookie(true);
        for (Cookie cookie : cookies) {
            String cookieString = cookie
                    .name()
                    + "="
                    + cookie.value()
                    + "; domain="
                    + cookie.domain();
            cookieManager.setCookie(
                    InterfaceDate.ROOT_URL,
                    cookieString);
        }
        CookieSyncManager.getInstance().sync();
    }
}