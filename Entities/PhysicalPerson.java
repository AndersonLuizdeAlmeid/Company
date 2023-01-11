package Entities;

public class PhysicalPerson extends Person {
    private Double healthExpenses;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    public Double healthExpenditures(double tax) {
        return healthExpenses * tax;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getName());
        if (getAnnualIncome() > 20000) {
            sb.append(": " + ((getAnnualIncome() * 0.25) - (healthExpenses * 0.5)));
        } else {
            sb.append(": " + ((getAnnualIncome() * 0.15) - (healthExpenses * 0.5)));
        }

        return sb.toString();
    }
}
