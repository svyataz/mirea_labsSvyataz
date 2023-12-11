package LAB19;

public class User {
    String UserFullName;
    int INN_number;
    int INN_status;
    public User(String UserFullName, int INN_number, int INN_status){
        this.UserFullName = UserFullName;
        this.INN_number = INN_number;
        this.INN_status = INN_status;
    }

    public String getUserFullName() {
        return UserFullName;
    }

    public void setUserFullName(String userFullName) {
        UserFullName = userFullName;
    }

    public int getINN_number() {
        return INN_number;
    }

    public void setINN_number(int INN_number) {
        this.INN_number = INN_number;
    }

    public int getINN_status() {
        return INN_status;
    }

    public void setINN_status(int INN_status) {
        this.INN_status = INN_status;
    }
}
