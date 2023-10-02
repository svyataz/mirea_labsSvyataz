package LAB3;

public class  EmployeeTest {
    public static void main(String[] args){
        Employee[] empoloyee_list = new Employee[]{
                new Employee("Vova Shutov", 54000),
                new Employee("Kirill Ivanov", 120000),
                new Employee("Slava Shutov", 1200)};
        Report.generateReport(empoloyee_list);
    }
}
