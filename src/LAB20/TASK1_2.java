package LAB20;

public class TASK1_2<T, V, K>{
    private T object;
    private V value;
    private K key;
    public TASK1_2(T object, V value, K key){
        this.object = object;
        this.value = value;
        this.key = key;
    }

    public T getObject() {
        return object;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }
    public void get_T_V_K_classes(){
        System.out.println("class object: " + object.getClass() + "\n" +
                "class value: " + value.getClass() + "\n" +
                "class key: " + key.getClass() + "\n"
        );
    }
}
