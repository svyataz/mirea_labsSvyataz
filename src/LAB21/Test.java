package LAB21;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        String[] strings = {"Sima", "Tima", "Tema"};
        List<String> TestList = ArrayToList(strings);
        System.out.println(TestList);

        AllClass<String> AllClassInst = new AllClass<>(strings);
        System.out.println(AllClassInst.toString());

        System.out.println(alByIndex(strings, 2));

        Integer[] keys = {12, 13, 5, 2, 15, 11};
        Boolean[] values = {true, false, true, true, false, true};
        Solution<String, Boolean, Integer> TestSolution = new Solution<>(strings, values, keys);
        System.out.println(TestSolution.newArrayList());
        System.out.println(TestSolution.newHashSet());
        System.out.println(TestSolution.newHashMap());
    }
    static <E> List<E>  ArrayToList(E[] MyArray){
        List<E> MyList = new ArrayList<>();
        for (E i: MyArray) MyList.add(i);
        return MyList;
    }
    static <E> E alByIndex(E[] MyArray, int i){
        return MyArray[i];
    }
}
