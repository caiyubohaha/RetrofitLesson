package cyb.comm;

public class InterfaceDate {
    public static final  String ROOT_URL = "http://101.200.182.221:80/";//ip地址
    public static final String LOGIN = "api/account/login";
    public static final String API_LOGIN = InterfaceDate.ROOT_URL + "api/account/login";     //新登录接口
    public static final String API_GETUSERINFO = ROOT_URL + "api/account/getuserinfo";     //获取个人信息
}