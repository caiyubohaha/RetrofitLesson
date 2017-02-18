package cyb.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by user on 2017/2/17.
 */
@Entity
public class UserInfo {

    /**
     * ID : 6
     * CustomerKeyID : 1
     * DepartmentID : 7
     * UserID : Android002
     * CompanyNo : 001
     * departmentName : Andorid小组
     * companyName : 上海水点网络科技有限公司
     * IsUsing : true
     * UserName : Android002_1
     * Email : zhangpeng@a8app.com
     * Phone : 15251913387
     * Sex : 男
     * Birthday : /Date(725731200000)/
     * DisplayName : 张鹏
     * Country : null
     * State : null
     * Address : null
     * ZIP : null
     * ReMark : null
     * APN : null
     * IsEmailVerify : true
     * generatorLimit : 999999
     * HeadImgUrl : ../../Images/User/20170217_163155.png
     * Roles : 管理员;工程师;高级用户;普通用户;用户;经理;机组控制权限
     * Positions :
     * IsParentCustomer : true
     * IsFriend : false
     * DueTime : /Date(2524579200000)/
     * UnReadDiaryCount : 0
     * UnReadTaskCount : 0
     * UnReadSignCount : 0
     * IsManager : true
     * IsAdminRole : true
     */
    @Id
    private Long ID;
    private int CustomerKeyID;
    private int DepartmentID;
    private String UserID;
    private String CompanyNo;
    private String departmentName;
    private String companyName;
    private boolean IsUsing;
    private String UserName;
    private String Email;
    private String Phone;
    private String Sex;
    private String Birthday;
    private String DisplayName;
    private String Country;
    private String State;
    private String Address;
    private String ZIP;
    private String ReMark;
    private String APN;
    private boolean IsEmailVerify;
    private int generatorLimit;
    private String HeadImgUrl;
    private String Roles;
    private String Positions;
    private boolean IsParentCustomer;
    private boolean IsFriend;
    private String DueTime;
    private int UnReadDiaryCount;
    private int UnReadTaskCount;
    private int UnReadSignCount;
    private boolean IsManager;
    private boolean IsAdminRole;
    @Generated(hash = 437546500)
    public UserInfo(Long ID, int CustomerKeyID, int DepartmentID, String UserID,
            String CompanyNo, String departmentName, String companyName,
            boolean IsUsing, String UserName, String Email, String Phone,
            String Sex, String Birthday, String DisplayName, String Country,
            String State, String Address, String ZIP, String ReMark, String APN,
            boolean IsEmailVerify, int generatorLimit, String HeadImgUrl,
            String Roles, String Positions, boolean IsParentCustomer,
            boolean IsFriend, String DueTime, int UnReadDiaryCount,
            int UnReadTaskCount, int UnReadSignCount, boolean IsManager,
            boolean IsAdminRole) {
        this.ID = ID;
        this.CustomerKeyID = CustomerKeyID;
        this.DepartmentID = DepartmentID;
        this.UserID = UserID;
        this.CompanyNo = CompanyNo;
        this.departmentName = departmentName;
        this.companyName = companyName;
        this.IsUsing = IsUsing;
        this.UserName = UserName;
        this.Email = Email;
        this.Phone = Phone;
        this.Sex = Sex;
        this.Birthday = Birthday;
        this.DisplayName = DisplayName;
        this.Country = Country;
        this.State = State;
        this.Address = Address;
        this.ZIP = ZIP;
        this.ReMark = ReMark;
        this.APN = APN;
        this.IsEmailVerify = IsEmailVerify;
        this.generatorLimit = generatorLimit;
        this.HeadImgUrl = HeadImgUrl;
        this.Roles = Roles;
        this.Positions = Positions;
        this.IsParentCustomer = IsParentCustomer;
        this.IsFriend = IsFriend;
        this.DueTime = DueTime;
        this.UnReadDiaryCount = UnReadDiaryCount;
        this.UnReadTaskCount = UnReadTaskCount;
        this.UnReadSignCount = UnReadSignCount;
        this.IsManager = IsManager;
        this.IsAdminRole = IsAdminRole;
    }
    @Generated(hash = 1279772520)
    public UserInfo() {
    }
    public Long getID() {
        return this.ID;
    }
    public void setID(Long ID) {
        this.ID = ID;
    }
    public int getCustomerKeyID() {
        return this.CustomerKeyID;
    }
    public void setCustomerKeyID(int CustomerKeyID) {
        this.CustomerKeyID = CustomerKeyID;
    }
    public int getDepartmentID() {
        return this.DepartmentID;
    }
    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }
    public String getUserID() {
        return this.UserID;
    }
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }
    public String getCompanyNo() {
        return this.CompanyNo;
    }
    public void setCompanyNo(String CompanyNo) {
        this.CompanyNo = CompanyNo;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public boolean getIsUsing() {
        return this.IsUsing;
    }
    public void setIsUsing(boolean IsUsing) {
        this.IsUsing = IsUsing;
    }
    public String getUserName() {
        return this.UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getPhone() {
        return this.Phone;
    }
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public String getSex() {
        return this.Sex;
    }
    public void setSex(String Sex) {
        this.Sex = Sex;
    }
    public String getBirthday() {
        return this.Birthday;
    }
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }
    public String getDisplayName() {
        return this.DisplayName;
    }
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }
    public String getCountry() {
        return this.Country;
    }
    public void setCountry(String Country) {
        this.Country = Country;
    }
    public String getState() {
        return this.State;
    }
    public void setState(String State) {
        this.State = State;
    }
    public String getAddress() {
        return this.Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getZIP() {
        return this.ZIP;
    }
    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }
    public String getReMark() {
        return this.ReMark;
    }
    public void setReMark(String ReMark) {
        this.ReMark = ReMark;
    }
    public String getAPN() {
        return this.APN;
    }
    public void setAPN(String APN) {
        this.APN = APN;
    }
    public boolean getIsEmailVerify() {
        return this.IsEmailVerify;
    }
    public void setIsEmailVerify(boolean IsEmailVerify) {
        this.IsEmailVerify = IsEmailVerify;
    }
    public int getGeneratorLimit() {
        return this.generatorLimit;
    }
    public void setGeneratorLimit(int generatorLimit) {
        this.generatorLimit = generatorLimit;
    }
    public String getHeadImgUrl() {
        return this.HeadImgUrl;
    }
    public void setHeadImgUrl(String HeadImgUrl) {
        this.HeadImgUrl = HeadImgUrl;
    }
    public String getRoles() {
        return this.Roles;
    }
    public void setRoles(String Roles) {
        this.Roles = Roles;
    }
    public String getPositions() {
        return this.Positions;
    }
    public void setPositions(String Positions) {
        this.Positions = Positions;
    }
    public boolean getIsParentCustomer() {
        return this.IsParentCustomer;
    }
    public void setIsParentCustomer(boolean IsParentCustomer) {
        this.IsParentCustomer = IsParentCustomer;
    }
    public boolean getIsFriend() {
        return this.IsFriend;
    }
    public void setIsFriend(boolean IsFriend) {
        this.IsFriend = IsFriend;
    }
    public String getDueTime() {
        return this.DueTime;
    }
    public void setDueTime(String DueTime) {
        this.DueTime = DueTime;
    }
    public int getUnReadDiaryCount() {
        return this.UnReadDiaryCount;
    }
    public void setUnReadDiaryCount(int UnReadDiaryCount) {
        this.UnReadDiaryCount = UnReadDiaryCount;
    }
    public int getUnReadTaskCount() {
        return this.UnReadTaskCount;
    }
    public void setUnReadTaskCount(int UnReadTaskCount) {
        this.UnReadTaskCount = UnReadTaskCount;
    }
    public int getUnReadSignCount() {
        return this.UnReadSignCount;
    }
    public void setUnReadSignCount(int UnReadSignCount) {
        this.UnReadSignCount = UnReadSignCount;
    }
    public boolean getIsManager() {
        return this.IsManager;
    }
    public void setIsManager(boolean IsManager) {
        this.IsManager = IsManager;
    }
    public boolean getIsAdminRole() {
        return this.IsAdminRole;
    }
    public void setIsAdminRole(boolean IsAdminRole) {
        this.IsAdminRole = IsAdminRole;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "ID=" + ID +
                ", CustomerKeyID=" + CustomerKeyID +
                ", DepartmentID=" + DepartmentID +
                ", UserID='" + UserID + '\'' +
                ", CompanyNo='" + CompanyNo + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", IsUsing=" + IsUsing +
                ", UserName='" + UserName + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", DisplayName='" + DisplayName + '\'' +
                ", Country='" + Country + '\'' +
                ", State='" + State + '\'' +
                ", Address='" + Address + '\'' +
                ", ZIP='" + ZIP + '\'' +
                ", ReMark='" + ReMark + '\'' +
                ", APN='" + APN + '\'' +
                ", IsEmailVerify=" + IsEmailVerify +
                ", generatorLimit=" + generatorLimit +
                ", HeadImgUrl='" + HeadImgUrl + '\'' +
                ", Roles='" + Roles + '\'' +
                ", Positions='" + Positions + '\'' +
                ", IsParentCustomer=" + IsParentCustomer +
                ", IsFriend=" + IsFriend +
                ", DueTime='" + DueTime + '\'' +
                ", UnReadDiaryCount=" + UnReadDiaryCount +
                ", UnReadTaskCount=" + UnReadTaskCount +
                ", UnReadSignCount=" + UnReadSignCount +
                ", IsManager=" + IsManager +
                ", IsAdminRole=" + IsAdminRole +
                '}';
    }
}
