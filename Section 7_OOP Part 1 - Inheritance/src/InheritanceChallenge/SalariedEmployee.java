package InheritanceChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-13 08:02
 * @Description: The salaried employee class in inheritance challenge
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public void retire(String endDate) {
        super.terminate(endDate);
        setRetired(true);
    }
}