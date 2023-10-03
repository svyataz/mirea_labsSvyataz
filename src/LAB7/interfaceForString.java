package LAB7;

public interface interfaceForString {
    default public int a(String string){
        return string.length();
    }
    default String b(String string){
        String[] strings_list = string.split("");
        String ans = "";
        for(int i = 1; i < strings_list.length; i+=2){
            ans = ans + strings_list[i];
        }
        return ans;
    }
    default String v(String string){
        String[] strings_list = string.split("");
        String ans = "";
        for(int i = strings_list.length -1; i > -1; i--){
            ans = ans + strings_list[i];
        }
        return ans;
    }
}
