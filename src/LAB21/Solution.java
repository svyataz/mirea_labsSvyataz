package LAB21;

import java.util.*;

public class Solution<T, V, K> {
    T[] objects;
    V[] values;
    K[] keys;
    public Solution(T[] objects, V[] values, K[] keys){
            this.objects = objects;
            this.values = values;
            this.keys = keys;
    }
    public ArrayList<T> newArrayList(){
        ArrayList<T> MyList = new ArrayList<>();
        for (T i: objects) MyList.add(i);
        return MyList;
    }
    public HashSet<T> newHashSet(){
        HashSet<T> MyHashSet = new HashSet<>();
        for (T i: objects) MyHashSet.add(i);
        return MyHashSet;
    }
    public Map<K,V> newHashMap(){
        Map<K,V> MyHashMap = new HashMap<>();
            for(int i = 0; i < keys.length; i++){
                MyHashMap.put(keys[i], values[i]);
            }
        return MyHashMap;
    }
}
