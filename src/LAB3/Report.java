package LAB3;

import java.util.Arrays;

public class Report {

    public static void generateReport(Employee[] empoloyee_list){
        String buff;
        for(int i = 0; i < empoloyee_list.length; i++){
            buff = String.format("%15s salary - %.2f \n", empoloyee_list[i].getEmployeeFullname(),
                    empoloyee_list[i].getEmployeeSalary());
            System.out.print(buff);
        }
    }
}
