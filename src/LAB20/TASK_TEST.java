package LAB20;

public class TASK_TEST {
    public static void main(String[] args){
        TASK1_2<String, Boolean, Integer> Test_inst =
                new TASK1_2<>("I am here", true, 12);
        System.out.println(Test_inst.getObject());
        System.out.println(Test_inst.getKey());
        System.out.println(Test_inst.getValue());
        Test_inst.get_T_V_K_classes();
    }
}
