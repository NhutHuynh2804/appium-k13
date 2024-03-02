package lab10_2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("John",100,50000));
        employees.add(new FullTimeEmployee("Alex",101,50000));
        employees.add(new ContractEmployee("Ann",200,4,50));
        employees.add(new ContractEmployee("May",201,5,40));
        double totalSalary=0;
        for (Employee employee : employees) {
            totalSalary+=employee.calculateSalary();
        }
        System.out.println("Total Salary of "+employees.size()+ "employees:$"+totalSalary);

    }
}
