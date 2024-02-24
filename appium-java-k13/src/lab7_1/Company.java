package lab7_1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static double calculateTotalSalary(List<Employee> employees){
        double totalSalary =0.0;
        for (Employee employee : employees) {
            totalSalary+=employee.salary();
        }return totalSalary;
    }

    public static void main(String[] args) {
        List <Employee> employeeList = new ArrayList<>();
        //Add employees to list
        //Example
        for (int emp = 0; emp <3 ; emp++) {
            employeeList.add(new FullTimeEmployee());
        }
        for (int emp = 0; emp <2 ; emp++) {
            employeeList.add(new ContractEmployee());
        }
        double totalSalary=  calculateTotalSalary(employeeList);

        System.out.println("Total salary all of employees in company $:"+totalSalary);


    }
}
