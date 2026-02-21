package Exercise3.entities;

public class JuridicalPerson extends Person{

    private Double employees;

    public JuridicalPerson(){

    }

    public JuridicalPerson(String name, Double annualIncome, Double employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Double getEmployees() {
        return employees;
    }

    public void setEmployees(Double employees) {
        this.employees = employees;
    }

    @Override
    public Double tax(){
        if(employees <= 10){
            return annualIncome * 0.16;
        } else{
            return annualIncome * 0.14;
        }
    }
}
