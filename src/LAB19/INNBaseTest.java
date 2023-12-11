package LAB19;

import java.util.ArrayList;
import java.util.Arrays;

public class INNBaseTest {
    public static void main(String[] args){
        UserBase Users = new UserBase(retrieveEmployeeFromDatabase());
        Users.checkUserINN("BuevAD", 4345);
    }
    static ArrayList <User> retrieveEmployeeFromDatabase(){
        ArrayList<User> Users = new ArrayList<User>();
        Users.add(new User("BuevAD", 43345, 1));
        Users.add(new User("ZatulkoSA", 23325, 0));
        return Users;
    }
}
