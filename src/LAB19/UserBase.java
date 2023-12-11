package LAB19;

import java.util.ArrayList;

public class UserBase {
    ArrayList <User> UserList;
    public UserBase(ArrayList <User> UserList){
        this.UserList = UserList;
    }
    public User getUserByFullName(String UserName) {
        try {
            for (int i = 0; i < UserList.size(); i++) {
                if (UserName.equals(UserList.get(i).getUserFullName())) {
                    return UserList.get(i);
                }
            }
            throw new RuntimeException();
        }catch (RuntimeException e){throw new WrongNameException("wrong entered name");}
    }
    public void setUser(User newUser){
        UserList.add(newUser);
    }
    public int checkUserINN(String UserName, int INN_number){
        User user = getUserByFullName(UserName);
        try {
            if (!(user.getINN_number() == INN_number && user.getINN_status() == 1)){
                throw new RuntimeException();
            }
        }catch (RuntimeException e){throw new invalidINN("invalidINN");}
        return 1;
    }
}
