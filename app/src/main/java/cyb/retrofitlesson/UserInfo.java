package cyb.retrofitlesson;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by user on 2017/2/16.
 */

public class UserInfo implements Parcelable, Serializable {
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

        private int ID;
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

        public UserInfo() {
        }

        public UserInfo(int ID) {
            this.ID = ID;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getCustomerKeyID() {
            return CustomerKeyID;
        }

        public void setCustomerKeyID(int customerKeyID) {
            CustomerKeyID = customerKeyID;
        }

        public int getDepartmentID() {
            return DepartmentID;
        }

        public void setDepartmentID(int departmentID) {
            DepartmentID = departmentID;
        }

        public String getUserID() {
            return UserID;
        }

        public void setUserID(String userID) {
            UserID = userID;
        }

        public String getCompanyNo() {
            return CompanyNo;
        }

        public void setCompanyNo(String companyNo) {
            CompanyNo = companyNo;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public boolean isUsing() {
            return IsUsing;
        }

        public void setUsing(boolean using) {
            IsUsing = using;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPhone() {
            return Phone;
        }

        public void setPhone(String phone) {
            Phone = phone;
        }

        public String getSex() {
            return Sex;
        }

        public void setSex(String sex) {
            Sex = sex;
        }

        public String getBirthday() {
            return Birthday;
        }

        public void setBirthday(String birthday) {
            Birthday = birthday;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getZIP() {
            return ZIP;
        }

        public void setZIP(String ZIP) {
            this.ZIP = ZIP;
        }

        public String getReMark() {
            return ReMark;
        }

        public void setReMark(String reMark) {
            ReMark = reMark;
        }

        public String getAPN() {
            return APN;
        }

        public void setAPN(String APN) {
            this.APN = APN;
        }

        public boolean isEmailVerify() {
            return IsEmailVerify;
        }

        public void setEmailVerify(boolean emailVerify) {
            IsEmailVerify = emailVerify;
        }

        public int getGeneratorLimit() {
            return generatorLimit;
        }

        public void setGeneratorLimit(int generatorLimit) {
            this.generatorLimit = generatorLimit;
        }

        public String getHeadImgUrl() {
            return HeadImgUrl;
        }

        public void setHeadImgUrl(String headImgUrl) {
            HeadImgUrl = headImgUrl;
        }

        public String getRoles() {
            return Roles;
        }

        public void setRoles(String roles) {
            Roles = roles;
        }

        public boolean isParentCustomer() {
            return IsParentCustomer;
        }

        public void setParentCustomer(boolean parentCustomer) {
            IsParentCustomer = parentCustomer;
        }

        public String getDisplayName() {
            return DisplayName;
        }

        public void setDisplayName(String displayName) {
            DisplayName = displayName;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public boolean isManager() {
            return IsManager;
        }

        public void setManager(boolean manager) {
            IsManager = manager;
        }

        public int getUnReadDiaryCount() {
            return UnReadDiaryCount;
        }

        public void setUnReadDiaryCount(int unReadDiaryCount) {
            UnReadDiaryCount = unReadDiaryCount;
        }

        public int getUnReadTaskCount() {
            return UnReadTaskCount;
        }

        public void setUnReadTaskCount(int unReadTaskCount) {
            UnReadTaskCount = unReadTaskCount;
        }

        public int getUnReadSignCount() {
            return UnReadSignCount;
        }

        public void setUnReadSignCount(int unReadSignCount) {
            UnReadSignCount = unReadSignCount;
        }


        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public boolean isAdminRole() {
            return IsAdminRole;
        }

        public void setAdminRole(boolean adminRole) {
            IsAdminRole = adminRole;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.ID);
            dest.writeInt(this.CustomerKeyID);
            dest.writeInt(this.DepartmentID);
            dest.writeString(this.UserID);
            dest.writeString(this.CompanyNo);
            dest.writeString(this.departmentName);
            dest.writeByte(this.IsUsing ? (byte) 1 : (byte) 0);
            dest.writeString(this.Email);
            dest.writeString(this.Phone);
            dest.writeString(this.Sex);
            dest.writeString(this.Birthday);
            dest.writeString(this.Country);
            dest.writeString(this.State);
            dest.writeString(this.Address);
            dest.writeString(this.ZIP);
            dest.writeString(this.ReMark);
            dest.writeString(this.APN);
            dest.writeByte(this.IsEmailVerify ? (byte) 1 : (byte) 0);
            dest.writeInt(this.generatorLimit);
            dest.writeString(this.HeadImgUrl);
            dest.writeString(this.Roles);
            dest.writeByte(this.IsParentCustomer ? (byte) 1 : (byte) 0);
            dest.writeString(this.DisplayName);
            dest.writeString(this.UserName);
            dest.writeByte(this.IsManager ? (byte) 1 : (byte) 0);
            dest.writeString(this.companyName);
            dest.writeByte(this.IsAdminRole ? (byte) 1 : (byte) 0);
            dest.writeInt(this.UnReadDiaryCount);
            dest.writeInt(this.UnReadTaskCount);
            dest.writeInt(this.UnReadSignCount);
        }

        protected UserInfo(Parcel in) {
            this.ID = in.readInt();
            this.CustomerKeyID = in.readInt();
            this.DepartmentID = in.readInt();
            this.UserID = in.readString();
            this.CompanyNo = in.readString();
            this.departmentName = in.readString();
            this.IsUsing = in.readByte() != 0;
            this.Email = in.readString();
            this.Phone = in.readString();
            this.Sex = in.readString();
            this.Birthday = in.readString();
            this.Country = in.readString();
            this.State = in.readString();
            this.Address = in.readString();
            this.ZIP = in.readString();
            this.ReMark = in.readString();
            this.APN = in.readString();
            this.IsEmailVerify = in.readByte() != 0;
            this.generatorLimit = in.readInt();
            this.HeadImgUrl = in.readString();
            this.Roles = in.readString();
            this.IsParentCustomer = in.readByte() != 0;
            this.DisplayName = in.readString();
            this.UserName = in.readString();
            this.IsManager = in.readByte() != 0;
            this.companyName = in.readString();
            this.IsAdminRole = in.readByte() != 0;
            this.UnReadDiaryCount = in.readInt();
            this.UnReadTaskCount = in.readInt();
            this.UnReadSignCount = in.readInt();
        }

        public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
            @Override
            public UserInfo createFromParcel(Parcel source) {
                return new UserInfo(source);
            }

            @Override
            public UserInfo[] newArray(int size) {
                return new UserInfo[size];
            }
        };

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            UserInfo userInfo = (UserInfo) o;

            return ID == userInfo.ID;

        }

        @Override
        public int hashCode() {
            return ID;
        }


}
