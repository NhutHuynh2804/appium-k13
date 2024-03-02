package lab10_2;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int employeeId,double hourlyRate,int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}
