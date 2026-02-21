package Exercise3.entities;

public class IndividualPerson extends Person{

    private Double healthSpending;

    public IndividualPerson(){

    }

    public IndividualPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double tax(){
        if(annualIncome < 20000){
            return annualIncome * 0.15 - (healthSpending/2);
        } else {
            return annualIncome * 0.25 - (healthSpending/2);
        }
    }

}
