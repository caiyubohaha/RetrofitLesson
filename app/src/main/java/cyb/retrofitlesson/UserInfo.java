package cyb.retrofitlesson;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by user on 2017/2/16.
 */
@Entity
public class UserInfo  {
        /***
         * "ID": 21,
         * "CustomerKeyID": 7,
         * "DepartmentID": 5,
         * "UserID": "Android002",
         * "CompanyNo": "001",
         * "departmentName": "系统支持部",
         * "IsUsing": true,
         * "Email": "312312@qq.com",
         * "Phone": null,
         * "Sex": null,
         * "Birthday": "/Date(-2209017600000)/",
         * "DisplayName": "张鹏",
         * "Country": null,
         * "State": null,
         * "Address": null,
         * "ZIP": null,
         * "ReMark": null,
         * "APN": null,
         * "IsEmailVerify": true,
         * "generatorLimit": 999999,
         * "HeadImgUrl": null,
         * UserName=Android001_1
         * "Roles": "Admin",
         * "IsParentCustomer": true,
         * "UnReadDiaryCount": 18
         */
        @Id
        private Long ID;
        private int CustomerKeyID;
        private int DepartmentID;
        private String UserID;
        private String CompanyNo;
        private String departmentName;
        private boolean IsUsing;
        private String Email;
        private String Phone;
        private String Sex;
        private String Birthday;
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
        private boolean IsParentCustomer;

        private String DisplayName;
        private String UserName;
        private boolean IsManager;
        private String companyName;


        private boolean IsAdminRole;

        /**
         * 日志未读数
         **/
        private int UnReadDiaryCount;
        /**
         * 任务未读数
         **/
        private int UnReadTaskCount;
        /**
         * 任务未读数
         **/
        private int UnReadSignCount;



        @Generated(hash = 1421753115)
        public UserInfo(Long ID, int CustomerKeyID, int DepartmentID, String UserID,
                String CompanyNo, String departmentName, boolean IsUsing, String Email,
                String Phone, String Sex, String Birthday, String Country, String State,
                String Address, String ZIP, String ReMark, String APN,
                boolean IsEmailVerify, int generatorLimit, String HeadImgUrl,
                String Roles, boolean IsParentCustomer, String DisplayName,
                String UserName, boolean IsManager, String companyName,
                boolean IsAdminRole, int UnReadDiaryCount, int UnReadTaskCount,
                int UnReadSignCount) {
            this.ID = ID;
            this.CustomerKeyID = CustomerKeyID;
            this.DepartmentID = DepartmentID;
            this.UserID = UserID;
            this.CompanyNo = CompanyNo;
            this.departmentName = departmentName;
            this.IsUsing = IsUsing;
            this.Email = Email;
            this.Phone = Phone;
            this.Sex = Sex;
            this.Birthday = Birthday;
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
            this.IsParentCustomer = IsParentCustomer;
            this.DisplayName = DisplayName;
            this.UserName = UserName;
            this.IsManager = IsManager;
            this.companyName = companyName;
            this.IsAdminRole = IsAdminRole;
            this.UnReadDiaryCount = UnReadDiaryCount;
            this.UnReadTaskCount = UnReadTaskCount;
            this.UnReadSignCount = UnReadSignCount;
        }



        @Generated(hash = 1279772520)
        public UserInfo() {
        }

    

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            UserInfo userInfo = (UserInfo) o;

            return ID == userInfo.ID;

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



        public boolean getIsUsing() {
            return this.IsUsing;
        }



        public void setIsUsing(boolean IsUsing) {
            this.IsUsing = IsUsing;
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



        public boolean getIsParentCustomer() {
            return this.IsParentCustomer;
        }



        public void setIsParentCustomer(boolean IsParentCustomer) {
            this.IsParentCustomer = IsParentCustomer;
        }



        public String getDisplayName() {
            return this.DisplayName;
        }



        public void setDisplayName(String DisplayName) {
            this.DisplayName = DisplayName;
        }



        public String getUserName() {
            return this.UserName;
        }



        public void setUserName(String UserName) {
            this.UserName = UserName;
        }



        public boolean getIsManager() {
            return this.IsManager;
        }



        public void setIsManager(boolean IsManager) {
            this.IsManager = IsManager;
        }



        public String getCompanyName() {
            return this.companyName;
        }



        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }



        public boolean getIsAdminRole() {
            return this.IsAdminRole;
        }



        public void setIsAdminRole(boolean IsAdminRole) {
            this.IsAdminRole = IsAdminRole;
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


}
