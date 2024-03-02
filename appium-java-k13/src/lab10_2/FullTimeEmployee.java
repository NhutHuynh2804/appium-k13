package lab10_2;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    public FullTimeEmployee(String name, int employeeId,double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
