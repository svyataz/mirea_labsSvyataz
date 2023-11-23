package LAB18;

public class ThrowsDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Null key in getDetails");
        }
    }
    public String getDetails(String key){
            if (key == null) {
                throw new NullPointerException("Null key in getDetails");
            }
        return "data for " + key;
    }
    public static void main(String[] args){
        ThrowsDemo inst = new ThrowsDemo();
        inst.printMessage(null);
    }
}
