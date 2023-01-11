package Entities;

public class LegalPerson extends Person {
    private Integer employeesNumber;

    public LegalPerson() {
    }

    public LegalPerson(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getName());
        if (employeesNumber > 10) {
            sb.append(": " + (getAnnualIncome() * 0.16));
        } else {
            sb.append(": " + (getAnnualIncome() * 0.14));
        }

        return sb.toString();
    }

}
