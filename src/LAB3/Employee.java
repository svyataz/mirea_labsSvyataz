package LAB3;

public class Employee {
    private String EmployeeFullname;
    private double EmployeeSalary;

    public String getEmployeeFullname() {
        return EmployeeFullname;
    }

    public void setEmployeeFullname(String employeeFullname) {
        EmployeeFullname = employeeFullname;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public Employee(String employeeFullname, double employeeSalary) {
        EmployeeFullname = employeeFullname;
        EmployeeSalary = employeeSalary;
    }
}
