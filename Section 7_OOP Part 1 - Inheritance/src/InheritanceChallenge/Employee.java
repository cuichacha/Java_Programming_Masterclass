package InheritanceChallenge;

/**
 * @author Will Dufresne
 * @Date: 2023-01-13 08:01
 * @Description: The employee class in inheritance challenge
 */
public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public String getHireDate() {
        return hireDate;
    }

}