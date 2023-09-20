package LAB1;

public class TASK1 {
    public static void main(String[] args){
        int test_list_sum = 0;
        int [] test_list = new int[]{1,1,2,3,5,8,13,21,34,55};
        for (int i = 0; i < test_list.length; i++){
            test_list_sum += test_list[i];
        }
        System.out.println("сумма элементов массива = " + test_list_sum +
                "\n" + "среднее арифметическое элементов массива= "
                + (test_list_sum / test_list.length));
    }
}
