package InheritanceChallenge;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Will Dufresne
 * @Date: 2023-01-13 07:49
 * @Description: The worker class in inheritance challenge
 */
public class Worker {
    protected String name;
    protected String birthDate;
    protected String endDate;

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    protected int getAge() {
        return Period.between(LocalDate.parse(birthDate), LocalDate.now()).getYears();
    }

    protected double collectPay() {
        return 0;
    }

    protected void terminate(String endDate) {
        setEndDate(endDate);
    }

}